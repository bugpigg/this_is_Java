package ex9;

public class A {
    // 생성자
    A() {
        System.out.println("A 객체가 생성됨");
    }

    // 인스턴스 멤버 클래스
    class B {
        B() {
            System.out.println("B 객체가 생성됨");
        };
        int field;
        void method1() {}
    }

    // 정적 맴버 클래스
    static class C {
        C(){
            System.out.println("C 객체가 생성됨");
        }
        int field;
        static int field2;
    }

    // 로컬 클래스
    void method(){
     class D {
         D(){
             System.out.println("D 객체가 생성됨");
         }
         int field1;
     }

    }
}
