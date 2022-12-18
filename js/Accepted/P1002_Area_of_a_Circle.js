var input = require('fs').readFileSync('/dev/stdin', 'utf8');

let pi = 3.14159;
let r = parseFloat(input);
let answer = pi * Math.pow(r, 2);
console.log('A='+answer.toFixed(4));