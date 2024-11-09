//Write a Java program to list the available character sets in charset objects.

import java.nio.charset.Charset;
import java.util.SortedMap;

public class exercise40 {
    public static void main(String[] args) {
        SortedMap<String, Charset> charsets = Charset.availableCharsets();
        
        System.out.println("List of available character sets:");
        for (String charsetName : charsets.keySet()) {
            System.out.println(charsetName);
        }
    }
}
