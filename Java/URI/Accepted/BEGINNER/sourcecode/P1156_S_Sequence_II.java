package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1156 S Sequence II https://www.urionlinejudge.com.br/judge/en/problems/view/1156
//Accepted 14/08/2015 - 11:30:24 Runtime:0.036s
import java.text.DecimalFormat;

public class P1156_S_Sequence_II {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        double S = 1;
        for (int i = 2, j = 3; j <= 39; i *= 2, j += 2) {
            S += (double) j / i;
        }
        System.out.println(df.format(S));
    }

}
