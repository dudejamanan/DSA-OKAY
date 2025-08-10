#include <bits/stdc++.h>
using namespace std;
int main(){
    vector<int> v={1,2,3,4};
    vector <int>::iterator it = v.begin();
    cout << *it << " ";
    it++;
    cout << *it << " ";
    vector<int>::iterator it1 = v.end()-1;
    cout << *it1 << " ";
    cout << v.back() << endl; //returns the last element
    
    // for iterating the vector 
    //method1
    for(vector<int>::iterator it = v.begin();it !=v.end() ;it++){
        cout << *(it) <<" ";
        
    }
    cout << endl;
    //method2
    for(int i=0;i<v.size();i++){
        cout << v[i] <<" ";
    }
    cout << endl;
    //method3
    for(auto it = v.begin(); it!=v.end(); it++){
        cout << *(it) << " ";
    }
    cout << endl;
    //method4
    for(auto it : v){
        cout << it << " ";
    }
    
    return 0;
}