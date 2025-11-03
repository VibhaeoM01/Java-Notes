#include <bits/stdc++.h>
using namespace std;

void merge(int *arr,int l,int mid,int r)
{
    int n1=mid-l+1;
    int n2=r-mid;
    int a1[n1];
    int a2[n2];
    for(int i=0;i<n1;i++)
    {
        a1[i]=arr[l+i];
    }
    for(int i=0;i<n2;i++)
    {
        a2[i]=arr[mid+1+i];
    }
    int i=0,j=0;
    int k=l;
    while(i<n1 && j<n2)
    {
        if(a1[i]<=a2[j])
        {
            arr[k++]=a1[i++];
        }
        else{
            arr[k++]=a1[j++];
        }
    }
    while(i<n1){
        arr[k++]=a1[i++];
    }
    while(j<n2){
        arr[k++]=a2[j++];
    }
}

void mergesort(int arr[],int l,int r)
{
    if(l<r)
    {
        int mid=l+(r-l)/2;
        mergesort(arr,l,mid);
        mergesort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }
}

int main(){
    int n=5;
    int arr[n]={5,4,2,4,3};

    mergesort(arr,0,n-1);
}