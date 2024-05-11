import java.util.*;

public class A

{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			long num = 0;
			int base1 = 0;
			String numlectura = null;
			try {
				base1 = sc.nextInt();
				int base2 = sc.nextInt();
				numlectura=sc.next();
				num = Long.parseLong(numlectura, base1);
				String res = Long.toString(num, base2);
				System.out.println(numlectura.toUpperCase() + " base " + base1 + " = " + res.toUpperCase() + " base " + base2);
			} catch (Exception e) {
				System.out.println(numlectura.toUpperCase() + " is an illegal base " + base1 + " number");
				sc.nextLine();
				//e.printStackTrace();
				continue;
			}

		}

	}
}
