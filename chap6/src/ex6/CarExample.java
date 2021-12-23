package ex6;

public class CarExample {
    public static void main(String[] args){
        Car mycar = new Car();

        mycar.setSpeed(-50);
        System.out.println(mycar.getSpeed());

        mycar.setSpeed(60);
        System.out.println(mycar.getSpeed());

        mycar.setStop(true);
        System.out.println(mycar.getSpeed());

    }
}
