#include<bits/stdc++.h>
using namespace std;


int isPrime(int n){

for(int i=2;i<=n/2;i++){
    if(n%i==0)
    return 0;
}
return 1;
}

int isPerfect(int n){

double x  = sqrt(n);

return  x - (int)x==0? 1 : 0;
}

int main(){
cout<<"enter the number of array"<<"\n";
cin>>n;
for(int i=0;i<n;i++)
cin>>arr[i];
sort(arr,arr+n);
if(isPrime(arr[n-1]))
{
    break;
}
else if(isPerfect(arr[n-1])){
  cout<<"Great number is "<<arr[n-1]<<endl;
}
else
 cout<<arr[n-1]<<endl;
}
return 0;
}