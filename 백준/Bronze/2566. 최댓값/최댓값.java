import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int x = 1;
        int y = 1;

        for (int i=1; i<10; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j=1; j<10; j++) {
                int num = Integer.parseInt(st.nextToken());
                if (num > max) {
                    max = num;
                    x = i;
                    y = j;
                }
            }
        }
        System.out.println(max);
        System.out.println(x + " " + y);
    }

}