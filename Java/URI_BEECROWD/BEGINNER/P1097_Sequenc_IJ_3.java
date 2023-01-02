package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1097 Sequence IJ 3 https://www.urionlinejudge.com.br/judge/en/problems/view/1097
//Accepted 11/08/2015 - 13:59:10 Runtime:0.040s
public class P1097_Sequenc_IJ_3 {

    public static void main(String[] args) {
        int i = 1, j = 7, tmp = j, count = 3;
        while (true) {
            if (count == 0) {
                if (i == 9) {
                    break;
                }
                count = 3;
                j = tmp + 2;
                tmp = j;
                i += 2;
            }
            System.out.println("I=" + i + " J=" + j);
            j--;
            count--;

        }
    }

}
