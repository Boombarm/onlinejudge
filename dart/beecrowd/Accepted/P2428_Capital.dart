/*
Author : Teerapat Phokhonwong
Problem: 2428 - Capital
Link: https://www.beecrowd.com.br/judge/en/problems/view/2428
Answer: Accepted
Submission: 12/18/22, 6:54:13 PM
Runtime: 0.990s
*/
import 'dart:io';
import 'dart:convert';

void main()
{
    String input = stdin.readLineSync();
    List<int> numbers = input.split(' ').map((s) => int.parse(s)).toList();
    int a = numbers[0];
    int b = numbers[1];
    int c = numbers[2];
    int d = numbers[3];
    if (a / b == c / d || a / b == d / c || a / c == b / d || a / c == d / b || a / d == b / c || a / d == c / b) {
        print("S");
    }
    else{
        print("N");
    }
}   