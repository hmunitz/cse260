package Lab6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by cebo4 on 9/26/2017.
 */
public class Alphabetical {
    public static ArrayList<String> createWordList(String str){
        str = str.toLowerCase();
        ArrayList<String> wordList = new ArrayList<>();
        String pattern = "[a-zA-Z]+";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(str);
        String temp = str;
        while(temp.length() > 0) {
            m.find();
            wordList.add(m.group(0));
            temp = str.substring(m.end());
        }
        return wordList;
    }

    private static void Alphabetize(ArrayList<String> strings){
        Collections.sort(strings);
    }

    private static String fileToString(Path path){
        //String str =
        try {
            System.out.println(Files.readAllLines(path));
            return "";
        }
        catch(IOException e){
            return "";
        }
    }

    public static void main(String args[]) {
        ArrayList<String> wordList =createWordList("The quick Brown Fox jumps over the lazy dog");
        System.out.println(wordList);
        Alphabetize(wordList);
        System.out.println(wordList);
    }
}
