package com.revature.java_basics;

public class BasicsDriverPart2 {
    public static void main(String[] args) {
        // More For Loops
        int result = 0; // 0
        result = 5 + 7; // 12
        result += 8; // 12 + 8 == 20

        // i++ increments by 1, i+=x increments by x
        for (int i = 1; i <= 20; i += 3) {
            if (i % 2 == 0) { // '%' modulo gives the remainder after division
                System.out.println(i + " is EVEN");
            } else {
                System.out.println(i + " is ODD");
            }
        }
        
        System.out.println(result++); //increments AFTER execution of the line
        System.out.println(result--);
        System.out.println(result += 2);
        System.out.println(result -= 2);
        System.out.println(result *= 2);
        System.out.println(result /= 2);
        System.out.println(result %= 2);



    }
}
