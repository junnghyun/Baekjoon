import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        String[] b = {"000","001","010","011","100","101","110","111"};

        for(int i = 0; i < s.length(); i++) {
            int a = s.charAt(i) - '0';
            sb.append(b[a]);
        }

        if(s.equals("0")) {
            System.out.println(s);
        } else {
            while(sb.charAt(0) == '0') {
                sb = new StringBuilder(sb.substring(1));
            }
            System.out.println(sb);
        }

        sc.close();
    }

}