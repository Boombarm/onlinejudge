package th.in.devboom.uri.accepted;

/**
 * Created by Teerapat-BSD on 1/10/2018.
 * Answer : Accepted
 * Runtime : 0.036s
 * Submission: 1/10/18, 5:36:25 PM
 */
import java.util.Scanner;

public class P2721_Indecision_of_Reindeers {

    public static void main(String[] args) {
        String[] name = new String[]{"Rudolph", "Dasher", "Dancer", "Prancer", "Vixen", "Comet", "Cupid", "Donner", "Blitzen"};
        Scanner sc = new Scanner(System.in);
        int total = 0;
        for (int i = 0; i < 9; i++) {
            total += sc.nextInt();
        }
        System.out.println(name[total % 9]);
    }
}
