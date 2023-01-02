/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: AD-HOC
 * @Problem: 1619 - Date Difference
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1619
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 1/27/17, 8:20:10 PM
 * @Runtime: 0.244s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class P1619_Date_Difference {

    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream(System.out);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        format.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date d1, d2;
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            String[] date = br.readLine().split(" ");
            int answer = 0;
            if (!date[0].equals(date[1])) {
                d2 = format.parse(date[0]);
                d1 = format.parse(date[1]);
                long diferencaDias = (d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24);
                answer = (int) Math.abs(diferencaDias);
            }
            out.write((answer + "\n").getBytes());
        }
        out.flush();
    }

}
