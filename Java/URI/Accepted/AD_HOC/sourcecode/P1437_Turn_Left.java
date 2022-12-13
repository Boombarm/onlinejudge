package  URI.Accepted.AD_HOC.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1437 https://www.urionlinejudge.com.br/judge/en/problems/view/1437
//Accepted 02/10/2015 - 01:36:45 Runtime:0.204s
import java.util.Scanner;

public class P1437_Turn_Left {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            String command = sc.next();
            String face = "N";
            for (int i = 0; i < n; i++) {
                if (command.charAt(i) == 'E') {
                    if (face.equals("N")) {
                        face = "O";

                    } else if (face.equals("O")) {
                        face = "S";

                    } else if (face.equals("S")) {
                        face = "L";

                    } else if (face.equals("L")) {
                        face = "N";

                    }
                } else {
                    if (face.equals("N")) {
                        face = "L";

                    } else if (face.equals("L")) {
                        face = "S";

                    } else if (face.equals("S")) {
                        face = "O";

                    } else if (face.equals("O")) {
                        face = "N";

                    }
                }
            }
            System.out.println(face);
        }
    }

}
