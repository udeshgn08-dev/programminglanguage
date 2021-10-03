#include <stdio.h> 

int main(){
    int MarkSet[10] = {98,86,71,67,66,60,56,53,45,37}; 
    double grade[5]; 
    grade[0] = 7.5;
    grade[1] = 6.1; 
    grade[2] = 6.1;
    grade[3] = 6.0;
    grade[4] = 5.5; 
    grade[5] = 5.4; // Line 11: Trying to access index of array out of range //  
    for(int count=0; count < 10; count++){
    printf("#Mark:%d\n",MarkSet[count]); 
    }
        for(int gradeCount = 0; gradeCount < 5; gradeCount++ ){ 
        printf("#Grade:%f\n",grade[gradeCount]);     
    }
    return 0; 
}