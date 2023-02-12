import exercice1.ListFilter;
import exercice2.CommaSeparated;
import exercice3.Exercice3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Exercice 1
        List<String> listChaine = new ArrayList<>();
        listChaine.add("agent");
        listChaine.add("operation");
        listChaine.add("ade");
        listChaine.add("htyty");
        listChaine.add("aba");
        listChaine.add("commis");
        listChaine.add("klklj");
        List<String> result = new ListFilter().search(listChaine);
        result.forEach(data-> System.out.println(data));

        //Exercice 2
        List<Integer> stringList = new ArrayList<>();
        stringList.add(3);
        stringList.add(44);
        System.out.println(new CommaSeparated().getString(stringList));

        //Exercice 3
        List<Integer> stringList2 = new ArrayList<>();
        stringList2.add(8);
        stringList2.add(-3);
        stringList2.add(-5);
        stringList2.add(12);
        stringList2.add(7);
        System.out.println("The max from item at index 1 to 3 is " + Exercice3.findMax(stringList2, 1, 3));

    }
}