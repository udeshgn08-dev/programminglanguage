#include <stdio.h> 

int main(){
    int one,two,three;
    int sum; 

    printf("\nThe first value?"); 
    scanf("%d",&one); 
    printf("The second value?");
    scanf("%d",&two); 
    printf("The third value?"); 
    scanf("%d",&three);
    
    sum = one + two + three; 
 
    printf("%d + %d + %d = %d", one,two,three,sum); 
    printf("\n"); 
    return 0; 
}