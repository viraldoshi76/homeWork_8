package week_8_Program;

/*
19. Cylinder
        1. Write a class with the name Circle. The class needs one field (instance variable) with name radius
        of type double.
        The class needs to have one constructor with parameter radius of type double and it needs to initialize
        the fields.
        In case the radius parameter is less than 0 it needs to set the radius field value to 0.
        Write the following methods (instance methods):
        ● Method named getRadius without any parameters, it needs to return the value of the radius
        field.
        ● Method named getArea without any parameters, it needs to return the calculated area
        (radius * radius * PI). For PI use Math.PI constant.
        2. Write a class with the name Cylinder that extends Circle class. The class needs one field (instance
        variable) with name height of type double.
        The class needs to have one constructor with two parameters radius and height both of type double.
        It needs to call the parent constructor and initialize a height field.
        In case the height parameter is less than 0 it needs to set the height field value to 0.
        Write the following methods (instance methods):
        ● Method named getHeight without any parameters, it needs to return the value of height
        field. ● Method named getVolume without any parameters, it needs to return the calculated volume.
        To calculate volume multiply the area with height.
        3. Write a class with the name Main that have main method
*/

public class Cylinder extends Circle {
    double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
        if (height<0){
            height = 0;
        }
    }

    public double getHeight(){


        return height;
    }

    public double getVolume(){

        double volume;

        volume=getArea() * height;

        return volume;
    }


}

  class Main{
      public static void main(String[] args) {
          Circle circle = new Circle(3.75);
          System.out.println("circle.radius= " + circle.getRadius());
          System.out.println("circle.area= " + circle.getArea());
          Cylinder cylinder = new Cylinder(5.55, 7.25);
          System.out.println("cylinder.radius= " + cylinder.getRadius());
          System.out.println("cylinder.height= " + cylinder.getHeight());
          System.out.println("cylinder.area= " + cylinder.getArea());
          System.out.println("cylinder.volume= " + cylinder.getVolume());

      }

    }