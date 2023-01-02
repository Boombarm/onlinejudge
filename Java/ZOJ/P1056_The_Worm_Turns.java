package ZOJ;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: ZOJ
 * @Problem: 1056 The Worm Turns
 * @Link: http://acm.zju.edu.cn/onlinejudge/showProblem.do?problemCode=1056
 * @Timelimit: 2 Seconds
 * @Status: Accepted
 * @Submission: 2015-05-23 05:38:05
 * @Runtime: 16 ms
 * @Solution:
 * @Note:
 */
import java.util.Scanner;

public class P1056_The_Worm_Turns {


    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        while (true) {    
            
            //index [0] = head [19] = tail
            int wormBodyRow[] = {24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24};
            int wormBodyCol[] = {29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10};
            int nextHeadRow = 24,nextHeadCol = 29;
            String board[][] = new String[50][50];
            for (int i = 0; i < wormBodyRow.length; i++) {
                if(i==0) board[wormBodyRow[i]][wormBodyCol[i]] = "T";
                else if(i==29) board[wormBodyRow[i]][wormBodyCol[i]] = "H";
                else board[wormBodyRow[i]][wormBodyCol[i]] = "B";
            }

            int lengthMove = sc.nextInt();
            int moving = 0;
            if(lengthMove != 0 && lengthMove < 100){
                int answerType = 0;
                String moveInput = sc.next();
                char[] move = moveInput.toCharArray();
                int outputCase = 1;
                for (int i = 0; i < lengthMove; i++) {
                    char m = move[i];
                    if(m == 'N'){
                        nextHeadRow--;
                    }
                    else if(m == 'S'){
                        nextHeadRow++;
                    }
                    else if(m == 'E'){
                        nextHeadCol++;
                    }
                    else if(m == 'W'){
                        nextHeadCol--;
                    }
                    moving++;

                    if( nextHeadCol < 0     ||
                        nextHeadRow < 0     ||
                        nextHeadCol > 49    || 
                        nextHeadRow > 49    
                    ){
                        answerType = 2;
                        break;
                    }
                    else if( ( board[nextHeadRow][nextHeadCol]) == null || ( board[nextHeadRow][nextHeadCol]).equals("T")){
                            for (int j = wormBodyRow.length-1; j > 0; j--) {
                                if(j == wormBodyRow.length-1){//tail move
                                    board[wormBodyRow[j-1]][wormBodyCol[j-1]] = "T";
                                    board[wormBodyRow[j]][wormBodyCol[j]] = null;
                                }
                                else{//body move
                                    board[wormBodyRow[j-1]][wormBodyCol[j-1]] = "B";
                                }
                                wormBodyRow[j] = wormBodyRow[j-1];
                                wormBodyCol[j] = wormBodyCol[j-1];
                            }
                            wormBodyRow[0] = nextHeadRow;
                            wormBodyCol[0] = nextHeadCol;
                            board[nextHeadRow][nextHeadCol] = "H";
                    }
                    else if( board[nextHeadRow][nextHeadCol] == "B"){
                        answerType = 1;
                        break;
                    }
                       
                }
                //printAnswer
                switch(answerType){
                    case 0:
                        System.out.println("The worm successfully made all "+moving+" moves.");
                        break;
                    case 1:
                        System.out.println("The worm ran into itself on move "+moving+".");
                        break;
                    case 2:
                        System.out.println("The worm ran off the board on move "+moving+".");
                        break;
                }
            }
            else{
                break;
            }
        }
        
 
    }
    
    
    
}
