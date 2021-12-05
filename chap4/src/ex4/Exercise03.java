package ex4;

public class Exercise03 {
    public static void main(String[] args){
        int ans = 0;
        int i = 3;
        while(i<=100){
            ans += i;
            i+=3;
        }
        System.out.println("3의 배수의 합: "+ans);
    }
}
