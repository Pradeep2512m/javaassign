package com.harman.project001.javas;
import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter birth year for check leap: ");
        int year = sc.nextInt();
        boolean is_Leap = false;

        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {

            System.out.println(year + " is a leap year ");
        } else {
            System.out.println(year + " is not a leap year ");
        }
    }
}

