package ex;

public class StringEqualsExample {

	public static void main(String[] args) {
		String v1 = "자바";
		String v2 = "자바";
		String v3 = new String("자바");
		
		System.out.println(v1 == v2);
		System.out.println(v1 == v3);
		
		System.out.println(v1.equals(v2));
		System.out.println(v1.equals(v3));
		

	}

}
