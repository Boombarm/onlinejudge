import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class P2456_Cards {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        int size = st.length;
        boolean increasingly = false, decreasingly = false;
        int a = Integer.parseInt(st[0]);
        int i = 1;
        for (; i < size; i++) {
            int b = Integer.parseInt(st[i]);
            if (a == b) {
                a = b;
                continue;
            } else if (a < b) {
                increasingly = true;
                if (decreasingly) {
                    System.out.println("N");
                    System.exit(0);
                }
            } else if (a > b) {
                decreasingly = true;
                if (increasingly) {
                    System.out.println("N");
                    System.exit(0);
                }

            }
            a = b;
        }
        if (increasingly) {
            System.out.println("C");
        } else if (decreasingly) {
            System.out.println("D");
        } else {
            System.out.println("N");
        }
    }

}