import java.io.IOException;
import java.util.Scanner;
public class Main {
 
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		for(int i = 0; i < t; i++) {
	
			int a = sc.nextInt();
			String b = sc.next();
			
			for(int j = 0; j < b.length(); j++) {           
				for(int k = 0; k < a; k++) {
					System.out.print(b.charAt(j));
				}
			}
            
			System.out.println();
		}
		sc.close();
	}
}