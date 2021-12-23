package ex6;

public class CalculatorExample {
    public static void main(String[ ] args){
        Calculator myCal = new Calculator();

        double result1 = 10*10*Calculator.pi;
        System.out.println(result1);


        int result2 = myCal.plus(10,5);
        int result3 = myCal.minus(10,20);

        System.out.println(result2);

        System.out.println(result3);
    }
}
