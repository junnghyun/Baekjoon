import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> h = new HashSet<Integer>();
		
		for(int i=0; i<10; i++) {
			h.add(sc.nextInt() % 42);
		}
		sc.close();
		System.out.println(h.size());
	}
}