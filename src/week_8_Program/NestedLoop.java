package week_8_Program;

        /* PROGRAM  - 8.
        Display right angle triangle of @ using nested for loops
        @
        @@
        @@@
        @@@@
        @@@@@*/

public class NestedLoop {

    public void nested() {
        int i;
        int j;
        int n = 5;
        for (i = 0; i <= n; i++) {
            for (j = 1; j <= i; j++)
                System.out.print("@");

            System.out.println("");
        }
    }

    public static void main(String[] args) {
        NestedLoop obj = new NestedLoop();
        obj.nested();
    }
}