package  URI.Accepted.AD_HOC.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1546 Feedback https://www.urionlinejudge.com.br/judge/en/problems/view/1546
//Accepted 01/10/2015 - 23:56:00 Runtime:0.188s
import java.util.Scanner;

public class P1546_Feedback {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int numAmount = sc.nextInt();
            for (int j = 0; j < numAmount; j++) {
                int num = sc.nextInt();
                switch (num) {
                    case 1:
                        System.out.println("Rolien");
                        break;
                    case 2:
                        System.out.println("Naej");
                        break;
                    case 3:
                        System.out.println("Elehcim");
                        break;
                    case 4:
                        System.out.println("Odranoel");
                        break;
                }
            }
        }
    }

}
