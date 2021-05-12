#include <stdio.h>
#define INT_MAX 9999999
void displayMatrix(int n, int mat[n][n], int s[n][n]){
    printf("The cost matrix is\n");
    for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
            printf("%d ",mat[i][j]);
        }
        printf("\n");
    }
    printf("The minimum k matrix is\n");
    for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
            printf("%d ",s[i][j]);
        }
        printf("\n");
    }
}

void fillDownTriangularMatrix(int n, int mat[n][n], int s[n][n]){
    int temp = n;
    for(int i = 1; i < n; i++){
        for(int k = 0; k <= n - temp; k++){
            mat[i][k] = -1;
            s[i][k] = -1;
        }
        temp--;
    }
}
int count = 0;
void printBrackets(int i, int j, int n, int s[n][n], char* name){
    if (i == j) {
        printf("%s%d",name,++count);
        return;
    }
 
    printf("(");
    printBrackets(i, s[i][j] - 1, n, s, name);
    printBrackets(s[i][j], j, n,s, name);
    printf(")");
}

void matrixChainMultiplication(int *p,int n){
    int mat[n][n];
    int s[n][n];
    for(int i = 0; i < n; i++){
        mat[i][i] = 0;
        s[i][i] = 0;
    }
    for(int l = 1; l < n; l++){
        for(int i = 0; i < n - l + 1; i++){
            int j = i + l;
            mat[i][j] = INT_MAX;
            for(int k = i; k < j; k++){
                int q = mat[i][k] + mat[k+1][j] + (p[i]*p[k+1]*p[j+1]);
                if(q < mat[i][j]){
                    mat[i][j] = q;
                    s[i][j] = k+1;
                }
            }
        }
    }
    char name = 'A';
    fillDownTriangularMatrix(n,mat,s);
    //displayMatrix(n,mat,s);
    printf("Minimum cost for multiplying matrices is: %d ",mat[0][n-1]);
    printf("\nOptimized parenthesis of matrices is: ");
    printBrackets(0,n-1,n,s,&name);
    
}
int main()
{
    int n;
    printf("Enter the nummber of matrix\n");
    scanf("%d",&n);
    printf("Enter the dimensions of the matrix\n");
    int p[n];
    for(int i = 0; i <= n; i++){
        scanf("%d",&p[i]);
    }
    matrixChainMultiplication(p,n);
    return 0;
}
