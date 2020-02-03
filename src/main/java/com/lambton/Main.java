package com.lambton;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //DISPLAY ARRAY======================================
        /*
        String [] cars = {"toyoya","asdasd"};
        System.out.println(cars.length);
        System.out.println(Arrays.toString(cars));

        int [] numbers = {3,2,1,4,5};
        Arrays.sort(numbers); //to sort numbers
        System.out.println(Arrays.toString(numbers)); //must import the package to use the method
        */


        //CASTING=================================
        /*
        double x = 1.1;
        int y = (int)x + 2;
        System.out.println(y);

        //String to int===========================
        String x = "11";
        int y = Integer.parseInt(x) + 2;
        System.out.println(y);
         */

        //MATH===================================
        /*
        int result = (int) (Math.random() *100);  //need to cast because Math.random must be double
        System.out.println(result);               //min(),max(), round()
         */

        //FORMATTING NUMBERS=====================
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

        //READING INPUT================================
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner.nextLine().trim();  //chain method trim() use to remove spaces at the beginning
        System.out.println("You are:" + name);
         */

        //MORTGAGE CALCULATOR================================
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

        //IF STATEMENT==================================
        /*
        int temp = 23;
        if (temp > 30){
            System.out.println("It's a hot day");
            System.out.println("Drink Water");
        }
        else if (temp >20)
            System.out.println("Beautiful Day");
        else
            System.out.println("Cold Day");
        */


        /*
        int income = 120_000;
        boolean hasHighIncome;
        if (income > 100_000)
            hasHighIncome = true;
        else
            hasHighIncome = false;
        System.out.println(hasHighIncome);
        */
                //OR
        /*
        int income = 120_000;
        boolean hasHighIncome = (income > 100_000);
        System.out.println(hasHighIncome);
         */

        //TERNARY OPERATOR =======================================
        /*
        int income = 120_000;
        String className = income > 100_000 ? "First" : "Economy";
        System.out.println(className);
        */


        //PRACTICE FIZZBUZZ=======================================
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int number = scanner.nextInt();

        if(number % 5 == 0 && number % 3 == 0 )
            System.out.println("FizzBuzz");
        else if(number %5 == 0)
            System.out.println("Fizz");
        else if(number % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(number);
         */

        //FOR LOOPS ======================================================
        /*
        for (int i = 0; i<5; i++)
            System.out.println("Hello World" + i);
        */

        //WHILE LOOP =======================================================
        /*
        int i = 0;
        while (i<5)
        {
            System.out.println("Hello World");
            i++;
        }
         */


        //WHILE LOOP TILL GET THE VALUE
        /*
        Scanner scanner = new Scanner (System.in);
        String input = "";
        while(!input.equals("quit"));
        {
            System.out.print("input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }
        */

        //DO-WHILE LOOP========================
        /*
        Scanner scanner = new Scanner (System.in);
        String input = "";
        do{
            System.out.print("input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }while(!input.equals("quit"));
        */


        //FOR EACH LOOP ====================================
        /*
        String [] fruits = {"Mango", "Orange", "Apple"};

        for (int i = 0; i < fruits.length ; i++)    //for loop
            System.out.println(fruits[i]);

        for(String fruit : fruits)                  //for each loop
            System.out.println(fruit);
        */


        //MORTGAGE CALCULATOR WITH BASIC
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        int principal = 0;
        float monthlyInterest = 0;
        int numberOfPayments = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Principal: ");
            principal = scanner.nextInt();
            if(principal >= 1000 && principal <= 1_000_000)
                break;
            System.out.println("Enter Value between 1000 and 1000000");
        }

        while(true) {
            System.out.print("Annual Interest Rate: ");
            float annualInterest = scanner.nextFloat();
            if (annualInterest >= 1 && annualInterest <= 30) {
                monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter value between 1 and 30:");
        }

        while (true) {
            System.out.print("Period (Years): ");
            byte years = scanner.nextByte();
            if (years >= 1 && years <= 30) {
                numberOfPayments = years * MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter value between 1 and 30: ");
        }

        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 +monthlyInterest, numberOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(123115132);
        System.out.println("Mortgage: " + mortgageFormatted);
    }




}
