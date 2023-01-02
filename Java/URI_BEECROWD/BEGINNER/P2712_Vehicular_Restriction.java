package th.in.devboom.uri.accepted;

/**
 * Created by Teerapat-BSD on 1/10/2018.
 * Answer : Accepted
 * Runtime : 0.028s
 * Submission : 1/10/18, 4:08:21 PM
 */

import java.io.*;

public class P2712_Vehicular_Restriction {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String in = br.readLine();
            if (in.length() != 8) {
                bw.append("FAILURE\n");
            } else if (in.charAt(3) != '-') {
                bw.append("FAILURE\n");
            } else if (isValid(in)) {
                char c = in.charAt(7);
                switch (c){
                    case '1': bw.append("MONDAY\n");
                        break;
                    case '2': bw.append("MONDAY\n");
                        break;
                    case '3': bw.append("TUESDAY\n");
                        break;
                    case '4': bw.append("TUESDAY\n");
                        break;
                    case '5': bw.append("WEDNESDAY\n");
                        break;
                    case '6': bw.append("WEDNESDAY\n");
                        break;
                    case '7': bw.append("THURSDAY\n");
                        break;
                    case '8': bw.append("THURSDAY\n");
                        break;
                    case '9': bw.append("FRIDAY\n");
                        break;
                    case '0': bw.append("FRIDAY\n");
                        break;
                }
            } else {
                bw.append("FAILURE\n");
            }
        }
        bw.flush();
    }

    static boolean isValid(String code) {
        for (int i = 0; i < 3; i++) {
            if(!Character.isUpperCase(code.charAt(i))){
                return false;
            }
        }
        for (int i = 4; i < 8; i++) {
            if(!Character.isDigit(code.charAt(i))){
                return false;
            }
        }
        return true;
    }
}
