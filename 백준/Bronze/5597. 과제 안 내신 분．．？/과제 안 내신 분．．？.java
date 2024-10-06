import java.io.IOException;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args)throws  IOException{		
		Scanner sc = new Scanner(System.in);
		int[] cl = new int[31];
		
		for(int i=1; i<29; i++) {
			int student = sc.nextInt();
			cl[student] = 1;
		}
		for(int i=1; i<cl.length; i++) {
			if(cl[i]!=1)
				System.out.println(i);
		}
		
		sc.close();
	}
}