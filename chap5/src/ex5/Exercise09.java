package ex5;

import java.util.Scanner;

public class Exercise09 {
    public static void main(String[] args){
        boolean run = true;
        int num = 0;
        int[] scores = null;
        Scanner s = new Scanner(System.in);

        while(run){
            System.out.println("----------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("----------------");
            System.out.print("선택> ");

            int selected = s.nextInt();
            switch (selected){
                case 1 ->{
                    System.out.print("학생수> ");
                    num = s.nextInt();
                    scores = new int[num];

                }
                case 2 -> {
                    for(int i=0; i<num;i++){
                        System.out.print("Scores["+i+"]> ");
                        scores[i] = s.nextInt();
                    }
                }
                case 3 -> {
                    for(int i=0; i<num;i++){
                        System.out.println("Scores["+i+"]: "+scores[i]);
                    }
                }
                case 4 -> {
                    int max = 0;
                    int sum = 0;
                    for(int i=0;i<num;i++){
                        max = Math.max(scores[i],max);
                        sum += scores[i];
                    }
                    double avg = (double) sum/num;
                    System.out.println("최고 점수: "+max);
                    System.out.println("평균 점수: "+avg);
                }
                case 5-> run = false;
            }

        }
        System.out.println("프로그램 종료");
    }
}
