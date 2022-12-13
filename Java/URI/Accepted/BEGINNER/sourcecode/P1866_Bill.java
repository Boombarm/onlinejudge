/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1866 Bill
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1866
 * @Timelimit: 1 sec
 * @Status: Accepted 17/11/2015 - 07:13:20 Runtime:0.036s
 * @Solution:
 */
package  URI.Accepted.BEGINNER.sourcecode;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class P1866_Bill {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream(System.out);
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num % 2 == 0) {
                out.write("0\n".getBytes());
            } else {
                out.write("1\n".getBytes());
            }
        }
        out.flush();

    }

}

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        if (n >= 1 && n < 1000) {
//            for (int i = 0; i < n; i++) {
//                int num = sc.nextInt();
//                int sum = 0;
//                for (int j = 1; j <= num; j++) {
//                    if (j % 2 == 1) {
//                        sum += 1;
//                    } else {
//                        sum -= 1;
//                    }
//                }
//                System.out.println(sum);
//            }
//        }
