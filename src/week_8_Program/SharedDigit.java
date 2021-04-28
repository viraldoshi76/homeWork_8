package week_8_Program;

   /* 13. Shared Digit
            Write a method named hasSharedDigit with two parameters of type int.
            Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
            within the range, the method should return false.
            The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
            otherwise, the method should return false.
            EXAMPLE INPUT/OUTPUT:
            * hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
            * hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
            * hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
*/
public class SharedDigit {

    public static boolean hasSharedDigit(int a, int b) {

        int a1=0, b1=0;
        int a2=0, b2=0;

        if ((a >= 10 && a < 99) && (b >= 10 && b <= 99)) {

            a1 = a % 10;//fl
            b1 = b % 10;//sl
            a /= 10;//ff
            b /= 10;//sf
            a2 = a;
            b2 = b;
        }else {
            return false;
        }
        if (a1 == b2 || a1 == b1 || a2 == b1 || a2 == b2) {
            return true;


        } else  {
            return false;

        }
    }
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(15,-15));
    }

}
