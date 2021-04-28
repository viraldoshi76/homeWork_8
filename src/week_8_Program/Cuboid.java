package week_8_Program;

/*
20. Pool Area
        The Swimming Company has asked you to write an application that calculates the volume of cuboid
        shaped pools.
        1. Write a class with the name Rectangle. The class needs two fields (instance variable) with name
        width and length both of type double.
        The class needs to have one constructor with parameters width and length both of type double and it
        needs to initialize the fields. In case the width parameter is less than 0 it needs to set the width field value to 0.
        In case the length parameter is less than 0 it needs to set the length field value to 0.
        Write the following methods (instance methods):
        ● Method named getWidth without any parameters, it needs to return the value of the width
        field.
        ● Method named getLength without any parameters, it needs to return the value of the length
        field.
        ● Method named getArea without any parameters, it needs to return the calculated area
        (width * length).
        2. Write a class with the name Cuboid that extends Rectangle class. The class needs one field
        (instance variable) with name height of type double.
        The class needs to have one constructor with three parameters width, length, and height all of type
double. It needs to call the parent constructor and initialize a height field.
        In case the height parameter is less than 0 it needs to set the height field value to 0.
        Write the following methods (instance methods):
        ● Method named getHeight without any parameters, it needs to return the value of height
        field.
        ● Method named getVolume without any parameters, it needs to return the calculated volume.
        To calculate volume multiply the area with height.
        3. Write a class with the name Main that contains the main method.
*/

public class Cuboid extends Rectangle {

    double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);
        this.height = height;
        if(height==0){
            height=0;
        }
    }

    public double getHeight(){

        return height;
    }
    public double getVolume(){
        double volume;
        volume = getArea()*height;
        return volume;
    }

}

class main{
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());
        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea()); System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());
    }

}
