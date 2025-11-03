#include <bits/stdc++.h>
using namespace std;

bool isPalindrome(int n)
{   
    int m=n;
    int revVal=0;
    while(n)
    {
        revVal=revVal*10 + (n%10);
        n=n/10;
    }
    if(revVal==m) return true;
    return false;
}

int main(){
    if(isPalindrome(1001)) cout<<"yes";
    else cout<<"no";
}