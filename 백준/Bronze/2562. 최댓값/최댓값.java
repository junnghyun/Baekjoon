import java.io.IOException;
import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {sc.nextInt(), sc.nextInt(), sc.nextInt(),
				sc.nextInt(), sc.nextInt(), sc.nextInt(),
				sc.nextInt(), sc.nextInt(), sc.nextInt()};
		
		sc.close();
		
		int a = 0;
		int max = 0;
		int index = 0;
		
		for(int value: arr) {
			a++;
			
			if(value > max) {
				max = value;
				index = a;
			}
		}
		System.out.println(max + "\n" + index);
	}
}
