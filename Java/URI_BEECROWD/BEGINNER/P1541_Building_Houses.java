package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1541 Building Houses https://www.urionlinejudge.com.br/judge/en/problems/view/1541
//Accepted 08/09/2015 - 09:50:52 Runtime:0.072s
import java.util.Scanner;

public class P1541_Building_Houses {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = sc.nextInt();
            if (a == 0) {
                break;
            }
            int b = sc.nextInt();
            if (b == 0) {
                break;
            }
            int c = sc.nextInt();
            if (c == 0) {
                break;
            }

            if ((a >= 1 && a <= 1000) && (b >= 1 && b <= 1000) && (c >= 1 && c <= 1000)) {
                int sizeHouse = ((a * b) * 100) / c;
                int answer = (int) Math.sqrt(sizeHouse);
                System.out.println(answer);
            }
        }

    }

}
