package  URI.Accepted.BEGINNER.sourcecode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1042 Simple Sort https://www.urionlinejudge.com.br/judge/en/problems/view/1042
//Accepted 06/08/2015 - 14:31:08 Runtime:0.056s 
public class P1042_SimpleSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        list.add(a);
        list.add(b);
        list.add(c);
        Collections.sort(list);
        for (int i = 0; i < 3; i++) {
            System.out.println(list.get(i));
        }

        System.out.println("\n" + a + "\n" + b + "\n" + c);
    }

}
