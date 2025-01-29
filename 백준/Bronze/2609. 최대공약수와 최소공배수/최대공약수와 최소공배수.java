import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int max = Math.max(n, m);
		int min = Math.min(n, m);
		int a = max;
		int b = min;
		
		while(a % b != 0) {
			int c = a;
			a = b;
			b = c % b;
		}
		System.out.println(b);
		
		int i = max;
		while(max % min != 0) {
			max += i;
		}
		System.out.println(max);
	}

}
