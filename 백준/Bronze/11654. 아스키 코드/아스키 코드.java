import java.io.IOException;
import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		
		int ch = sc.next().charAt(0);
		System.out.print(ch);
		
		sc.close();
	}
}