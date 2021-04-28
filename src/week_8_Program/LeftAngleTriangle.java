package week_8_Program;

    // 15. Display left angle triangle of * using nested for loops

public class LeftAngleTriangle {

    public void leftAngle() {

        int n =5;
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }


    }

    public static void main(String[] args) {
        LeftAngleTriangle obj = new LeftAngleTriangle();
        obj.leftAngle();
    }
}
