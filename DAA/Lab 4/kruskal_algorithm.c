#include <stdio.h>
int find(int *parent,int i){
    if(parent[i] != i){
        i = parent[i];
    }
    return i;
}

void union1(int i,int j,int *parent){
    int a = find(parent,i);
    int b = find(parent,j);
    parent[b] = a;
}

/// Kruskal's Implementation ///
void kruskal_s(int n,int mat[][n],int *parent){
    /// initial values ///
    printf("MST\n");
    int min_cost = 0;
    int count_edge = 0;
    while(count_edge < n - 1){
        int min = 9999, a = -1, b = -1;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                /// check if min snallest value and check the parent of i and j 
                /// are equal or not
                if(min > mat[i][j] && find(parent,i) != find(parent,j)){
                    min = mat[i][j];
                    a = i;
                    b = j;
                }
            }
        }
        /// add the parent of b as a;
        union1(a,b,parent);
        /// add the cost ///
        min_cost += min;
        printf("Edge %d -> %d,%d cost:%d \n",count_edge++, a, b, min);
    }
    printf("%d",min_cost);
}
/* Sample testcase 
5
-1 2 -1 6 -1
2 -1 3 8 5 
-1 3 -1 -1 7
6 8 -1 -1 9
-1 5 7 9 -1 */
/// Inputs ///
int main()
{
    int m,val;
    printf("Enter the adjacency matrix dimensions i.e input is 5 then 5 x 5 matrix\n");
    scanf("%d",&m);
    int mat[m][m];
    int parent[m];
    printf("Enter -1 if the is no distance between the vertices else enter the weight\n");
    for(int i = 0; i < m; i++){
        parent[i] = i;
        for(int j = 0; j < m; j++){
            scanf("%d",&val);
            if(val == -1){
                mat[i][j] = 9999;
            }else{
                mat[i][j] = val;
            }
        }
    }
    
    kruskal_s(m,mat,parent);

    return 0;
}