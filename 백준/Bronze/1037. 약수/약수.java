import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		
		int a = Integer.MIN_VALUE;
		int b = Integer.MAX_VALUE;
		
		while(i-- > 0) {
			int N = sc.nextInt();
			a = N > a ? N : a;
			b = N < b ? N : b;
		}
		sc.close();
		System.out.println(a * b);
    }

}