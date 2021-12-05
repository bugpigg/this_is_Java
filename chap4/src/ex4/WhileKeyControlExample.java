package ex4;

public class WhileKeyControlExample {
    public static void main(String[] args) throws Exception{
        boolean run = true;
        int speed = 0;
        int keyCode = 0;

        while(run){
            //enter의 캐리지리턴과 라인피드에 반응하지 않기 위해서
            if (keyCode!=13 && keyCode!=10){
                System.out.println("-----------");
                System.out.println("1.증속 | 2.감속 | 3.중지");
                System.out.println("-----------");
                System.out.println("선택");
            }
            // 1하고 enter를 누르면 3번 키코드를 리턴한다.
            keyCode = System.in.read();
            System.out.println(keyCode);
            if (keyCode == 49){
                speed ++;
                System.out.println("현재속도 = " + speed);
            }
            else if(keyCode == 50){
                speed--;
                System.out.println("현재속도 = " + speed);
            }else if (keyCode == 51){
                run = false;
            }
        }
        System.out.println("프로그램 종료!");
    }
}
