import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
 
		int N = sc.nextInt();

        sc.close();

		int cnt = 1;
		int num = 2;

		if (N == 1) {
			System.out.print(1);
		} else {
			while (num <= N) {
				num = num + (6 * cnt);
				cnt++;
			}
			System.out.print(cnt);
        }
    }

}