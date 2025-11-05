#include <bits/stdc++.h>
using namespace std;

int main(){
    int arr[]={4,3,2,1};
    int n=4;
    int i=0,j=n-1;
    while(i<j)
    {
        swap(arr[i],arr[j]);
        i++;
        j--;
    }
    for (int k = 0; k < n; k++) {
        cout << arr[k] << " ";
    }
}