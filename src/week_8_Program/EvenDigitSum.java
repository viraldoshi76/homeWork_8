package week_8_Program;

import java.util.Scanner;

            /*  PROGRAM  - 11.
            Even Digit Sum
            Write a method named getEvenDigitSum with one parameter of type int called number.
            The method should return the sum of the even digits within the number.
            If the number is negative, the method should return -1 to indicate an invalid value.
            EXAMPLE INPUT/OUTPUT:
            * getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
            * getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
            * getEvenDigitSum(-22); → should return -1 since the number is negative
            */

public class EvenDigitSum {

    public static int evenDigit(int num){

        int temp=0,i=0,n=0;
        int sum = 0;
        if(num>=0){
            temp=num;
            while(temp>0){
                temp = temp/10;
                n = n + 1;
            }
            int digit[] = new int[n];
            temp =num;
            while (temp>0){
                digit[i]= temp %10;
                if(digit[i] % 2 == 0){
                    sum = sum + digit[i];
                }
                temp = temp /10;
                i++;
            }
            return sum;
        }else{
            return -1;
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number : ");
        int a = input.nextInt();
        if(a>=0){
            System.out.println("sum of even numbers : "+ evenDigit(a));
        }else{
            System.out.println(evenDigit(a));
        }
    }
}
