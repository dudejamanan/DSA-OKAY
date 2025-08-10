#include <bits/stdc++.h>
using namespace std;
int main(){
    vector <int> v(2,100);
    v.insert(v.begin(),1); // (index,element) inserting 1 at 0th index
    v.insert(v.begin()+1,5,200); //(index , count of element , element) interting  five 200s from 1st index
    for(int i=0;i<v.size();i++){
        cout << v[i] << endl;
    }
}