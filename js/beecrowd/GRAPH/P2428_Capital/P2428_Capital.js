/*
Author : Teerapat Phokhonwong
Problem: 2428 - Capital
Link: https://www.beecrowd.com.br/judge/en/problems/view/2428
Answer: Accepted
Submission: 12/18/22, 6:42:37 PM
Runtime: 0.365s
*/
// var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var input = require('fs').readFileSync(__dirname+'/in.txt', 'utf8');
var lines = input.split('\n');

const [a, b, c, d] = lines.shift().split(" ");
if (a / b == c / d || a / b == d / c || a / c == b / d || a / c == d / b || a / d == b / c || a / d == c / b) {
    console.log("S");
}
else{
    console.log("N");
}