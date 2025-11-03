#include <bits/stdc++.h>
using namespace std;

int main(){
    int arr[]={3,4,5,6,3,2,4};
    int n=7;
    unordered_map<int,int>mp;
    for(int i=0;i<n;i++)
    {
        mp[arr[i]]++;
    }
    for(auto i:mp)
    {
        if(i.second>1) cout<<i.first<<" ";
    }
    
}