import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int[] arr = new int[t];
		
		for(int i=0; i<t; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		sc.close();
		System.out.println(arr[0] + " " + arr[t-1]);
	}
}