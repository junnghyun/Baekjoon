import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String str = st.nextToken();
        int x = Integer.parseInt(st.nextToken());
        br.close();

        int tmp = 1;
        int sum = 0;

        for(int i = str.length()-1 ; i >= 0; i--){
            char c = str.charAt(i);
            
            if ('A' <= c && c <= 'Z') {
                sum += (c - 'A' + 10) * tmp;
            } else {
                sum += (c - '0') * tmp;
            }
            tmp *= x;
        }

        System.out.println(sum);
    }
}