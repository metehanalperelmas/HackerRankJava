package easy;

import java.util.Scanner;

public class JavaLoops2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();  
            int b = in.nextInt();  
            int n = in.nextInt();  
            for (int j = 0; j < n; j++) {
                int x = 0;
                for (int j2 = 0; j2 <= j; j2++) {
                    x += (int)(Math.pow(2, j2) * b);
                }
                System.out.print(a + x + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
