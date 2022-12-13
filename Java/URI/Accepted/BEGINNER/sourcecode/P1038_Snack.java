package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1038 Snack https://www.urionlinejudge.com.br/judge/en/problems/view/1038
//Accepted 06/08/2015 - 14:03:57 Runtime:0.044s
import java.text.DecimalFormat;
import java.util.Scanner;

public class P1038_Snack {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);
        int productCode = sc.nextInt();
        int quantity = sc.nextInt();

        switch (productCode) {
            case 1:
                System.out.println("Total: R$ " + df.format(4.00 * quantity));
                break;
            case 2:
                System.out.println("Total: R$ " + df.format(4.50 * quantity));
                break;
            case 3:
                System.out.println("Total: R$ " + df.format(5.00 * quantity));
                break;
            case 4:
                System.out.println("Total: R$ " + df.format(2.00 * quantity));
                break;
            case 5:
                System.out.println("Total: R$ " + df.format(1.50 * quantity));
                break;

        }
    }

}
