/*
* created by dipak
*
* */

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
        this.secondNumber =secondNumber;
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
        add= firstNumber+secondNumber;
       return add;
    }

    public double getSubtractionResult(){
        double subtr;
        subtr= firstNumber-secondNumber;
        return subtr;
    }

    public double getMultiplicationResult(){
        double multi;
        multi = firstNumber*secondNumber;
        return multi;
    }

    public double getDivisionResult(){
        double divi;
        divi= firstNumber/secondNumber;
        if (secondNumber==0){
            divi=0;
        }
        return divi;
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
