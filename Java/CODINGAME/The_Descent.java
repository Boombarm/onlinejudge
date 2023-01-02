import java.util.*;
import java.io.*;
import java.math.*;

/**
 * The while loop represents the game.
 * Each iteration represents a turn of the game
 * where you are given inputs (the heights of the mountains)
 * and where you have to print an output (the index of the mountain to fire on)
 * The inputs you are given are automatically updated according to your last actions.
 **/
class Player {
    
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // game loop
        while (true) {
            int max = 0;
            int maxIndex = 0;
            for (int i = 0; i < 8; i++) {
                int mountainH = Integer.parseInt(br.readLine()); // represents the height of one mountain, from 9 to 0. Mountain heights are provided from left to right.
                if (mountainH > max) {
                    max = mountainH;
                    maxIndex = i;
                }
            }

            System.out.println(maxIndex);
        }
    }
    
}