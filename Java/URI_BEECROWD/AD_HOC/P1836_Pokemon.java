package  URI.Accepted.AD_HOC.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1836 Pokémon! https://www.urionlinejudge.com.br/judge/en/problems/view/1836
//Accepted 11/09/2015 - 08:34:11 Runtime:0.140s
import java.util.Scanner;

public class P1836_Pokemon {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        if (T >= 1) {
            for (int i = 1; i <= T; i++) {
                String name = sc.next();
                int LV = sc.nextInt();
                int HP_B = sc.nextInt();
                int HP_IV = sc.nextInt();
                int HP_EV = sc.nextInt();
                int HP = (int) ((((HP_IV + HP_B + (Math.sqrt(HP_EV) / 8) + 50) * LV) / 50) + 10);

                int AT_B = sc.nextInt();
                int AT_IV = sc.nextInt();
                int AT_EV = sc.nextInt();
                int AT = (int) (((AT_IV + AT_B + (Math.sqrt(AT_EV) / 8)) * LV) / 50) + 5;

                int DF_B = sc.nextInt();
                int DF_IV = sc.nextInt();
                int DF_EV = sc.nextInt();
                int DF = (int) (((DF_IV + DF_B + (Math.sqrt(DF_EV) / 8)) * LV) / 50) + 5;

                int SP_B = sc.nextInt();
                int SP_IV = sc.nextInt();
                int SP_EV = sc.nextInt();
                int SP = (int) (((SP_IV + SP_B + (Math.sqrt(SP_EV) / 8)) * LV) / 50) + 5;

                System.out.println("Caso #" + i + ": " + name + " nivel " + LV);
                System.out.println("HP: " + HP);
                System.out.println("AT: " + AT);
                System.out.println("DF: " + DF);
                System.out.println("SP: " + SP);
            }
        }
    }
}
