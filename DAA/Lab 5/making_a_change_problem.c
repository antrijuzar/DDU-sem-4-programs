#include <stdio.h>
void initialize(int m,int n,int c[m][n]){
    for(int i = 0; i < m; i++){
        for(int j = 0; j < n; j++){
            c[i][j] = 0;
        }
    }
}

int min(int v1,int v2){
    if(v1 <= v2){
        return v1;
    }
    return v2;
}

int getTheCoinsNeeded(int n,int amt,int c[n][amt],int * coins){
    int temp = 1;
    int minCoins = 999;
    for(int i = 0; i < n; i++){
        if(i == 0){
            while(temp < amt){
                c[i][temp] = 1 + c[0][temp - coins[i]];
                if(temp == amt - 1){
                    if(c[i][temp] < minCoins){
                        minCoins = c[i][temp];
                    }
                }
                temp++;
            }
        }else{
            while(temp < amt){
                if(temp < coins[i] && i > 0){
                    c[i][temp] = c[i - 1][temp];
                    temp++;
                }else if(i > 0 && temp >= coins[i]){
                    c[i][temp] = min(1 + c[i][temp - coins[i]],c[i - 1][temp]);
                    if(temp == amt - 1){
                        if(c[i][temp] < minCoins){
                            minCoins = c[i][temp];
                        }
                    }
                    temp++;
                }
            }
        }
        temp = 1;
    }
    return minCoins;
}

/* Sample testcase 
3
1 4 6
8
*/


int main()
{
    int n,amt;
    printf("Enter the number of denominations\n");
    scanf("%d",&n);
    int coins[n];
    printf("Enter the list of denominations\n");
    for(int i = 0; i < n; i++){
        scanf("%d",&coins[i]);
    }
    printf("Enter the amount to be paid\n");
    scanf("%d",&amt);
    int c[n][amt+1];
    
    /// Initialize c///
    initialize(n,amt+1,c);
    int minCoin = getTheCoinsNeeded(n,amt+1,c,coins);
    
    printf("Minimum number of coins required is %d ",minCoin);

    return 0;
}
