package  URI.Accepted.BEGINNER.sourcecode;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1040 Average 3 https://www.urionlinejudge.com.br/judge/en/problems/view/1040
//Accepted 09/08/2015 - 14:43:19 Runtime:0.060s
public class P1040_Average3 {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.0");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        float n1 = sc.nextFloat();
        float n2 = sc.nextFloat();
        float n3 = sc.nextFloat();
        float n4 = sc.nextFloat();
        float media = ((2 * n1) + (3 * n2) + (4 * n3) + (1 * n4)) / (2 + 3 + 4 + 1);
        System.out.println("Media: " + df.format(media));

        if (media < 5.0) {
            System.out.println("Aluno reprovado.");
        } else if (media >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else {
            System.out.println("Aluno em exame.");
            float f = sc.nextFloat();
            System.out.println("Nota do exame: " + f);
            float mediaFinal = (media + f) / 2;
            if (media >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.println("Media final: " + df.format(mediaFinal));

        }
    }

}
