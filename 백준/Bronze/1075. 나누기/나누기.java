import java. util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int F = sc.nextInt();
        
        int last = (N/100)*100;
        for(int i=0; i<100; i++){
            if ((last + i) % F == 0) {
                System.out.printf("%02d\n", i);
                break;
            }
        }
        sc.close();
    }
}