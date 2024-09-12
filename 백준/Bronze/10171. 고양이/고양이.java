import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<String> cat = new ArrayList<>();
        cat.add("\\    /\\");
        cat.add(" )  ( ')");
        cat.add("(  /  )");
        cat.add(" \\(__)|");
        
        for (String line : cat) {
            System.out.println(line);
        }
    }
}

