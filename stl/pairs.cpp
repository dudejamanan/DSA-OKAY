#include <bits/stdc++.h>
using namespace std;
int main(){
     pair<int,int> p ={1,2};
     //cout << p;
     pair<int,int> arr[30];
     for(int i=0;i<5;i++){
         pair <int,int> p = {i,i};
         arr.push_back(p);
     }
     cout << arr;
    return 0;
}
