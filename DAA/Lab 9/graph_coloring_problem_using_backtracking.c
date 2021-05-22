#include <stdio.h>
#include <stdlib.h>
// global variables //
int countColors = 0,count;
// initializegraph //
void initializegraph(int n, int graph[n][n], char *solutions, char *colors){
    for(int i = 0; i < n; i++){
        solutions[i] = '-';
        for(int j = 0; j < n; j++){
            graph[i][j] = 0;
        }
    }
    int noOfEdges,noOfColors;
    printf("Enter number of edges \n");
    scanf("%d",&noOfEdges);
    printf("Enter the edges \n");
    int temp1,temp2;
    for(int i = 0; i < noOfEdges; i++){
        scanf("%d %d",&temp1,&temp2);
        graph[temp1 - 1][temp2 - 1] = 1;
        graph[temp2 - 1][temp1 - 1] = 1;
    }
    
    printf("Enter the number of colors\n");
    scanf("%d",&noOfColors);
    printf("Enter colors i.e. for RED enter R\n");
    char c;
    for(int i = 0; i < noOfColors; i++){
        countColors++;
        scanf(" %c",&c);
        colors[i] = c;
    }
}

// validation for graphColoring //
int isSafe(int n,char solutions[n],int graph[n][n]){
    for(int i = 0; i < n; i++){
        for(int j = i+1; j < n; j++){
            // check if the graph[i][j] == 1 and has same colors on adjacent vertices //
            // or not //
            if(graph[i][j] && solutions[i] == solutions[j]){
                return 0;
            }
        }
    }
    return 1;
}

// print the output //
void printSolutions(int n,char* solutions){
    for(int i = 0; i < n; i++){
        printf("%c ",solutions[i]);
    }
    printf("\n");
}

int graphColoring(int n,int graph[n][n],char *colors,char *solutions,int v,int size){
    // check if all the vertices are assigned color //
    if(v == n){
        // check if the adjacent sides are having same color or not //
        if(isSafe(n,solutions,graph)){
            count++;
            printSolutions(n,solutions);
            return 0;
        }
        return 0;
    }
    for(int i = 0; i < size; i++){
        solutions[v] = colors[i];
        if(graphColoring(n,graph,colors,solutions,v+1,size))
            return 1;
        solutions[v] = '-';
    }
    return 0;
}

int main()
{
    /* Sample testcase 
        4 4
        5
        1 2
        1 3
        1 4
        2 3
        3 4
        3 
        R G B
    */
    int n;
    printf("Enter the graph dimensions\n");
    scanf("%d %d",&n,&n);
    int graph[n][n];
    char colors[n];
    char solutions[n];
    initializegraph(n,graph,solutions,colors);
    printf("Solutions are\n");
    graphColoring(n,graph,colors,solutions,0,countColors);
    if(count == 0){
        printf("SOLUTION DOES NOT EXISTS");
    }
    return 0;
}
