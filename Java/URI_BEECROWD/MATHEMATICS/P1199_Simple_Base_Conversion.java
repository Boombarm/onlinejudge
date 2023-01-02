package  URI.Accepted.MATHEMATICS.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1199 Simple Base Conversion https://www.urionlinejudge.com.br/judge/en/problems/view/1199
//Accepted 13/10/2015 - 08:49:32 Runtime:0.356s
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1199_Simple_Base_Conversion {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String num = br.readLine();
            if (num.equals("-1")) {
                break;
            }
            if (num.startsWith("0x")) {
                System.out.println(Long.decode(num));
            } else {
                System.out.println("0x" + Long.toHexString(Long.parseLong(num)).toUpperCase());
            }
        }
    }

}
