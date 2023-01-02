package th.in.devboom.uri.accepted;


/**
 * Created by Teerapat-BSD on 1/9/2018.
 * Answer : Accepted
 * Runtime : 0.036s
 * Submission : 1/9/18, 12:43:00 PM
 */
import java.io.*;

public class P2630_Greyscale {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        double r, g, b;
        for (int i = 1; i <= t; i++) {
            int result = 0;
            String c = br.readLine();
            String[] in = br.readLine().split(" ");
            r = Double.parseDouble(in[0]);
            g = Double.parseDouble(in[1]);
            b = Double.parseDouble(in[2]);
            if (c.equals("eye")) {
                result = eye(r, g, b);
            } else if (c.equals("min")) {
                result = min(r, g, b);
            } else if (c.equals("max")) {
                result = max(r, g, b);
            } else if (c.equals("mean")) {
                result = mean(r, g, b);
            }
            bw.append("Caso #" + i + ": " + result + "\n");
        }
        bw.flush();
    }

    static int eye(double r, double g, double b) {
        return (int) ((r * 0.3) + (g * 0.59) + (b * 0.11));
    }

    static int mean(double r, double g, double b) {
        return (int) ((r + g + b) / 3);
    }

    static int min(double r, double g, double b) {
        return (int) Math.min(Math.min(r, g), b);
    }

    static int max(double r, double g, double b) {
        return (int) Math.max(Math.max(r, g), b);
    }

}
