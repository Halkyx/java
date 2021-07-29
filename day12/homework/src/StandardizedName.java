import java.util.ArrayList;
import java.util.Collections;

public class StandardizedName {

    public String standardizedName(String name) {
        ArrayList<String> subName = new ArrayList<String>();
        name = removeBlank(name);
        subName = this.cutString(name);
        stdSubName(subName);
        name = joinName(subName);
        return name;
    }

    public String removeBlank(String name) {
        name = name.trim();
        name = name.replaceAll("\\s+", " ");
        return name;
    }

    public ArrayList<String> cutString(String name) {
        ArrayList<String> result = new ArrayList<String>();
        Collections.addAll(result, name.split(" "));
        return result;
    }

    public void stdSubName(ArrayList<String> subName) {
        int index = 0;
        for (String string : subName) {
            index = subName.indexOf(string);
            string = string.toLowerCase();
            string = String.valueOf(string.substring(0, 1).toUpperCase() + string.substring(1) + " ");
            subName.set(index, string);
        }
    }

    public String joinName(ArrayList<String> name) {
        String result = name.stream().reduce("", String::concat);
        return result;
    }
}