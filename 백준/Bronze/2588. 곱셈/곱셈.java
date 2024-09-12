import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int ones = b % 10;
        int tens = (b / 10) % 10;
        int hundreds = b / 100;

        System.out.println(a*ones);
        System.out.println(a*tens);
        System.out.println(a*hundreds);
        System.out.println(a*b);
    }

}