package ex5;

public class CheckOverflowExample {
	
	public static void main(String args[]){
		try{
			int result = safeadd(2000000000,2000000000);
			System.out.println(result);
				
		}catch(ArithmeticException e){
			System.out.println("�����÷ο� �߻�");
		}
	}
	public static int safeadd(int left, int right){
		if (right > 0){
			if (left > (Integer.MAX_VALUE - right)){
				throw new ArithmeticException("�����÷ο� �߻�");
			}
		}
		else{
			if (left < (Integer.MIN_VALUE - right)){
				throw new ArithmeticException("�����÷ο� �߻�");
			}
		}
		return left + right;
	}
}
