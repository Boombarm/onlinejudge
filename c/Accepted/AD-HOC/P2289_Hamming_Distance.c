/*
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: AD-HOC
 * @Problem: 2289 - Hamming Distance
 * @Link: https://www.beecrowd.com.br/judge/en/problems/view/2289
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 12/18/22, 5:34:08 PM
 * @Runtime: 0.071s
 * @Solution: 
 * @Note: นับ bit ที่แตกต่างกัน ระหว่างเลขฐานสอง สองตัว
 */
#include <stdio.h>

void main (){
	unsigned long long x, y;
	while (scanf("%llu %llu", &x, &y)){
		if (x == 0 && y == 0) break;
		unsigned count = 0;
		unsigned long long z = x ^ y;

		while (z > 0) 
            count += z & 1, z >>= 1;
		
		printf("%u\n", count);

	}

}