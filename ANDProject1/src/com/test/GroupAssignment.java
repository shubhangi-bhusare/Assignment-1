package com.test;

import java.util.Scanner;

public class GroupAssignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the roll number of the student: ");
        int rollNumber = scanner.nextInt();

        String group = determineGroup(rollNumber);
        System.out.println("The student belongs to the " + group + " group.");
    }

    public static String determineGroup(int rollNumber) {
        int remainder = rollNumber % 4;

        if (remainder == 1) {
            return "Sapphire";
        } else if (remainder == 2) {
            return "Perl";
        } else if (remainder == 3) {
            return "Ruby";
        } else {
            return "Emerald";
        }
    }
}
