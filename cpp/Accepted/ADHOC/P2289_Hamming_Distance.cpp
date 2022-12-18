/*
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: AD-HOC
 * @Problem: 2289 - Hamming Distance
 * @Link: https://www.beecrowd.com.br/judge/en/problems/view/2289
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 12/18/22, 5:38:52 PM
 * @Runtime: 0.468s
 * @Solution: Brian Kerninghan's Algorithm
 * @Note: นับ bit ที่แตกต่างกัน ระหว่างเลขฐานสอง สองตัว
 */
#include <iostream>
using namespace std;

int main(){
	unsigned long long x, y;
	while (cin >> x >> y){
		if (x == 0 && y == 0) break;
		unsigned count = 0;
		unsigned long long z = x ^ y;

		while (z > 0) 
            count += z & 1, z >>= 1;
		
		cout << count << endl;
	}

}