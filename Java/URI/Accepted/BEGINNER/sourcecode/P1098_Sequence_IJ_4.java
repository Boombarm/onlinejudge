package  URI.Accepted.BEGINNER.sourcecode;

import java.text.DecimalFormat;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1098 Sequence IJ 4 https://www.urionlinejudge.com.br/judge/en/problems/view/1098
//Accepted 11/08/2015 - 14:29:51 Runtime:0.044s
public class P1098_Sequence_IJ_4 {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.#");
        float i = 0, j = 1;
        int count = 1;
        while (true) {
            if (count == 4) {
                count = 1;
                if (i > 2.0f) {
                    break;
                }
                i += 0.2;

            }
            System.out.println("I=" + df.format(i) + " J=" + df.format(count + i));
            count++;
        }
    }
}
