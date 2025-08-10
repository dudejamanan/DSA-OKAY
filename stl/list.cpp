#include <bits/stdc++.h>
using namespace std;
int main(){
    // list has front attributes too (which vector doesnt has eg - push_front , in vector you have to use insert for it)
    list <int> ls;
    ls.push_back(2);
    ls.emplace_back(4);
    ls.push_front(5);
    ls.emplace_front(1);

    //rest functions are same as vector
    //begin , end , rbegin , rend , swap , erase , clear , insert , size
    
}