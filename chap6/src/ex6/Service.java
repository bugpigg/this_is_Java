package ex6;

public class Service {
    @PrintAnnotation
    public void m1(){
        System.out.println("ex1");
    }

    @PrintAnnotation("*")
    public void m2(){
        System.out.println("ex2");
    }

    @PrintAnnotation(value = "#",number = 30)
    public void m3(){
        System.out.println("ex3");
    }
}
