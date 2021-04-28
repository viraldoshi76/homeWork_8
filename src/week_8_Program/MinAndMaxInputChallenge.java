package week_8_Program;

import java.util.Scanner;

        /* PROGRAM - 2.
        -Read the numbers from the console entered by the user and print the minimum
        and maximum number the user has entered.
        -Before the user enters the number, print the message Enter number:
        -If the user enters an invalid number, break out of the loop and print the minimum and maximum
        number.
        Hint:
        -Use an endless while loop.
        -Create a class with the name MinAndMaxInputChallenge.*/


public class MinAndMaxInputChallenge {

    public void minMax() {
        int n =0;
        int a = 1;
        int min = 0;
        int max = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number ");
        int b = input.nextInt();
        min = b;


        while (a > 0) {

            b = input.nextInt();

            if (b > 0) {

                for (int i = 1; i <= n; i++) {
                    if (b > max) {
                        max =b;
                    }
                    if (b < min) {
                        min =b;
                    }

                }

            } else {
                System.out.println("invalid number");
                System.out.println("minimum value " + min);
                System.out.println("max value " + max);
                break;

            }
            a++;
            n=a++;
        }
    }


    public static void main(String[] args) {

        MinAndMaxInputChallenge obj = new MinAndMaxInputChallenge();
        obj.minMax();
    }
}

