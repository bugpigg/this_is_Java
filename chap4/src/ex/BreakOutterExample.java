package ex;

public class BreakOutterExample {
    public static void main(String[] args){
        // ++ 과 같은 단항 연산자는 char 타입이 유지된다.
        Outter:for(char upper='A';upper<='Z';upper++){
                for(char lower='a';lower<='z';lower++) {
                    System.out.println(upper + "-" + lower);
                    if(lower=='g') {
                        break Outter;
                    }
                }
        }
    }
}
