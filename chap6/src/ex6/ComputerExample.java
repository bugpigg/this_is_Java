package ex6;

public class ComputerExample {
    public static void main(String[] args){
        Computer c1 = new Computer();
        int[] values = {1,2,3,};
        int result1 = c1.sum1(values);
        System.out.println(result1);


        Computer c2 = new Computer();
        int result2 = c1.sum2(1,2,3);
        System.out.println(result1);
    }
}
