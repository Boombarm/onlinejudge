package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1131 Grenais https://www.urionlinejudge.com.br/judge/en/problems/view/1131
//Accepted 23/08/2015 - 11:06:33 Runtime:0.044s
import java.util.Scanner;

public class P1131_Grenais {

    static int countGrenais = 0;
    static int countInter = 0;
    static int countGremio = 0;
    static int countDraws = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        while (true) {
            if (x == 2) {
                break;
            } else if (x == 1 || countGrenais == 0) {
                int inter = sc.nextInt();
                int gremio = sc.nextInt();
                if (inter > gremio) {
                    countInter++;
                } else if (gremio > inter) {
                    countGremio++;
                } else if (inter == gremio) {
                    countDraws++;
                }
            }
            System.out.println("Novo grenal (1-sim 2-nao)");
            countGrenais++;
            x = sc.nextInt();
        }

        System.out.println(countGrenais + " grenais");
        System.out.println("Inter:" + countInter);
        System.out.println("Gremio:" + countGremio);
        System.out.println("Empates:" + countDraws);
        if (countInter > countGremio) {
            System.out.println("Inter venceu mais");
        } else if (countGremio > countInter) {
            System.out.println("Gremio venceu mais");
        } else if (countInter == countGremio) {
            System.out.println("Nao houve vencedor");
        }
    }

}
