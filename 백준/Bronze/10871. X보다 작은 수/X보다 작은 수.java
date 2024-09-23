import java.io.IOException;
import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int n = sc.nextInt();
		
		for(int i = 0; i < t; i++) {
	
			int a = sc.nextInt();
			
            if(a < n) {
            	System.out.println(a);
            }
		}
		sc.close();
	}
}