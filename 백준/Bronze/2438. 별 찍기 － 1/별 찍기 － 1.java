import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		     
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		for(int i=0; i<n; i++) {
			for(int j=-1; j<i; j++) {
				System.out.print("*");				
			}
			System.out.println();
		}
 
	}
 
}