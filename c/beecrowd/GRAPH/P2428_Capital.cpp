/*
Author : Teerapat Phokhonwong
Problem: 2428 - Capital
Link: https://www.beecrowd.com.br/judge/en/problems/view/2428
Answer: Accepted
Submission: 12/18/22, 4:46:17 PM
Runtime: 0.000s
*/
#include <stdio.h>

float a, b, c, d;
int main()
{
    scanf("%d %d %d %d", &a, &b, &c, &d);
    if (a / b == c / d || a / b == d / c || a / c == b / d || a / c == d / b || a / d == b / c || a / d == c / b){
        printf("S\n");
    }
    else{
        printf("N\n");
    }
    return 0;
}