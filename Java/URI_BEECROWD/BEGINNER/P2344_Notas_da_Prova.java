import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class P2344_Notas_da_Prova {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if (n == 0) {
            System.out.println("E");
        } else if (n >= 86) {
            System.out.println("A");
        } else if (n >= 61) {
            System.out.println("B");
        } else if (n >= 36) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
    }

}