import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2126_Searching_Subsequences {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        int c = 1;
        while (input != null) {
            int counting = 0;
            int lastPosition = 0;
            String text = br.readLine();
            int inputLenght = input.length();
            int textLenght = text.length();
            for (int i = 0; i < textLenght; i++) {
                if (input.charAt(0) == text.charAt(i) && ((i + inputLenght) <= textLenght)) {
                    boolean match = true;
                    for (int j = 0, k = i; j < inputLenght; j++, k++) {
                        if (input.charAt(j) != text.charAt(k)) {
                            match = false;
                            break;
                        }
                    }
                    if (match) {
                        counting++;
                        lastPosition = i + 1;
                    }
                }
            }
            bw.append("Caso #" + c + ":\n");
            bw.append(counting == 0 ? "Nao existe subsequencia" : "Qtd.Subsequencias: " + counting + "\n");
            bw.append(lastPosition == 0 ? "\n" : "Pos: " + lastPosition + "\n");
            bw.newLine();
            if ((input = br.readLine()) != null) {
                c++;
            }
        }
        bw.flush();
    }

}