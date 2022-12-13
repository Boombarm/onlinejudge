package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1929 Triangle https://www.urionlinejudge.com.br/judge/en/problems/view/1929
//Accepted 18/09/2015 - 15:56:13 Runtime:0.072s
import java.util.Arrays;
import java.util.Scanner;

public class P1929_Triangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[4];
        for (int i = 0; i < 4; i++) {
            num[i] = sc.nextInt();
        }
        Arrays.sort(num);
        if (((num[0] + num[1]) > num[3]) || ((num[0] + num[1]) > num[2]) || ((num[1] + num[2]) > num[3])) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }

    }
}
