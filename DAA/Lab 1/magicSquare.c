#include <stdio.h>
int col;
void initialize(int row,int col,int arr[][col]){
    for(int i = 0; i < col; i++){
        for(int j = 0; j < col; j++){
            arr[i][j] = 0;
        }
    }
}

int flag = 0,t = 0; ;

void magicSquare(int arr[][col],int element,int row,int column){
    arr[row][column] = element;
}

void calculatePos(int arr[][col],int *r,int *c){
    if(flag == 0){
        *r = *r/2;
        *c = *c - 1;
        flag = 1;
        return;
    }else{
        if(t == 0){
            *r = *r - 1;
            *c = *c + 1;    
        }
        if(*r == -1 && *c == col){
            *r = 0;
            *c = col - 2;
        }
        if(*r == -1){
            *r = col - 1; 
        }
        if(*c == col){
            *c = 0;
        }
        if(arr[*r][*c]){
            *r = *r + 1;
            *c = *c - 2;
            t = 1;
            calculatePos(arr,r,c);
        }
        return;
    }
    
}

void printMagicSquare(int arr[][col], int row){
    for(int i = 0; i < row; i++){
        for(int j = 0; j < col; j++){
            printf("%d ",arr[i][j]);
        }
        printf("\n");
    }
}

int main()
{
    int row,ele;
    printf("Enter the square matrix rows & cols\n");
    scanf("%d %d",&row,&col);
    int arr[row][col];
    initialize(row,col,arr);
    
    printf("Enter array elements \n");
    int tempRow = row,tempCol = col;
    for(int i = 0; i < row*col; i++){
        scanf("%d",&ele);
        calculatePos(arr,&tempRow,&tempCol);
        t = 0;
        magicSquare(arr,ele,tempRow,tempCol);
    }
    
    printMagicSquare(arr,row);
    

    return 0;
}
