package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1858 Theon's Answer https://www.urionlinejudge.com.br/judge/en/problems/view/1858
//Accepted 07/09/2015 - 16:48:06 Runtime:0.064s
import java.util.Scanner;

public class P1858_Theons_Answer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 1 && n <= 100) {
            int smallest = 1;
            int numSmallest = 0;
            int index = 1;
            while (n != 0) {
                int num = sc.nextInt();
                if (num >= 0 && num <= 20) {
                    if (num < numSmallest || index == 1) {
                        numSmallest = num;
                        smallest = index;
                    }
                    index++;
                    n--;
                }
            }

            System.out.println(smallest);
        }
    }

}
