#include <stdio.h>
#include <stdlib.h>
int isSafe(int n,int row,int col,int arr[n][n]){
    /// is Elephant being attacked from top
    for(int i = 0; i < row; i++){
        if(arr[i][col]){
            return 0;
        }
    }
    return 1;
}

int count = 0;
int nElephants(int n,int row,int arr[n][n]){
    if(row >= n){
        count++;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(arr[i][j])
                    printf("E ");
                else
                    printf("_ ");
            }
            printf("\n");
        }
        printf("\n");
        printf("\n");
        return 0;
    }
   
    for(int i = 0; i < n; i++){
        /// check if the Elephant position is safe or not
        if(isSafe(n,row,i,arr)){
            // if yes the do for the remaining rows
            arr[row][i] = 1;
            if(nElephants(n,row+1,arr)){
                return 1;
            }
            arr[row][i] = 0;
        }
    }
    return 0;
}

int main()
{
    int n;
    printf("Enter the number of Elephants to be placed\n");
    scanf("%d",&n);
    int arr[n][n];
    for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
            arr[i][j] = 0;
        }
    }
   
    nElephants(n,0,arr);
    if(count == 0)
        printf("Solution does not exist\n");
    return 0;
}
