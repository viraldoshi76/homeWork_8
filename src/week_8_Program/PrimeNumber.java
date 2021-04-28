package week_8_Program;


import java.util.Scanner;

        /* PROGRAM  - 12.
        Write a programme to input any number and check if it is prime or not.
            (Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
            prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
            17.... are the prime numbers.*/

public class PrimeNumber {

    public static void prime(int n){

        int i,m=0,flag=0;
        m=n/2;
        if(n==0||n==1){
            System.out.println(n+" is not prime number");
        }else{
            for(i=2;i<=m;i++){
                if(n%i==0){
                    System.out.println(n+" is not prime number");
                    flag=1;
                    break;
                }
            }
            if(flag==0)  { System.out.println(n+" is prime number"); }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number : ");
        int num = input.nextInt();
        prime(num);
    }
}
