#include <iostream>
#include <cmath>
using namespace std;

int main(){
    int number_input = 1000;
    string n = to_string(number_input);
    int total_size = n.length();
    int answer = 0;
    int counter = 0;
    while( counter < (total_size - 1)){
        int base = int(pow(10, counter));
        answer += (9 * base) * (counter + 1);
        counter++;
    }
    answer += (int(number_input) - int(pow(10, counter)) + 1) * (counter + 1);
    cout << answer << endl;
    return 0;
}