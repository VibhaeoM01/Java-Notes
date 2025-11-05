#include <bits/stdc++.h>
#include <algorithm>
using namespace std;


void quicksort(int arr[],int l,int h)
{
    if(l<h)
    {
        int pivot=arr[l];
        int i=l,j=h;
        while(i<j)
        {
            while(arr[i]<=pivot & i<h-1)
            {
                i++;
            }
            while(arr[j]>pivot && j>l+1)
            {
                j++;
            }
            if(i<j) swap(arr[i],arr[j]);
        }
        swap(arr[l],arr[j]);
        int pi=j;
        quicksort(arr,l,pi-1);
        quicksort(arr,pi+1,h);
    }
}


int main(){
    int arr[]={5,4,2,4,3};
    int n=5;
    quicksort(arr,0,n-1);
}