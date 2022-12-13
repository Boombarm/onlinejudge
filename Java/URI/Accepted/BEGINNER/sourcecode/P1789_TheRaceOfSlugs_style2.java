package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1789 The Race of Slugs https://www.urionlinejudge.com.br/judge/en/problems/view/1789
//Accepted 12/06/2015 - 18:37:10 Runtime:0.352s 
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P1789_TheRaceOfSlugs_style2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> slug = new ArrayList<Integer>();
        while (sc.hasNext()) {
            int n = sc.nextInt();
            slug.clear();
            for (int i = 0; i < n; i++) {
                slug.add(sc.nextInt());
            }
            Collections.sort(slug);
            int check = slug.get(n - 1);
            if (check >= 20) {
                System.out.println("3");
            }
            if (check >= 10 && check < 20) {
                System.out.println("2");
            } else if (check > 0 && check < 10) {
                System.out.println("1");
            }
        }
    }
}
