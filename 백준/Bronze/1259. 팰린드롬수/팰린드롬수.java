import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String s = br.readLine();
			StringBuilder sb = new StringBuilder(s);
			String x = sb.reverse().toString();
			
			if(s.equals("0")) break;
			
			if(s.equals(x)) {
				System.out.println("yes");
			}else{
				System.out.println("no");
			}
		}
	}

}