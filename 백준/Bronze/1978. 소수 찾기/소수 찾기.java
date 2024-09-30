import java.io.IOException;
import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int count=0;
		
		for(int i=0; i<n; i++) {
			int a = sc.nextInt();
			boolean isPrime = true;
			
			if(a == 1) {
				continue;
			}
			
			for(int j = 2; j <= Math.sqrt(a); j++) {
				if(a % j == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				count++;
			}
		}
		System.out.println(count);
		
	}
}
