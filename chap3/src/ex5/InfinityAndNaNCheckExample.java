package ex5;

public class InfinityAndNaNCheckExample {

	public static void main(String[] args) {
		double x = 5.0;
		int y = 0;
		
		double z = x/y;
		double zz = x%y;
		
		System.out.println(Double.isInfinite(z));
		System.out.println(Double.isInfinite(zz));
		System.out.println(Double.isNaN(z));
		System.out.println(Double.isNaN(zz));

	}

}
