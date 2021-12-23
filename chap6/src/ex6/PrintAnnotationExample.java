package ex6;

import java.lang.reflect.Method;

public class PrintAnnotationExample {
    public static void main (String[] args){
        // Service 클래스에 선언된 메소드 얻기
        Method[] declaredMethods = Service.class.getDeclaredMethods();

        for (Method m: declaredMethods){
            if(m.isAnnotationPresent(PrintAnnotation.class)){
                PrintAnnotation pa = m.getAnnotation(PrintAnnotation.class);

                System.out.println(m.getName());
                for(int i = 0;i < pa.number();i++){
                    System.out.print(pa.value());
                }
                System.out.println();
            }
            try{
                m.invoke(new Service());
            } catch(Exception e){
            }
            System.out.println();
        }
    }
}
