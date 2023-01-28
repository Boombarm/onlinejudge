import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2003_Sunday_Morning {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;
        while ((input = br.readLine()) != null) {
            String[] st = input.split(":");
            int hour = Integer.parseInt(st[0]);
            int minite = Integer.parseInt(st[1]);
            if (hour < 7 || hour == 7 && minite == 0) {
                bw.append("Atraso maximo: 0\n");
            } else {
                int late = (hour - 7) * 60;
                late += minite;
                bw.append("Atraso maximo: " + late + "\n");
            }
        }
        bw.flush();
    }

}
