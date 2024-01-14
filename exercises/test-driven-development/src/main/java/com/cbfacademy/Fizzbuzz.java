package com.cbfacademy;

import java.util.Scanner;

public class Fizzbuzz {

    public void fizzy() {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter you chosen number");
        int num = input.nextInt();

        for(int i = 1; i <= num; i++) {

            if(i % 5 == 0 && num % 3 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else
                System.out.println(i);

        }
        input.close();
    }


}


//Create a class FizzBuzz with a get method that takes a number and returns a string, but such that:
//
//        for multiples of 3, it returns “Fizz” instead of the number
//for multiples of 5, it returns “Buzz” instead of the number
//for multiples of 15, it returns “FizzBuzz” instead of the number


