#include <bits/stdc++.h>
using namespace std;

int main(){
    int key=9;
    int arr[]={6,4,2,1};
    int n=4;
    bool check=false;
    for(int i=0;i<n;i++)
    {
        if(arr[i]==key) {
            cout<<"yes";
            check=true;
            break;
        }
    }
    if(!check) 
        cout<<"No";
}