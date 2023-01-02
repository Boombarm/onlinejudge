/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: AD-HOC
 * @Problem: 1764 - Itinerary of Santa Claus
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1764
 * @Timelimit: 1 sec
 * @LANGUAGE: C++17
 * @Status: Accepted
 * @Submission: 2/5/19, 8:33:17 PM
 * @Runtime: 0.100s
 * @Solution: MST by Kruskal
 * @Note:
 */

#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int M, N, source,destination,weight, sum ;
int p[50005],h[50005];


struct Edge {
    int source, destination, weight;

    Edge(int _source, int _destination,int _weight) :
            source(_source),
            destination(_destination) ,
            weight(_weight){}

    bool operator < (const Edge &that) const {
        return weight < that.weight;
    }

};


int findSet(int e) {
    if (p[e] == e) {
        return e;
    } else {
        return findSet(p[e]);
    }
}

void unionSet(int s, int t) {
    if(h[s] > h[t]){
        p[t] = s;
    }else{
        p[s] = t;
        if(h[s] == h[t]) h[t]++;
    }

}

int main() {
    while (true){
        cin >> M >> N;
        if (M == 0 && N == 0) break;
        vector<Edge> v;
        for (int i = 0; i < N; i++) {
            cin >> source >> destination >> weight;
            Edge edge = Edge(source, destination, weight);
            v.push_back(edge);
        }
        sort(v.begin(), v.end());
        for(int i = 0; i < M; i++){
            p[i] = i;
            h[i] = 0;
        }

        sum = 0;
        for (int i = 0 ; i < v.size(); ++i) {
            int source = v[i].source;
            int destination = v[i].destination;
            int rD = findSet(destination);
            int rS = findSet(source);
            if (rD != rS) {
                unionSet(rD, rS);
                sum += v[i].weight;
            }
        }

        cout << sum << endl;
    }

    return 0;
}
