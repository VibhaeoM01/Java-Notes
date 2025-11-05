#include <bits/stdc++.h>
using namespace std;

int main(){
    int key=9;
    int arr[]={6,4,2,1};
    int n=4;
    int l=0,r=n-1;
    bool check=false;
    sort(arr,arr+n);
    while(l<=r)
    {
        int mid=l+(r-l)/2;
        if(arr[mid]==key)
        {
            cout<<"yes";
            check=true;
            break;
        }
        else if(arr[mid]>key)
        {
            r=mid-1;
        }
        else l=mid+1;
    }
    if(!check) {
        cout<<"no";
    }
}