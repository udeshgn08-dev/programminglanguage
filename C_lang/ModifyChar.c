#include <stdio.h> 

int main(){
    char name[5] = "Kemar"; 
    printf("Name error: %s\n",name); 
    name[1] = 'u'; 
    printf("After correction:%s\n",name); 
    return 0; 
    }