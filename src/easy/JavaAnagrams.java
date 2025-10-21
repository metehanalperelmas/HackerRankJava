package easy;

import java.util.Scanner;

public class JavaAnagrams {
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        
        String alow = a.toLowerCase();
        String blow = b.toLowerCase();

        for (int i = 0; i < alow.length(); i++) {
            char currentChar = alow.charAt(i);
            int countInA = 0;
            int countInB = 0;
            
            for (int j = 0; j < alow.length(); j++) {
                if (alow.charAt(j) == currentChar) countInA++;
                if (blow.charAt(j) == currentChar) countInB++;
            }
            if (countInA != countInB) {
                return false;
            }
        }
        
        return true;
    }
    
}
