import java.io.IOException;
import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int sum=0;
		int count=0;
		for(int i=0; i<t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			sum=a+b;
			count++;
			System.out.println("Case #"+count+": "+a+" + "+b+" = "+sum);
		}
		sc.close();
	}
}
