package ex6_add;

public class ShopServiceExample {
    public static void main(String[] args){
        ShopService obj1 = ShopService.getInstance();
        ShopService obj2 = ShopService.getInstance();

        if(obj1==obj2){
            System.out.println("같은 ShopSerivce 객체입니다");
        } else{
            System.out.println("다른 ShopSerivce 객체입니다");
        }
    }
}
