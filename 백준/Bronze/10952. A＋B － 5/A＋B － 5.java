import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		     
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextInt()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(!(a==0 || b==0)) {
				System.out.println(a+b);				
			}
		}
		sc.close();
 
	}
}