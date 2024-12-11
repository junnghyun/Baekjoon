import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int a,b,c;
		for(int j=0;j<x;j++) {
			a=sc.nextInt();
			b=sc.nextInt();
			c=1;
			
			for (int i=0;i<b;i++) c=(c*a)%10;
			if(c==0) c=10;
			System.out.println(c);
		}
		sc.close();
    }

}