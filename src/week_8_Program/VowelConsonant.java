package week_8_Program;

import java.util.Locale;
import java.util.Scanner;

/*
        PROGRAM - 3.
         Write a Java program that takes the user to provide a single character from the
        alphabet. Print Vowel of Consonant, depending on the user input. If the user input
        Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
        error message.
        For eg:
        Input an alphabet: p
        Expected Output:
        Input letter is Consonant
*/

public class VowelConsonant {

    public void vowel(){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the alphabet: ");
        String a = input.next().toUpperCase();

        boolean uppercase = a.charAt(0)>=65 && a.charAt(0)<=90;
        boolean lowercase = a.charAt(0)>=97 && a.charAt(0)<=122;
        boolean vowel = a.equals("a")|| a.equals("e")||a.equals("i")||a.equals("o")||a.equals("u");

        if (a.length()>1){
            System.out.println("please enter single alphabet: ");
        }else if(!(uppercase||lowercase)){
            System.out.println("please enter an alphabet: ");
        }else if(vowel){
            System.out.println("Input letter is Vowel: ");
        }else {
            System.out.println("input letter is consonant: ");
        }
    }

    public static void main(String[] args) {
        VowelConsonant obj = new VowelConsonant();
        obj.vowel();
    }
}
