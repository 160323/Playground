#include <stdio.h>
 int main()
{
   int years;
   scanf("%d",&years);
   if(years%4==0 && (years%400 || years%100!=0))
   {
       printf("Leap year");
   }
   else
   {
       printf("Not Leap year");
   }
   return 0;
}