package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1013 The Greatest https://www.urionlinejudge.com.br/judge/en/problems/view/1013
//Accepted 10/06/2015 - 12:51:12 Runtime:0.048s 
//2 Greatest
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1013_TheGreatest {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        int a = Integer.parseInt(st[0]);
        int b = Integer.parseInt(st[1]);
        int c = Integer.parseInt(st[2]);
        int maior = (a + b + Math.abs(a - b)) / 2;
        maior = (maior + c + Math.abs(maior - c)) / 2;
        System.out.println(maior + " eh o maior");

        //runtime 0.68
//        int max = 0;
//        for (int i = 0; i < 3; i++) {
//            int num = Integer.parseInt(st[i]);
//            if (num > max) {
//                max = num;
//            }
//        }
//        System.out.println(max + " eh o maior");
    }
}
