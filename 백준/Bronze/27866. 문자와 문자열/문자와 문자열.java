import java.util.Scanner;
import java.io.IOException;
 
public class Main {
	public static void main(String[] args)throws IOException{		
		Scanner sc = new Scanner(System.in);
		
		String st = sc.next();
		int n = sc.nextInt()-1;
		
		System.out.println(st.charAt(n));
		
		sc.close();
	}
}