import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
 **/
class Player {

    public static void main(String args[]) {
        
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTX = in.nextInt(); // Thor's starting X position
        int initialTY = in.nextInt(); // Thor's starting Y position

        // game loop
        while (true) {
            String move = "";
            int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.
            
            if(initialTY < lightY){
                move += "S";
                initialTY++;
            }
            else if(initialTY > lightY){
                move += "N";
                 initialTY--;
            }
            
            if(initialTX < lightX){
                move += "E";
                initialTX++;
            }
            else if(initialTX > lightX){
                move += "W";
                initialTX--;
            }
            

            System.out.println(move);
        }
        
    }
}