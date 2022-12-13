package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1134 Type of Fuel https://www.urionlinejudge.com.br/judge/en/problems/view/1134
//Accepted 22/08/2015 - 23:37:55 Runtime:0.036s
import java.util.Scanner;

public class P1134_Type_of_Fuel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alcohol = 0, Gasoline = 0, Diesel = 0;
        while (true) {
            int num = sc.nextInt();
            if (num == 4) {
                break;
            }

            if (num == 1) {
                alcohol++;
            } else if (num == 2) {
                Gasoline++;
            } else if (num == 3) {
                Diesel++;
            }
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcohol);
        System.out.println("Gasolina: " + Gasoline);
        System.out.println("Diesel: " + Diesel);
    }

}
