#include <bits/stdc++.h>
using namespace std;
int main(){
    vector <int> v = {10,20,30,40,50,60,70};
    //this directly erases from the memory address as v.begin points towards the memory address only
    v.erase(v.begin()+1); //for erasing index 1 as v.begin is the memory address of 0 index 
    for(auto it:v){
        cout << it << " ";
        
    }
    cout << endl;
    
    v.erase(v.begin()+1,v.begin()+4); //[start,end)
    for(auto it:v){
        cout << it << " ";
    }
    cout << endl;
    
    
    return 0;
}