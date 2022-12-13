package  URI.Accepted.AD_HOC.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1542 Reading Books https://www.urionlinejudge.com.br/judge/en/problems/view/1542
//Accepted 05/10/2015 - 10:27:49 Runtime:0.096s 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1542_Reading_Books {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String t = br.readLine();
            if (t.equals("0")) {
                break;
            }
            String[] s = t.split(" ");
            int q = Integer.parseInt(s[0]);//amount of pages read per day.
            int d = Integer.parseInt(s[1]);//number of days you could speed up
            int p = Integer.parseInt(s[2]);//reading the amount of pages
            double re = (double) (q * d) / -(q - p);
            int answer = (int) ((re + d) * q);

            if (answer == 1) {
                System.out.println("1 pagina");
            } else {
                System.out.println(answer + " paginas");
            }
        }
    }

}
