import java.util.Scanner;

public class N {
	
	static String unit[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
	static String ten[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
	static String hnd[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
	
	static int valor(char ch) {
		switch(ch) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		}
		return 0;
	}
	
	static String toRoman(int n) {
		int a;
		StringBuilder sb = new StringBuilder();
		if(n>=1000) {
			a = n/1000;
			for(int i = 1; i <= a; i++) {
				sb.append("M");
			}
			n%=1000;
		}
		sb.append(hnd[n/100]);
		n = n%100;
		sb.append(ten[n/10]);
		sb.append(unit[n%10]);
		return sb.toString();
	}
	
	static int toDecimal(String num) {
		int sum = 0;
		int last = 0;
		int next;
		
		for(int i = num.length() - 1; i >= 0; i--) {
			next = valor(num.charAt(i));
			if(last <= next) {
				sum += next;
			} else {
				sum -= next;
			}
			last = next;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()) {
			String or = sc.nextLine();
			int a = toDecimal(or.toUpperCase());
			if(or.toUpperCase().equals(toRoman(a)) && a <= 3999) {
				System.out.println(a);
			}else {
				System.out.println("This is not a valid number");
			}
		}
	}
	
	
}
