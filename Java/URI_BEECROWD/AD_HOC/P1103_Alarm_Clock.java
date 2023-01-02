package  URI.Accepted.AD_HOC.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1103 Alarm Clock https://www.urionlinejudge.com.br/judge/en/problems/view/1103
//Accepted 01/10/2015 - 04:09:44 Runtime:0.108s
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class P1103_Alarm_Clock {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int h1 = sc.nextInt();
            int m1 = sc.nextInt();
            int h2 = sc.nextInt();
            int m2 = sc.nextInt();
            if (h1 == 0 && m1 == 0 && h2 == 0 && m2 == 0) {
                break;
            }

            SimpleDateFormat sdf = new SimpleDateFormat("d H:m");
            String date1 = "1 " + h1 + ":" + m1;
            String date2 = "2 " + h2 + ":" + m2;
            try {
                Date d1 = sdf.parse(date1);
                Date d2 = sdf.parse(date2);

                //in milliseconds
                long diff = d2.getTime() - d1.getTime();
                long min = diff / (60 * 1000) % 60;
                long hr = diff / (60 * 60 * 1000) % 24;

                System.out.println((hr > 0 ? hr * 60 : 0) + (min > 0 ? min : 0));

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

}
