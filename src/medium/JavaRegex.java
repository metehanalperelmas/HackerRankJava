package medium;

import java.util.Scanner;

public class JavaRegex {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }

}

class MyRegex {
    String zeroTo255 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
    // \\d{1,2}  1-2 haneli sayılar (0-99)
    // (0|1)\\d{2}  100-199 arası (0 veya 1 ile başlayan 3 haneli)
    // 2[0-4]\\d  200-249 arası (2 ile başlayan, ikinci hane 0-4)
    // 25[0-5]  250-255 arası
    public String pattern = zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255;
}
