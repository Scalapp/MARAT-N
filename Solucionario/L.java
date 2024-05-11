import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static String line;
	static StringBuffer buf=new StringBuffer();
	
	public static int catalan(int n) {
		int res=0;
		if (n<=1) {
			return 1;
		}
		for (int i = 0; i < n; i++) {
			res+=catalan(i)*catalan(n-i-1);
		}
		return res;
	}
	public static void main(String[] args) throws IOException{
		while((line=br.readLine())!=null) {
			if(line.trim().isEmpty())continue;
			int a=Integer.parseInt(line);
			buf.append(catalan(a)+"\n\n");
		}
		System.out.print(buf);
	}
}
