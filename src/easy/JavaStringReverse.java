package easy;

import java.util.Scanner;

public class JavaStringReverse {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i)!=A.charAt(A.length()-1-i)){
                System.out.println("No");
                sc.close();
                return;
            }            
        }
        System.out.println("Yes");
    }   
    
}
