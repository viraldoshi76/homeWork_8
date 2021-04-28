package week_8_Program;

import java.util.Scanner;
/*
    program - 10.
    Write a program to input any number and check if it Armstrong number or not
*/

public class ArmstrongNumber {

    public static void armstrong (int n){
        int c=0,a,temp;
         ;//It is the number to check armstrong
        temp=n;
        while(n>0)
        {
            a=n%10;
            n=n/10;
            c=c+(a*a*a);
        }
        if(temp==c)
            System.out.println("armstrong number");
        else
            System.out.println("Not armstrong number");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number: ");
        int num = input.nextInt();
        armstrong(num);
    }


}
