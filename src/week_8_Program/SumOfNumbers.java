package week_8_Program;

import java.util.Scanner;

        /* PROGRAM  - 1.
        Read 10 numbers from the console entered by the user and print the sum of those
        numbers.
        -Use the hasNextInt() method from the scanner to check if the user has entered an int value.
        -If hasNextInt() returns false, print the message Invalid Number. Continue reading until you have read
        10 numbers.
        -Use the nextInt() method to get the number and add it to the sum.
        -Before the user enters each number, print the message Enter number #x: where x represents the
        count, i.e. 1, 2, 3, 4, etc.*/


public class SumOfNumbers {

    double arr[] = new double[10];

    public boolean hasNextInt() {

        double counter;

        Scanner input = new Scanner(System.in);
        boolean result = true;
        int i =0;
        while (i <10) {


            System.out.print("Enter the number : ");
            counter = input.nextDouble();
            if (counter % 1 != 0) {
                result = false;
                System.out.println("Invalid number");
                do {

                    System.out.print("Enter the valid number :");
                    counter = input.nextDouble();
                } while (counter % 1 != 0);

            }
            arr[i] = counter;
            i++;

        }
        input.close();
        return result;

    }


    public void nextInt(){
        double sum =0;
        for (int a=0;a<arr.length;a++) {

            sum = sum + arr[a];

        }
        System.out.println(sum);

    }

    public static void main(String[] args) {
        SumOfNumbers obj =new SumOfNumbers();
        System.out.println(obj.hasNextInt());
        obj.nextInt();
    }

}






