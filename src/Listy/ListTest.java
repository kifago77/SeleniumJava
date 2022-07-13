package Listy;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Piotr");
        names.add("Marcin");
        names.add("Mikolaj");
        names.add("Sylwia");

        System.out.println(names.size());
        System.out.println(names.contains("Ewa"));
        System.out.println(names.get(2));
        System.out.println(names.isEmpty());
        System.out.println(names.indexOf("Sylwia"));

       List<String> difNames = new ArrayList<>();
       difNames.addAll(names);
        System.out.println(names);

        for (int i=0; i<names.size();i++){
            System.out.println(names.get(i));
        }
        for (String name: names){
            System.out.print(name);
        }
    }
}
