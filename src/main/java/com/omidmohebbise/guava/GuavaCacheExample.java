package com.omidmohebbise.guava;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;

import java.util.concurrent.TimeUnit;

public class GuavaCacheExample {
    public static void main(String[] args) throws InterruptedException {
        // Create a cache with a maximum size of 100, and an expiration time of 10 minutes
        Cache<String, String> cache = CacheBuilder.newBuilder()
                .maximumSize(100)
                .expireAfterWrite(10, TimeUnit.SECONDS)
                .build();

        // Put values into the cache
        cache.put("key1", "value1");
        cache.put("key2", "value2");
        cache.put("key3", "value3");

        // Retrieve values from the cache
        System.out.println("Value for key1: " + cache.getIfPresent("key1"));
        System.out.println("Value for key2: " + cache.getIfPresent("key2"));

        // Wait for 11 second to see that the entry with key1 is automatically evicted

        Thread.sleep(11 * 1000);


        // Check if key1 is still in the cache after expiration
        System.out.println("Value for key1 after expiration: " + cache.getIfPresent("key1"));

    }
}
