package ex;

public class FromIntToDouble {
	public static void main(String[] args) {
		int num1 = 1234567890;
		int num2 = 1234567890;
		float num4 = 10;
		
		double num3 = num2;
		num2 = (int) num3;
		
		int result = num1-num2;
		System.out.println(result);
		System.out.println(num4);
	}
}