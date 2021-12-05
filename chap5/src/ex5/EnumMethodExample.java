package ex5;

public class EnumMethodExample {
    public static void main(String[] args){
        Week today = Week.SUNDAY;
        String name = today.name();
        System.out.println(name);
        System.out.println();

        Week[] days = Week.values();
        for(Week day:days){
            System.out.println(day);

        }
    }
}
