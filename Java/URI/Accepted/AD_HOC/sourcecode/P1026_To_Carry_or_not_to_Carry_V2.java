package  URI.Accepted.AD_HOC.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1026 To Carry or not to Carry https://www.urionlinejudge.com.br/judge/en/problems/view/1026
//Accepted 28/10/2015 - 11:20:35 Runtime:0.244s
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.math.BigInteger;

public class P1026_To_Carry_or_not_to_Carry_V2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream(System.out);
        String line = "";
        while ((line = br.readLine()) != null) {
            String[] st = line.split(" ");
            BigInteger a = new BigInteger(st[0]);
            BigInteger b = new BigInteger(st[1]);
            out.write((a.xor(b).toString()+"\n").getBytes());
        }
        out.flush();
    }

}
