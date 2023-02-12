package exercice2;

import java.util.List;

public class CommaSeparated {
    String commaSeparated = "";

    public String getString(List<Integer> list) {
        list.forEach(data -> {
            commaSeparated += data.intValue() % 2 == 0 ? "e" + data : "o" + data;
            commaSeparated += ",";
        });
        //Suppression de la dernière virgule
        commaSeparated = commaSeparated.substring(0, commaSeparated.length() - 1);
        return commaSeparated;
    }
}
