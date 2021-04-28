package week_8_Program;

import java.util.Scanner;

    /*14. Write a program in Java to display the pattern like a diamond.
            While loop*/

public class Diamond {
    int i = 0, j = 1, r = 0;

    public void diamondWhileLoop() {
        System.out.print("Enter the number of rows: ");
        Scanner input = new Scanner(System.in);
        r = input.nextInt();
        while (i <= r) {
            j = 1;
            while (j <= r - i) {
                System.out.print(" ");
                j++;
            }
            j = 1;
            while (j <= 2 * i - 1) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
        i = r - 1;
        while (i >= 1) {
            j = 1;
            while (j <= r - i) {
                System.out.print(" ");
                j++;
            }
            j = 1;
            while (j <= 2 * i - 1) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
    }

        public static void main (String[]args){
            Diamond obj = new Diamond();
            obj.diamondWhileLoop();
        }

}



