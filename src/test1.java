import java.util.Date;

public class test1 {

	public static void main(String[] args) {
		
		Date now = new Date();
		
		int invoiceCount = 2;
		
		double result = invoiceCount / 4;
		double result2 = (double) invoiceCount / 4;
		
		System.out.println(result);
		System.out.println(result2);

		String currentDate = now.toString();
		System.out.println(currentDate);
	}

}
