import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[][] arr = new char[5][15];
        String s = "";

        for(int i = 0; i < arr.length; i++){
            s = br.readLine();
            for(int j = 0; j < s.length(); j++){
                arr[i][j] = s.charAt(j);
            }
        }

        for(int j = 0; j < 15; j++){
            for(int i = 0; i < 5; i++){
                if(arr[i][j] == '\0') continue;
                System.out.print(arr[i][j]);
            }
        }
        br.close();
    }
}