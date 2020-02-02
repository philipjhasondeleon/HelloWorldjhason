package com.lambton;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //DISPLAY ARRAY
        /*
        String [] cars = {"toyoya","asdasd"};
        System.out.println(cars.length);
        System.out.println(Arrays.toString(cars));

        int [] numbers = {3,2,1,4,5};
        Arrays.sort(numbers); //to sort numbers
        System.out.println(Arrays.toString(numbers)); //must import the package to use the method
        */


        //CASTING
        /*
        double x = 1.1;
        int y = (int)x + 2;
        System.out.println(y);

        //String to int
        String x = "11";
        int y = Integer.parseInt(x) + 2;
        System.out.println(y);
         */

        //MATH
        /*
        int result = (int) (Math.random() *100);  //need to cast because Math.random must be double
        System.out.println(result);               //min(),max(), round()
         */

        //FORMATTING NUMBERS
        /*
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(1234567.891);
        System.out.println(result);
         */
                    //OR
        /*
        String result =  NumberFormat.getPercentInstance().format(0.1);
        System.out.println(result);
        */

        //READING INPUT
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner.nextLine().trim();  //chain method trim() use to remove spaces at the beginning
        System.out.println("You are:" + name);
         */

        //Mortgage calculator
        /*
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        System.out.print("Period (Years): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 +monthlyInterest, numberOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(123115132);
        System.out.println("Mortgage: " + mortgageFormatted);
         */
//
    }

}
