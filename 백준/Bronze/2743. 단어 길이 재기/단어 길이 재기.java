import java.io.IOException;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args)throws  IOException{		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		sc.close();
		
		System.out.println(a.length());
	}
}