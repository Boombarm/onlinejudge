package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1865 Mjölnir https://www.urionlinejudge.com.br/judge/en/problems/view/1865
//Accepted 06/09/2015 - 11:36:44 Runtime:0.076s 
import java.util.Scanner;

public class P1865_Mjolnir {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int num = sc.nextInt();
            if (name.equals("Thor")) {
                System.out.println("Y");
            } else {
                System.out.println("N");
            }
        }
    }

}
