package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1050 DDD https://www.urionlinejudge.com.br/judge/en/problems/view/1050
//Accepted 08/08/2015 - 10:04:33 Runtime:0.056s 
import java.util.Scanner;

public class P1050_DDD {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        switch (sc.nextInt()) {
            case 11:
                System.out.println("Sao Paulo");
                break;
            case 19:
                System.out.println("Campinas");
                break;
            case 21:
                System.out.println("Rio de Janeiro");
                break;
            case 27:
                System.out.println("Vitoria");
                break;
            case 31:
                System.out.println("Belo Horizonte");
                break;
            case 32:
                System.out.println("Juiz de Fora");
                break;
            case 61:
                System.out.println("Brasilia");
                break;
            case 71:
                System.out.println("Salvador");
                break;
            default:
                System.out.println("DDD nao cadastrado");
                break;
        }
        sc.close();
    }

}
