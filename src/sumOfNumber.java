
public class sumOfNumber {

	public static void main(String[] args) {
		
		System.out.println(summation(2));

	}
	
	public static int summation(int n) {
		
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		
		return sum;
	}

}
