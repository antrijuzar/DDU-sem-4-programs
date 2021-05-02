#include <stdio.h>
void knapsack(int capacity,int *weight,int *values,int n,int mat[n+1][capacity+1]){
    printf("%d %d\n",n,capacity);
    // filling first row and first column as 0
    for(int i = 0; i <= capacity; i++){
        mat[0][i] = 0;      
    }
    for(int i = 1; i <= n; i++){
        mat[i][0] = 0;
    }
    // filling matrix according to dp formula
    for(int i = 1; i <= n; i++){
        for(int j = 0; j <= capacity; j++){
            if(weight[i-1] <= j){
                if(values[i-1]+mat[i-1][j-weight[i-1]] > mat[i-1][j]){
                    mat[i][j] = values[i-1]+mat[i-1][j-weight[i-1]];
                }else{
                    mat[i][j] = mat[i-1][j];
                }
            }else{
                mat[i][j] = mat[i-1][j];
            }
        }
    }
}

void printMat(int capacity,int n,int mat[n+1][capacity+1]){
    for(int i = 0; i <= n; i++){
        for(int j = 0; j <= capacity; j++){
            printf("%d ",mat[i][j]);   
        }
        printf("\n");
    }
}

void traceItems(int capacity,int n,int mat[n+1][capacity+1],int *weight){
    int i = n;
    int j = capacity;
    printf("The items added to the knapsack are: \n");
    while(i > 0){
        if(mat[i][j] != mat[i-1][j]){
            i = i - 1;
            j = j - weight[i];
            printf("Item %d \n",i + 1);
        }else{
            i = i - 1;
        }
    }
}

int main()
{
    int n;
    printf("Enter the number of items looted\n");
    scanf("%d",&n);
    printf("Enter the weight and values of those items\n");
    int weight[n],value[n];
    for(int i =0 ;i < n; i++){
        printf("Item %d ",i+1);
        scanf("%d %d",&weight[i],&value[i]);
    }
    printf("Enter the capacity of knapsack ");
    int capacity;
    scanf("%d",&capacity);
    int mat[n+1][capacity+1];
    // filling matrix 
    knapsack(capacity,weight,value,n,mat);
    // printing matrix
    printMat(capacity,n,mat);
    // tracing the items added to knapsack
    traceItems(capacity,n,mat,weight);
    return 0;
}
