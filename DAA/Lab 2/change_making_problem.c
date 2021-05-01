#include <stdio.h>
//// Sorting the coins of denominations in increasing order ////
void sortDenomination(int d[]){
    int size = sizeof(d)/2;
    for(int i = 0; i < size; i++){
        for(int j = i+1; j < size; j++){
            if(d[i] < d[j]){
                int t = d[i];
                d[i] = d[j];
                d[j] = t;
            }
        }
    }
}

//// Output according to minimum no. of coins to be given ////
int main()
{
    int amt,n;
    printf("Enter the amount to be given: ");
    scanf("%d",&amt);
    printf("Enter the number of denominations: ");
    scanf("%d",&n);
    printf("Enter %d denominations: \n",n);
    int denomination[n];
    for(int i = 0; i < n; i++){
        int temp;
        scanf("%d",&temp);
        denomination[i] = temp; 
    }
    sortDenomination(denomination);
    int sum = 0,count = 0;
    for(int k = 0; k < n; k++){
        while(denomination[k] <= amt){
            sum += denomination[k];
            amt -= denomination[k];
            count++;
        }
    }
    printf("Total %d coins are required to pay to the vendor",count);

    return 0;
}
