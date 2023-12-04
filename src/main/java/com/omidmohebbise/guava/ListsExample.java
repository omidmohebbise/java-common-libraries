package com.omidmohebbise.guava;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;

import java.util.List;

public class ListsExample {
    public static void main(String[] args) {
        // Creating a list using Guava Lists utility
        List<String> programmingLanguages = Lists.newArrayList("Java", "Python", "JavaScript", "C++", "Ruby");

        // Joining elements of the list into a single string using Guava Joiner utility
        String languagesString = Joiner.on(", ").join(programmingLanguages);

        // Printing the result
        System.out.println("Popular programming languages: " + languagesString);

    }
}
