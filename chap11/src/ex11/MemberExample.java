package ex11;

public class MemberExample {
    public static void main (String[] args){
        Member o = new Member("홍길동", 25, new int[] {90,90}, new Car("소나타"));

        Member cloned = o.getMember();
        cloned.scores[0] = 100;
        cloned.car.model = "그랜저";


    }
}
