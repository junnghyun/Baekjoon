import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args)throws  IOException{		
		Scanner sc = new Scanner(System.in);
 
		double arr[] = new double[sc.nextInt()];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextDouble();
		}
		sc.close();
		
		double sum = 0;
		Arrays.sort(arr);
		
		for(int i = 0; i < arr.length; i++) {
			sum += ((arr[i] / arr[arr.length-1]) * 100);
		}
		System.out.print(sum / arr.length);
	}
}