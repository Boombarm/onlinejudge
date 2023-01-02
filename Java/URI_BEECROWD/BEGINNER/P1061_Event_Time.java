package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1061 Event Time https://www.urionlinejudge.com.br/judge/en/problems/view/1061
//Accepted 11/08/2015 - 09:49:21 Runtime:0.068s 
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class P1061_Event_Time {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day1, h1, m1, s1;
        int day2, h2, m2, s2;

        day1 = Integer.parseInt(sc.nextLine().split(" ")[1]);
        String[] time = sc.nextLine().split(" : ");
        h1 = Integer.parseInt(time[0]);
        m1 = Integer.parseInt(time[1]);
        s1 = Integer.parseInt(time[2]);

        day2 = Integer.parseInt(sc.nextLine().split(" ")[1]);
        time = sc.nextLine().split(" : ");
        h2 = Integer.parseInt(time[0]);
        m2 = Integer.parseInt(time[1]);
        s2 = Integer.parseInt(time[2]);

        int day_Answer = 0, hour_Answer = 0, minute_Answer = 0, second_Answer = 0;
        SimpleDateFormat format = new SimpleDateFormat("dd HH:mm:ss");
        String date1 = day1 + " " + h1 + ":" + m1 + ":" + s1;
        String date2 = day2 + " " + h2 + ":" + m2 + ":" + s2;
        try {
            Date d1 = format.parse(date1);
            Date d2 = format.parse(date2);

            //in milliseconds
            long diff = d2.getTime() - d1.getTime();

            long diffSeconds = diff / 1000 % 60;
            long diffMinutes = diff / (60 * 1000) % 60;
            long diffHours = diff / (60 * 60 * 1000) % 24;
            long diffDays = diff / (24 * 60 * 60 * 1000);

            System.out.println(diffDays + " dia(s)");
            System.out.println(diffHours + " hora(s)");
            System.out.println(diffMinutes + " minuto(s)");
            System.out.println(diffSeconds + " segundo(s)");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
