package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1864 Our Days Are Never Coming Back https://www.urionlinejudge.com.br/judge/en/problems/view/1864
//Accepted 14/08/2015 - 13:12:31 Runtime:0.056s
import java.util.Scanner;

public class P1864_Our_Days_Are_Never_Coming_Back {

    public static void main(String[] args) {
        String text = "LIFE IS NOT A PROBLEM TO BE SOLVED";
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N >= 1 && N <= 34) {
            System.out.println(text.substring(0, N));
        }
    }

}
