#include <stdio.h>
#include <stdlib.h>
int isSafe(int n,int row,int col,int arr[n][n]){
    //printf("%d %d\n",row,col);
    /// is Queen being attacked from top
    for(int i = 0; i < row; i++){
        if(arr[i][col]){
            printf("Queen is being attacked from top (%d,%d) --> (%d,%d)\n",i+1,col+1,row+1,col+1);
            return 0;
        }
    }
    /// is Queen being attacked from top left diagonal
    int r = row - 1;//1
    int c = col - 1;//3
    while(r > 0 && c > 0){
        if(arr[r][c]){
            printf("Queen is being attacked left from diagonal (%d,%d) --> (%d,%d)\n",r+1,c+1,row+1,col+1);
            return 0;
        }
        r--;
        c--;
    }
    /// is Queen being attacked from top right diagonal
    r = row - 1;
    c = col + 1;
    while(r > 0 && c < n){
        if(arr[r][c]){
            printf("Queen is being attacked right from diagonal (%d,%d) --> (%d,%d)\n",r+1,c+1,row+1,col+1);
            return 0;
        }
        r--;
        c++;
    }
    return 1;
}


void display(int n, int arr[n][n]){
    for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(arr[i][j])
                    printf("Q ");
                else
                    printf("_ ");
            }
            printf("\n");
        }
}

void checkNQueens(int n, int arr[n][n],int *p){
    for(int i = 0; i < n; i++){
        if(!isSafe(n,i,p[i]-1,arr)){
            printf("Solution is not valid");
            exit(0);
        }
    }
    printf("Solution is valid");
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
    int p[n];
    printf("Enter the queen positions\n");
    for(int i = 0; i < n; i++){
        scanf("%d",&p[i]);
        arr[i][p[i]-1] = 1;
    }
   
    display(n,arr);
    checkNQueens(n,arr,p);
    
    return 0;
}
