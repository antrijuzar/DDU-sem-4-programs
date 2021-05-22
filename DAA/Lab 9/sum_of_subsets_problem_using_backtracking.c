#include <stdio.h>
#include <stdlib.h>
int countSolutions = 0;
/// intializing subsets ///
void intializeSubset(int n,int * subset,int * solutions){
    int temp;
    for(int i = 0; i < n; i++){
        scanf("%d",&temp);
        subset[i] = temp;
        solutions[i] = 0;
    }
}

// printing the solutions //
void printSolution(int *solutions,int n,int *currentSum){
    countSolutions++;
    currentSum = 0;
    for(int i = 0; i < n; i++){
        printf("%d ",solutions[i]);
        solutions[i] = 0;
    }
    printf("\n");
}

/// check for which sets the solution is possible ///
void sumOfSubset(int n,int * solutions,int * subset,int pos,int sum,int currentSum){
    if(sum == currentSum){
        printSolution(solutions,n,&currentSum);
    }
    for(int i = pos; i < n; i++){
        if(subset[i] + currentSum <= sum){
            currentSum = subset[i] + currentSum;
            solutions[i] = 1;
            sumOfSubset(n,solutions,subset,i + 1,sum,currentSum);
            currentSum = currentSum - subset[i];
            solutions[i] = 0;
        }
    }
    return;
}

int main()
{
    int n,sum;
    printf("Enter the number of elements in Subset\n");
    scanf("%d",&n);
    printf("Enter the elements\n");
    int subset[n];
    int solutions[n];
    intializeSubset(n,subset,solutions);
    printf("Enter the sum to be achieved from Subset\n");
    scanf("%d",&sum);
    printf("THE SOLUTIONS ARE\n");
    sumOfSubset(n,solutions,subset,0,sum,0);
    if(countSolutions == 0){
        printf("OOPS! NO SOLUTION EXISTS");
    }
    return 0;
}