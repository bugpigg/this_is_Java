package ex;

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args){
        boolean run = true;
        int balance = 0;

        Scanner s = new Scanner(System.in);
        while (run){
            System.out.println("----------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("----------------");

            System.out.print("선택>");
            int i = s.nextInt();

            switch (i) {
                case 1 -> {
                    balance += 10000;
                    System.out.println("예금액>" + balance);
                    System.out.println();
                }
                case 2 -> {
                    balance -= 2000;
                    System.out.println("출금액>" + 2000);
                    System.out.println();
                }
                case 3 -> {
                    System.out.println("잔고>" + balance);
                    System.out.println();
                }
                case 4 -> run = false;
            }

        }
        System.out.println("프로그램 종료");
    }
}
