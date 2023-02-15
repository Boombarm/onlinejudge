import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class P2408_Vice_Campeao {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        int A = Integer.parseInt(st[0]);
        int B = Integer.parseInt(st[1]);
        int C = Integer.parseInt(st[2]);
        if (A > C) A = A ^ C ^ (C = A);
        if (A > B) A = A ^ B ^ (B = A);
        if (B > C) B = B ^ C ^ (C = B);
        System.out.println(B);
    }

}