import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		String b = br.readLine();
		long result = 0;
		long x = 1;
		for(int i = 0; i < a; i++) {
			result += ((b.charAt(i) - 96) * x);
			x = (x * 31) % 1234567891;
		}
		br.close();
		System.out.println(result % 1234567891);
	}
}