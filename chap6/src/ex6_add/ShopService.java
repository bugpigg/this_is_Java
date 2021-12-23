package ex6_add;

public class ShopService {
    private static ShopService s = new ShopService();

    private ShopService(){
    }

    public static ShopService getInstance(){
        return s;
    }
}
