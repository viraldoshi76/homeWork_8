package week_8_Program;

/*
18. Sum Calculator
        Write a class with the name SimpleCalculator. The class needs two fields (instance variables) with
        names firstNumber and secondNumber both of type double.
        Write the following methods (instance methods):
        ● Method named getFirstNumber without any parameters, it needs to return the value of the
        firstNumber field.
        ● Method named getSecondNumber without any parameters, it needs to return the value of
        the secondNumber field.
        ● Method named setFirstNumber with one parameter of type double, it needs to set the value
        of the firstNumber field.
        ● *Method named setSecondNumber with one parameter of type double, it needs to set the
        value of the secondNumber field.
        ● Method named getAdditionResult without any parameters, it needs to return the result of
        adding the field values of firstNumber and secondNumber.
        ● Method named getSubtractionResult without any parameters, it needs to return the result of
        subtracting the field values of secondNumber from the firstNumber.
        ● Method named getMultiplicationResult without any parameters, it needs to return the result
        of multiplying the field values of firstNumber and secondNumber.
        ● Method named getDivisionResult without any parameters, it needs to return the result of
        dividing the field values of firstNumber by the secondNumber. In case the value of
        secondNumber is 0 then return 0.
*/

public class SimpleCalculator {

    double firstNumber;
    double secondNumber;

    public double getFirstNumber(){
        double firstNumber=0;
        this.firstNumber = firstNumber;

        return firstNumber;
    }
    public double getSecondNumber(){
        double secondNumber=0;
        this.secondNumber = secondNumber;
        return secondNumber;
    }

    public double setFirstNumber(double firstNumber){

        this.firstNumber = firstNumber;
        return firstNumber;
    }

    public double setSecondNumber(double secondNumber){

        this.secondNumber = secondNumber;
        return secondNumber;
    }

    public double getAdditionResult(){
        double add;
        add = firstNumber + secondNumber;
        return add;
    }

    public double getSubtractionResult(){
        double subtr;
        subtr = firstNumber - secondNumber;
        return subtr;
    }

    public double getMultiplicationResult(){
        double multi;
        multi = firstNumber * secondNumber;
        return multi;
    }

    public double getDivisionResult(){
        double div;
        div = firstNumber/secondNumber;
        if (secondNumber==0){
            div = 0;
        }
        return div;
    }

    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
    }






}
