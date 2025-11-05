#include <bits/stdc++.h>
using namespace std;

int main(){
    string s="aabbbccdeeea";
    bool check=false;
    string ans="";
    for(int i=0;i<s.size();i++)
    {
        if(s[i]==s[i+1])
        {
            ans+='#';
            check=true;
        }
        else{
            ans+=s[i];
        }
        if(check)
        {
            int j=i+1;
            while(j<s.size() && s[i]==s[j])
            {
                j++;
            }
            if(j<s.size())
                i=j;
            
        }
        for(char c:ans) cout<<c<<" ";
    }
}