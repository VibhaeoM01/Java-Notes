#include <bits/stdc++.h>
using namespace std;


void selection(int arr[],int n)
{
    for(int i=0;i<n-1;i++)
    {
        int minIndex=i;
        for(int j=i+1;j<n;i++)
        {
            if(arr[j]<arr[minIndex])
            {
                minIndex=j;
            }
        }
        swap(arr[i],arr[minIndex]);
    }
}

int main(){
    int n=5;
    int arr[n]={5,4,2,4,2};
    selection(arr,n);
}