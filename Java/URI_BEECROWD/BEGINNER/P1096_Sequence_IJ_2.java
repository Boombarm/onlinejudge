package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1096 Sequence IJ 2 https://www.urionlinejudge.com.br/judge/en/problems/view/1096
//Accepted 11/08/2015 - 12:55:03 Runtime:0.036s 
public class P1096_Sequence_IJ_2 {

    public static void main(String[] args) {
        int i = 1;
        int j = 7;
        while (true) {
            if (j < 5) {
                j = 7;
                i += 2;
            }
            if (i > 9) {
                break;
            }
            System.out.println("I=" + i + " J=" + j);
            j--;
        }
    }

}
