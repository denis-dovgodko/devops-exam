package com.testapp.testapp;

import com.testapp.testapp.calc.Progression;

import java.time.DayOfWeek;
import java.util.*;

public class TestApp {
    public static void main(String[] args) {
        int number;
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Log in. Please, enter number n items quantity for progression");
            try {
                number = Integer.parseInt(in.nextLine());
                System.out.println("Success!");
                break;
            } catch (NumberFormatException e) {
                System.out.println("Error: Please, retype n items quantity again");
            }
        }
        Progression progression = new Progression(number);
        System.out.println(progression.CalcSumm());
    }
}

