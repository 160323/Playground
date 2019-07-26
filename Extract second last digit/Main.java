#include<stdio.h>
int main()
{
  int n,f,r;
  scanf("%d",&n);
  f=n%100;
  r=f/10;
  printf("%d",r);
  return 0;
}