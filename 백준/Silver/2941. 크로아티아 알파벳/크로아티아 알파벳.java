import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();

        String[] croatiaAlphabet = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
        int index = 0;

        for (int i = 0; i < croatiaAlphabet.length; i++) {		
            index = s.indexOf(croatiaAlphabet[i]);            
            if (index >= 0) { 
                s = s.replaceAll(croatiaAlphabet[i], "A");
            }
        }
        System.out.println(s.length());
    }

}