import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
 
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		sc.close();
		StringTokenizer st = new StringTokenizer(s, " ");
		
		System.out.println(st.countTokens());
		
	}
}