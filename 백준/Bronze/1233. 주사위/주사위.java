import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder();

        int S1 = sc.nextInt();
        int S2 = sc.nextInt();
        int S3 = sc.nextInt();

        int[] arr = new int[S1 + S2 + S3 + 1];
        int result = 0;

        for (int s1 = 1; s1 <= S1; s1++) {
            for (int s2 = 1; s2 <= S2; s2++) {
                for (int s3 = 1; s3 <= S3; s3++) {
                    arr[s1 + s2 + s3]++;
                    if (arr[result] < arr[s1 + s2 + s3])
                        result = s1 + s2 + s3;
                    else if (arr[result] == arr[s1 + s2 + s3])
                        result = Math.min(result, s1 + s2 + s3);
                }
            }
        }

        str.append(result);
        System.out.print(str);
        sc.close();
    }

}