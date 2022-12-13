package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1114 Fixed Password https://www.urionlinejudge.com.br/judge/en/problems/view/1114
//Accepted 11/08/2015 - 15:05:16 Runtime:0.052s
import java.util.Scanner;

public class P1114_Fixed_Password {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            if (sc.next().equals("2002")) {
                System.out.println("Acesso Permitido");
                break;
            } else {
                System.out.println("Senha Invalida");
            }
        }
    }

}
