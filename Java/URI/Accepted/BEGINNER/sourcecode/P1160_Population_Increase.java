package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1160 Population Increase https://www.urionlinejudge.com.br/judge/en/problems/view/1160
//Accepted 14/08/2015 - 10:28:03 Runtime:0.208s
import java.util.Locale;
import java.util.Scanner;

public class P1160_Population_Increase {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        if (T >= 1 && T <= 3000) {
            for (int i = 0; i < T; i++) {
                int PA = sc.nextInt();
                int PB = sc.nextInt();
                double G1 = sc.nextDouble();
                double G2 = sc.nextDouble();
                int year = 0;
                if (PA >= 100 && PA <= 1000000 && PB >= 100 && PB <= 1000000
                        && G1 >= 0.1 && G1 <= 10.0 && G2 >= 0.0 && G2 <= 10.0
                        && PA < PB && G2 < G1) {
                    G1 = G1 / 100;
                    G2 = G2 / 100;
                    while (PA <= PB) {
                        PA += PA * G1;
                        PB += PB * G2;
                        year++;
                        if (year == 101) {
                            break;
                        }
                    }

                    if (year == 101) {
                        System.out.println("Mais de 1 seculo.");
                    } else {
                        System.out.println(year + " anos.");
                    }
                }
            }
        }
    }
}
