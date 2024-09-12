import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> dog = new ArrayList<>();
        dog.add("|\\_/|");
        dog.add("|q p|   /}");
        dog.add("( 0 )\"\"\"\\");
        dog.add("|\"^\"`    |");
        dog.add("||_/=\\\\__|");
        
        for (String line : dog) {
            System.out.println(line);
        }
    }
}