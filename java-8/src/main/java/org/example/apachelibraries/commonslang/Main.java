package org.example.apachelibraries.commonslang;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /*Create a program that manipulates strings using methods from Apache Commons Lang's StringUtils class.

        Requirements:
        Import the StringUtils class from Apache Commons Lang library.
        Create a string variable with some text.

        Tasks:
        Use StringUtils methods to perform the following tasks:
        Check if the string is empty or blank.
        Capitalize the first letter of the string.

        Reverse the string.
        Replace a specific character in the string.
        Count the occurrences of a certain character in the string.*/

        String text = "example text";
        System.out.println("isEmpty: " + StringUtils.isEmpty(text));
        //text.isBlank(); // this will throw an exception if "text" is null
        String[] str =  StringUtils.split(text, " ");
        System.out.println("split: " + Arrays.toString(str));

        System.out.println("join: " + StringUtils.join(str, "-"));

        System.out.println("Capitalize the first letter of this string: " + StringUtils.capitalize(text));
        System.out.println("Replace a specific character: " + StringUtils.replace(text, "x", "X"));
        System.out.println("Count occurrences: " + StringUtils.countMatches(text, "e"));
        System.out.println(StringUtils.trim(text));
        System.out.println(StringUtils.strip(text));
        System.out.println(StringUtils.right(text, 3));
        System.out.println(StringUtils.left(text, 3));


    }
}
