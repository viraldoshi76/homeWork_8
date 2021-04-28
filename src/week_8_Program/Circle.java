package week_8_Program;

public class Circle {

    double radius;

    public Circle (double radius){

        this.radius =radius;
        if (radius <0){
            radius = 0;
        }
    }

    public double getRadius(){

        return radius;
    }

    public double getArea(){
        double area;
        area = radius*radius*Math.PI;
        return area;
    }


}
