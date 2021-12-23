package ex6;

public class KoreanExample {
    public static void main(String[] args){
        Korean k1 = new Korean("박자바","01112345");
        System.out.println(k1.name+k1.ssn);

        Korean k2 = new Korean("김자바","12391204");
        System.out.println(k2.name+k2.ssn);
    }
}
