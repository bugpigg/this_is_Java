package ex4;

public class SwitchStringExample {
    public static void main(String[] args){
        String pos = "사원";

        switch (pos) {
            case "부장" -> System.out.println("700만원");
            case "과장" -> System.out.println("500만원");
            default -> System.out.println("300만원");
        }
    }
}
