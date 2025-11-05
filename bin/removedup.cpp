#include <bits/stdc++.h>
using namespace std;

int main(){
    int arr[]={3,4,5,6,3,2,4};
    int n=7;
    unordered_set<int>st;
    for(int i=0;i<n;i++)
    {
        st.insert(arr[i]);
    }
    for(int i:st)
    {
        cout<<i<<" ";
    }
}