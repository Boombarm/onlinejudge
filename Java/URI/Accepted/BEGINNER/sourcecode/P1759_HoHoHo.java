package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1759 Ho Ho Ho https://www.urionlinejudge.com.br/judge/en/problems/view/1759
//Accepted 09/06/2015 - 15:51:56 Runtime:0.176s
import java.util.Scanner;

public class P1759_HoHoHo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(i < n - 1 ? "Ho " : "Ho!\n");
        }
    }
}
