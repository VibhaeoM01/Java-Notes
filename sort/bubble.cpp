#include <bits/stdc++.h>
using namespace std;


void bubble(int &arr[],int n)
{
    for(int i=0;i<n-1;i++)
    {
        for(int j=0;j<n-i-1;j++)
        {
            if(arr[j+1]<arr[j])
            {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                // a=a+b;
                // b=a-b;
                // a=a-b;
            }
        }
    }
}

int main(){
    int n=5;
    int arr[n]={5,4,2,4,2};
    bubble(arr,n);
}