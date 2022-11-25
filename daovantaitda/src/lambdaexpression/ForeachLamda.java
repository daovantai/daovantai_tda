package lambdaexpression;

import java.util.ArrayList;
import java.util.List;

public class ForeachLamda {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("PHP");
        list.add("C++");
        list.forEach(s -> {
            System.out.println(s);  // coi s nhu la 1 interface trong bieu thuc Lamda tra ve 1 list
        });
    }
}
