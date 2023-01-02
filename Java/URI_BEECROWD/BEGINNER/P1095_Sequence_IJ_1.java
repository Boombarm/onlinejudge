package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1095 Sequence IJ 1 https://www.urionlinejudge.com.br/judge/en/problems/view/1095
//Accepted 11/08/2015 - 12:45:32 Runtime:0.036s
public class P1095_Sequence_IJ_1 {

    public static void main(String[] args) {
        int i = 1;
        int j = 60;
        while (true) {
            System.out.println("I=" + i + " J=" + j);
            if (j == 0) {
                break;
            }
            i += 3;
            j -= 5;
        }
    }

}
