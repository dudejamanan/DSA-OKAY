#include <bits/stdc++.h>
using namespace std;
int main(){
    vector <int> v; // syntax for declaring a vector
    v.push_back(1);
    v.emplace_back(2);
    
    vector<pair<int,int>> vec;
    vec.push_back({1,2}); // adding a pair in the vector
    vec.emplace_back(1,2); // syntax of adding a pair is different
    
    vector <int> v1(5,100); // this means we have 5 elements in and all are 100
    vector <int> v2(5); // this means we are creating a vector of 5 elements which will be initially stored with 0 or garbage value
    for(int i=0;i<v2.size();i++){
        cout << v2[i];
    }
    
    vector<int> v3(v1);
}