package  URI.Accepted.DATA_STRUCTURES_AND_LIBRARIES.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1874 Pushing Blocks https://www.urionlinejudge.com.br/judge/en/problems/view/1874
//Accepted 28/09/2015 - 07:31:11 Runtime:0.060s
import java.util.Scanner;

public class P1874_Pushing_Blocks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            int blockAmount = sc.nextInt();
            int putLine = w - 1;
            int putIndex = 0;

            if (h == 0 && w == 0 && blockAmount == 0) {
                break;
            }
            int[][] base = new int[h][w];
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    base[i][j] = sc.nextInt();
                    if (base[i][j] == 0) {
                        putLine = j;
                        putIndex = i;
                    }
                }
            }
            int[] blocks = new int[blockAmount];
            for (int i = 0; i < blockAmount; i++) {
                blocks[i] = sc.nextInt();
            }

            int blockQueue = 0;
            while (true) {

                if (blockQueue == blockAmount || putLine == -1) {
                    break;
                }

                if (base[putIndex][putLine] == 0) {
                    base[putIndex][putLine] = blocks[blockQueue];
                    blockQueue++;

                }

                if (putIndex == 0) {
                    putLine -= 1;
                    putIndex = h;
                }
                putIndex--;
            }

            //print
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    System.out.print(j < w - 1 ? base[i][j] + " " : base[i][j]);
                }
                System.out.println("");
            }

        }
    }
}
