#include <stdio.h>
//// Selecting the least weight ////
int selectValue(int weight[],int n,int itemVisited[]){
    int min = weight[0];
    int index = -1;
    for(int i = 0; i < n; i++){
        if(weight[i] < min){
            if(!itemVisited[i]){
                min = weight[i];
                index = i;
            }
        }
    }
    if(index  == -1){
        for(int i = 0; i < n; i++){
            if(!itemVisited[i]){
                index = i;
            }
        }
    }
    return index;
}

//// Calculating profit by the least weight of the item ////
float calculateProfit(int n,int item[],int weight[],int value[],int knapsackWeight){
    int itemVisited[n];
    for(int i = 0; i < n; i++){
        itemVisited[i] = 0;
    }
    float profit = 0;
    while(knapsackWeight){
        int highestVal = selectValue(weight,n,itemVisited);
        if(!itemVisited[highestVal]){
            if(knapsackWeight < weight[highestVal]){
                profit += (value[highestVal]*(float)knapsackWeight/weight[highestVal]); 
                knapsackWeight = 0;    
            }else{
                knapsackWeight = knapsackWeight - weight[highestVal];    
                profit += value[highestVal];
            }
            itemVisited[highestVal] = 1;
        }
    }
    return profit;
}

//// Main method ////
int main()
{
    int n;
    printf("Enter the number of items in the loot\n");    
    scanf("%d",&n);
    printf("Enter the Item no. | Value | Weight \n");
    int item[n],value[n],weight[n];
    for(int i = 0; i < n; i++){
        scanf("%d %d %d",&item[i],&value[i],&weight[i]);
    }
    printf("Enter the Knapsack weight\n");
    int knapsackWeight;
    scanf("%d",&knapsackWeight);
    
    float profit = calculateProfit(n,item,weight,value,knapsackWeight);
    printf("%0.2f",profit);

    return 0;
}