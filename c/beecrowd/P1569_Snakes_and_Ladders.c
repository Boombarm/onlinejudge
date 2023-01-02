/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: Ad-Hoc
 * @Problem: 1569 - Snakes and Ladders
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1569
 * @Timelimit: 1 sec
 * @Language: C (GCC 4.8.5)
 * @Status: Accepted
 * @Submission: 2/22/18, 12:47:37 PM
 * @Runtime: 0.368s
 * @Solution:
 * @Note: Snake and Ladder game
 */
#include <stdio.h>


int i,t, players , totalSnakeLadder, dice, start, end , p , roll;
int playerIndex[1000005];
int map[110];

int main(void) {
	scanf("%d", &t);
	while(t){
	    scanf("%d %d %d", &players, &totalSnakeLadder, &dice);
	    for(i = 1; i <= players; i++){
	        playerIndex[i] = 1;
	    }
	    for(i = 1; i <= 100; i++){
	        map[i] = -1;
	    }
	    for(i = 0; i < totalSnakeLadder; i++){
	        scanf("%d %d", &start, &end);
	        map[start] = end;
	    }
	   
	    p = 1;
	    int gameOver = 0;
	    int n = players+1;
	    for(i = 0; i < dice; i++){
	        scanf("%d", &roll);
	        if(!gameOver){
	            playerIndex[p] += roll;
	            if(playerIndex[p] > 100){
	                playerIndex[p] = 100;
	            }
	            
	            if(map[playerIndex[p]] != -1){
                    playerIndex[p] = map[playerIndex[p]];
	            }
                
                if (playerIndex[p] == 100) {
                    gameOver = 1;
                }
                
                p++;
                p%= n;
                if(!p){
                    p = 1;
                }
	        }
	    }
	    for(i = 1; i <= players; i++){
	        printf("Position of player %d is %d.\n",i, playerIndex[i]);
	    }
	    t--;
	}
	return 0;
}

