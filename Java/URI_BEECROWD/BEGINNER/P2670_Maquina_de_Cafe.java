package th.in.devboom.uri.accepted;

/**
 * Created by Teerapat-BSD on 1/9/2018.
 * Answer : Accepted
 * Runtime : 0.040s
 * Submission : 1/9/18, 11:25:19 AM
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2670_Maquina_de_Cafe {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int f1 = Integer.parseInt(br.readLine());
        int f2 = Integer.parseInt(br.readLine());
        int f3 = Integer.parseInt(br.readLine());
        int a1 = (f2 * 2) + (f3 * 4);//f2 - > f1, f2 -> f1
        int a2 = (f1 * 2) + (f3 * 2);//f1 -> f2, f3 -> f2
        int a3 = (f1 * 4) + (f2 * 2);// f1 -> f3, f2 -> f3
        int answer = Math.min(Math.min(a1,a2), a3);
        System.out.println(answer);
    }
}
