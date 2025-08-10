#include <bits/stdc++.h>
using namespace std;

int main() {
    deque<int> dq;
    
    dq.push_back(1);    // {1}
    dq.emplace_back(2); // {1, 2}
    dq.push_front(3);   // {3, 1, 2}
    dq.emplace_front(3);// {3, 3, 1, 2}

    dq.pop_back();  // Removes last element -> {3, 3, 1}
    dq.pop_front(); // Removes first element -> {3, 1}

    // dq.back();   // Retrieves the last element (1)
    // dq.front();  // Retrieves the first element (3)
}
//rest functions are same as vector
// begin , end , rend , rbegin , clear , insert , size , swap