package com.practice.app;
import java.util.ArrayList;
public class CountingDuplicates {
    public static int duplicateCount(String text) {
        text = text.toLowerCase();
        ArrayList<String> dupes = new ArrayList<String>();
        for (int i = 0; i < text.length(); i++) {
            for (int j = i + 1; j < text.length(); j++) {
                if ((text.charAt(i) == text.charAt(j)) && (!dupes.contains(Character.toString(text.charAt(i))))) {
                    String s = Character.toString(text.charAt(i));
                    dupes.add(s);
                }
            }
        }
        return dupes.size();
    }

}