// package keyword defines where the file or class is located
package com.revature.java_basics;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");

        // Primitives & Variables
        // Variables are locations in memory given a specific name
        // Primitives are basic holders of a value that can be assigned to a variable
        int classSize; // variable declaration, default value is 0
        classSize = 24; // assigned value to 24
        System.out.println(classSize); // print out the value for 'classSize'

        boolean isTheClassCool = true; // assign boolean value (true/false)
        System.out.println("The Class is cool: " + isTheClassCool); // prints "The Class is cool: true"

        byte num1 = 100; // any number -2^7 to 2^7-1 inclusive
        short num2 = 1000; // any number -2^15 to 2^15-1 inclusive
        long num3 = 1000000000000000000L; // any number -2^63 to 2^63-1 inclusive
        float num4 = (float) 4/3; // non-specific decimal values
        double num5 = (double) 4/3; // more specific decimal values


        System.out.println(num1); // use ctrl+d, shortcut to duplicate lines
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);

        // all characters are single unicode values
        char firstCharacter = 'a';
        char secondCharacter = 'A';

        // Class String is immutable, cannot change the value in memory without reassignment
        String bob1 = "Bob";
        String bob2 = new String("Bob");
        String bob3 = "Bob";

        // bob1 is not equal to bob2, but bob1 is equal to bob3
        System.out.println(bob1 == bob2); // Not in the same location in the STRING POOL
        System.out.println(bob1 == bob3); // In the same location in the STRING POOL

        //equals method compares value instead of location in memory
        System.out.println(bob1.equals(bob3)); // "Bob" is in the String Pool, this returns TRUE

        // Memory is made up of the 'Stack' and 'Heap'
        // Stack stores functions and primitives
        // Heap stores objects (which includes String objects in the STRING POOL)

        int x = 1;
        int y = 1;
        int z = 2;

        // IF Statements
        if (x == y) { // '==' is the EQUALS relational sign
            System.out.println("x equals y");
        } else {
            System.out.println("x does not equal y"); // this line will not execute
        }

        if (x != z) { // '!=' is the NOT EQUALS relational sign.
            System.out.println("x does not equal z"); // x is NOT equal to z
        } else {
            System.out.println("x equals z"); // this line will not execute
        }

        // FOR Loops
        for (int i = 0; i < 10; i++) { // i++ is shorthand for i=i+1;
            System.out.println(i);
            // prints numbers 0-9 on separate lines
        }



    }
}
