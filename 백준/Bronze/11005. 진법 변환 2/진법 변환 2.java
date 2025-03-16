import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int i = Integer.parseInt(st.nextToken());
        int j = Integer.parseInt(st.nextToken());

        while(i != 0){
            if(i%j >= 10) sb.append((char)((i%j)+'A'-10));
            else sb.append(i%j);
            i/=j;
        }
        System.out.print(sb.reverse().toString());
    }
}