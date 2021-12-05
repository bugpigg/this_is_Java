package ex5;

public class StringEqualsExample {

	public static void main(String[] args) {
		String v1 = "�ڹ�";
		String v2 = "�ڹ�";
		String v3 = new String("�ڹ�");
		
		System.out.println(v1 == v2);
		System.out.println(v1 == v3);
		
		System.out.println(v1.equals(v2));
		System.out.println(v1.equals(v3));
		

	}

}
