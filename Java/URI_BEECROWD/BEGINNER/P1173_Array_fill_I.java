package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1173 Array fill I https://www.urionlinejudge.com.br/judge/en/problems/view/1173
//Accepted 24/08/2015 - 14:42:13 Runtime:0.052s 
import java.util.Scanner;

public class P1173_Array_fill_I {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int num = sc.nextInt();
        if (num < 50) {
            for (int i = 0, j = num; i < 10; i++, j *= 2) {
                arr[i] = j;
                System.out.println("N[" + i + "] = " + arr[i]);
            }
        }
    }

}
