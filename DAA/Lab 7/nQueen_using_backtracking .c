#include <stdio.h>
#include <stdlib.h>
int isSafe(int n,int row,int col,int arr[n][n]){
    /// is Queen being attacked from top
    for(int i = 0; i < row; i++){
        if(arr[i][col]){
            return 0;
        }
    }
    /// is Queen being attacked from top left diagonal
    int r = row;
    int c = col;
    while(r >= 0 && c >= 0){
        if(arr[r][c]){
            return 0;
        }
        r--;
        c--;
    }
    /// is Queen being attacked from top right diagonal
    r = row;
    c = col;
    while(r >= 0 && c < n){
        if(arr[r][c]){
            return 0;
        }
        r--;
        c++;
    }
    return 1;
}

int count = 0;
int nQueens(int n,int row,int arr[n][n]){
    if(row >= n){
        count++;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(arr[i][j])
                    printf("Q ");
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
        /// check if the Queen position is safe or not
        if(isSafe(n,row,i,arr)){
            // if yes the do for the remaining rows
            arr[row][i] = 1;
            if(nQueens(n,row+1,arr)){
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
    printf("Enter the number of Queens to be placed\n");
    scanf("%d",&n);
    int arr[n][n];
    for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
            arr[i][j] = 0;
        }
    }
   
    nQueens(n,0,arr);
    if(count == 0)
        printf("Solution does not exist\n");
    return 0;
}
