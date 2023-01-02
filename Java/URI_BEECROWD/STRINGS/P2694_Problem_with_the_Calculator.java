package th.in.devboom.uri.accepted;


/**
 * Created by Teerapat-BSD on 1/31/2018.
 * Answer : Accepted
 * Submission : 1/31/18, 3:06:13 PM
 * Runtime : 0.056s
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class P2694_Problem_with_the_Calculator {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            char[] s = br.readLine().toCharArray();
            String number = "";
            long answer = 0;
            for (char c : s) {
                if (Character.isDigit(c)) {
                    number += c;
                } else {
                    if (number.length() > 0) {
                        answer += Long.parseLong(number);
                    }
                    number = "";
                }
            }
            if (number.length() > 0) {
                answer += Long.parseLong(number);
            }
            bw.append(answer + "\n");
        }
        bw.flush();
    }
}
