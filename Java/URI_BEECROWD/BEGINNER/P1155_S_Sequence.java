package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1155 S Sequence https://www.urionlinejudge.com.br/judge/en/problems/view/1155
//Accepted 14/08/2015 - 10:42:26 Runtime:0.040s
import java.text.DecimalFormat;

public class P1155_S_Sequence {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        double S = 1;
        for (int i = 2; i <= 100; i++) {
            S += 1.0 / i;
        }
        System.out.println(df.format(S));
    }

}
