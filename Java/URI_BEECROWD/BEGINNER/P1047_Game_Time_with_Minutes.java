package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1047 Game Time with Minutes https://www.urionlinejudge.com.br/judge/en/problems/view/1047
//Accepted 12/08/2015 - 08:10:37 Runtime:0.080s
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class P1047_Game_Time_with_Minutes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startHour = sc.nextInt();
        int startMinute = sc.nextInt();
        int endHour = sc.nextInt();
        int endMinute = sc.nextInt();

        if (startHour == endHour && startHour == startMinute && startMinute == endMinute) {
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        } else {
            SimpleDateFormat sdf = new SimpleDateFormat("d H:m");

            String date1 = "1 " + startHour + ":" + startMinute;
            String date2 = "2 " + endHour + ":" + endMinute;

            try {
                Date d1 = sdf.parse(date1);
                Date d2 = sdf.parse(date2);

                //in milliseconds
                long diff = d2.getTime() - d1.getTime();
                long diffMinutes = diff / (60 * 1000) % 60;
                long diffHours = diff / (60 * 60 * 1000) % 24;
                System.out.println("O JOGO DUROU " + diffHours + " HORA(S) E " + diffMinutes + " MINUTO(S)");

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}
