
import java.util.Scanner;

public class K {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			long s = sc.nextLong();
			double cantidad = formula(s);
			System.out.println((int) cantidad);
		}

	}

	private static double formula(long n) {

		if (n == 0) {
			return 1;
		}if(n==1) {
			return 1;
		
		}
		return Math.floor((Math.log(2 * Math.PI * n) / 2 + n * (Math.log(n) - 1)) / Math.log(10)) + 1;
	}

}
