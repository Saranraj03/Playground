#include <stdio.h>
int main() {
	int n,temp,fd,Id,sum;
    scanf("%d",&n);
  temp=n;
  Id=n%10;
  while(n>=10)
  {
    n/=10;
  }
   fd=n;
  sum=fd+Id;
  printf("%d",sum);
	return 0;
}