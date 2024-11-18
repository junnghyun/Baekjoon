import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		sc.close();
		int l = str.length();
		int s = 1;
		
		for(int i=0;i<l/2;i++) {
			if(str.charAt(i)!=str.charAt(l-1-i)) {
				s = 0;
			}
		}
		System.out.println(s);
    }

}