/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: String
 * @Problem: 2692 - Zoeiro Keyboard
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2692
 * @Timelimit: 1 sec
 * @LANGUAGE: C (gcc 4.8.5)
 * @Status: Accepted
 * @Submission: 2/22/18, 3:41:04 PM
 * @Runtime: 0.000s
 * @Solution: mapping character
 * @Note:
 */
#include <stdio.h>

int i,j,n,m;
char e,s;
char map[260];
char str[1000];

int main(void) {
	scanf("%d %d", &n, &m);
	for(i=0; i < 256; i++){
	    map[i] = (char)i;
	}
	for(i = 0; i < n; i++){
	    scanf("%s %s", &e, &s);
	    map[e] = s;
	    map[s] = e;
	}
	for(i = 0; i < m; i++){
	    scanf (" %[^\n]", str);
	    for(j = 0; str[j] != '\0'; j++){
	         printf("%c",map[str[j]]);
	    }
	    printf("\n");
	}
	
	return 0;
}