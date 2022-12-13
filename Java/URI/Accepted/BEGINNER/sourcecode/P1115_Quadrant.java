package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1115 Quadrant https://www.urionlinejudge.com.br/judge/en/problems/view/1115
//Accepted 14/08/2015 - 12:05:38 Runtime:0.044s
import java.util.Scanner;

public class P1115_Quadrant {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            if (X == 0 || Y == 0) {
                break;
            }
            if (X > 0 && Y > 0) {
                System.out.println("primeiro");
            } else if (X > 0 && Y < 0) {
                System.out.println("quarto");
            } else if (X < 0 && Y < 0) {
                System.out.println("terceiro");
            } else if (X < 0 && Y > 0) {
                System.out.println("segundo");
            }
        }
    }

}
