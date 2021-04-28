package week_8_Program;

/*
    PROGRAM 9.
     Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
*/

public class Fibonacci {

    public void fibonacciNumber() {
        // Set it to the number of elements you want in the Fibonacci Series
        int maxNumber = 8;
        int previousNumber = 1;
        int nextNumber = 1;

        System.out.print("Fibonacci Series of " + maxNumber + " numbers: ");

        for (int i = 1; i <= maxNumber; ++i) {
            System.out.print(previousNumber + " ");
            /* On each iteration, we are assigning second number
             * to the first number and assigning the sum of last two
             * numbers to the second number
             */


            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
        }
    }

        public static void main (String[]args){
        Fibonacci obj = new Fibonacci();
        obj.fibonacciNumber();
        }

    }
