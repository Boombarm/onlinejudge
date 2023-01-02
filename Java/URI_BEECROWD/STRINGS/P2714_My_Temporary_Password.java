package th.in.devboom.uri.accepted;

/**
 * Created by Teerapat-BSD on 1/24/2018.
 * Answer : Accepted
 * Runtime : 0.032s
 * Submission : 1/24/18, 11:26:28 AM
 */

import java.io.*;

public class P2714_My_Temporary_Password {

    static long number;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            String tmp = br.readLine();
            if (!isValidPattern(tmp)) {
                bw.append("INVALID DATA\n");
            } else {
                bw.append(number + "\n");
            }
        }
        bw.flush();
    }

    static boolean isValidPattern(String p) {
        int length = p.length();
        if (length < 20 || length > 20) {
            return false;
        } else if (!p.startsWith("RA")) {
            return false;
        }
        try {
            number = Long.parseLong(p.substring(2, 20));
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
