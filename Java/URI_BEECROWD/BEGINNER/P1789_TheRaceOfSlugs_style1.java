package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1789 The Race of Slugs https://www.urionlinejudge.com.br/judge/en/problems/view/1789
//Accepted 09/06/2015 - 16:43:03 Runtime:0.308s
import java.util.Scanner;

public class P1789_TheRaceOfSlugs_style1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int speed = 0;
            for (int j = 0; j < n; j++) {
                int slug = sc.nextInt();
                if (slug < 10) {
                    int newSpeed = 1;
                    if (speed < newSpeed) {
                        speed = newSpeed;
                    }
                } else if (slug >= 10 && slug < 20) {
                    int newSpeed = 2;
                    if (speed < newSpeed) {
                        speed = newSpeed;
                    }
                } else {
                    int newSpeed = 3;
                    if (speed < newSpeed) {
                        speed = newSpeed;
                    }
                }
            }
            System.out.println(speed);
        }
    }
}
