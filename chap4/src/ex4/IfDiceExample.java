package ex4;

public class IfDiceExample {
    public static void main(String[] args){
        // 1~6 까지의 정수 중 임의의 정수
        int num = (int)(Math.random()*6)+1;
        System.out.println(num+"번이 나왔습니다.");
    }
}
