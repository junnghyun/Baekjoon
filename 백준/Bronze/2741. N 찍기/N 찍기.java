import java.io.IOException;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args)throws  IOException{		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.close();
        
		int i = 1;
        
		while(i<= N) {
			System.out.println(i);
			i++;
		}
	}
}