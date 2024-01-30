package HWArray;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArraysHW {
    public static void main(String[] args) {
        ArrayList<String> langs = new ArrayList<>();
        langs.add("Java");
        langs.add("Python");
        langs.add("Perl");
        langs.add("C++");
        langs.add("Java");
        langs.add("C++");
        langs.add("C#");

        System.out.println(langs);

        ArrayList<String> uniqlangs = new ArrayList<>();

        for (int i = 0; i < langs.size(); i++) {
            String s = langs.get(i);
            if (!uniqlangs.contains(s)) {
                uniqlangs.add(s);
            }
        }
        System.out.println(uniqlangs);

    }
}

