package  URI.Accepted.COMPUTATIONAL_GEOMETRY.sourcecode;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1875 - Tribol
 * @Categories: COMPUTATIONAL GEOMETRY
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1875
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 02/10/2015 - 10:47:22
 * @Runtime: 0.068s
 * @Solution:
 * @Note:
 */
import java.util.Scanner;

public class P1875_Tribol {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int redScore = 0, greenScore = 0, blueScore = 0;
            int n2 = sc.nextInt();
            for (int j = 0; j < n2; j++) {
                String source = sc.next();
                String destination = sc.next();
                if (source.equals("R")) {
                    if (destination.equals("G")) {
                        redScore += 2;
                    } else if (destination.equals("B")) {
                        redScore += 1;
                    }
                } else if (source.equals("G")) {
                    if (destination.equals("B")) {
                        greenScore += 2;
                    } else if (destination.equals("R")) {
                        greenScore += 1;
                    }
                } else if (source.equals("B")) {
                    if (destination.equals("R")) {
                        blueScore += 2;
                    } else if (destination.equals("G")) {
                        blueScore += 1;
                    }
                }
            }

            if (redScore > greenScore && redScore > blueScore) {
                System.out.println("red");
            } else if (greenScore > redScore && greenScore > blueScore) {
                System.out.println("green");
            } else if (blueScore > redScore && blueScore > greenScore) {
                System.out.println("blue");
            } else if (redScore == greenScore && redScore == blueScore) {
                System.out.println("trempate");
            } else {
                System.out.println("empate");
            }
        }
    }

}
