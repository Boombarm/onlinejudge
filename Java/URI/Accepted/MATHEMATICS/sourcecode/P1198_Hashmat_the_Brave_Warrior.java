package  URI.Accepted.MATHEMATICS.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1198 Hashmat the Brave Warrior https://www.urionlinejudge.com.br/judge/en/problems/view/1198
//Accepted 03/12/2015 - 08:55:42 Runtime:0.200s
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class P1198_Hashmat_the_Brave_Warrior {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream(System.out);
        String input;
        while ((input = br.readLine()) != null) {
            String[] st = input.split(" ");
            long num1 = Long.parseLong(st[0]);
            long num2 = Long.parseLong(st[1]);
            long answer = Math.abs(num2 - num1);
            out.write((answer + "\n").getBytes());
        }
        out.flush();
    }
}
