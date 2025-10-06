package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class JavaPrimalityTest {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        //String n = bufferedReader.readLine();
        BigInteger n = new BigInteger(bufferedReader.readLine());

        System.out.println((n.compareTo(BigInteger.ONE) > 0 && n.isProbablePrime(1)) ? "prime" : "not prime");

        bufferedReader.close();
    }

}
