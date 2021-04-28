package week_8_Program;

import javafx.scene.transform.Scale;

import java.util.Scanner;

/*
        PROGRAM - 7.
        First And Last Digit Sum
        Write a method named sumFirstAndLastDigit with one parameter of type int called number.
        The method needs to find the first and the last digit of the parameter number passed to the method,
        using a loop and return the sum of the first and the last digit of that number.
        If the number is negative then the method needs to return -1 to indicate an invalid value. Example input/output
        * sumFirstAndLastDigit(252); →should return 4, the first digit is 2 and the last is 2 which gives us 2+2 and the sum is 4.
        * sumFirstAndLastDigit(257); →should return 9, the first digit is 2 and the last is 7 which gives us 2+7 and the sum is 9.
        * sumFirstAndLastDigit(0); → should return 0, the first digit and the last digit is 0 since we only have 1 digit, which
        gives us 0+0 and the sum is 0.
        * sumFirstAndLastDigit(5); → should return 10, the first digit and the last digit is 5 since we only have 1 digit, which
        gives us 5+5 and the sum is 10.
        * sumFirstAndLastDigit(-10); → should return -1, since the parameter is negative and needs to be positive.
        NOTE: The method sumFirstAndLastDigit needs to be defined as public static
*/


public class FirstAndLastDigit {

    public static int sum(int number){

    int i = 0, n = 0,sum;

    int t = number;
    int count = 0;

    if (number>=0){

        while(t!=0){
            n=count++;
            t=t/10;
        }
        int [] digit = new int[n+1];
        while (number>0){
            digit[i] = number%10;
            number = number/10;
            i++;
        }
        sum = digit[0]+ digit[n];
        return sum;
    }else{
        return -1;
    }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number : ");
        int num =input.nextInt();
        if (num >0){
            System.out.println("sumt of digit "+ sum(num));
        }else{
            System.out.println(sum(num));
        }
    }
}
