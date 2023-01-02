package URI.Accepted.BEGINNER.sourcecode;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: BEGINNER
 * @Problem: 2764 - Date Input and Output
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2764
 * @Timelimit: 1 sec
 * @Status:  Accepted
 * @Memory: 844 Bytes
 * @Submission: 9/19/18, 3:24:32 PM
 * @Runtime: 0.112s
 * @Solution:
 * @Note:
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class P2764_Date_Input_and_Output {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String dateInput = br.readLine();
        try {
            Date date = new SimpleDateFormat("dd/MM/yy").parse(dateInput);
            String d1 = new SimpleDateFormat("MM/dd/yy").format(date);
            String d2 = new SimpleDateFormat("yy/MM/dd").format(date);
            String d3 = new SimpleDateFormat("dd-MM-YY").format(date);
            System.out.println(d1);
            System.out.println(d2);
            System.out.println(d3);
        } catch (Exception e) {

        }
    }
}
