#include<stdio.h>
int main()
{
  int a,s,n;
  scanf("%d",&a);
  s=a%10;
  n=a/10;
  printf("%d",n+s);
  return 0;
}