#include <stdio.h>
#include <stdlib.h>

/// structure of priority queue ///
typedef struct priorityQueue{
    int weight,vertex;
    struct priorityQueue *next;
}pq;

pq *head = NULL;

/// creating new node for linked list ///
pq* createNode(int weight, int vertex){
    pq* temp = (pq*)malloc(sizeof(pq));
    temp->weight = weight;
    temp->vertex = vertex;
    temp->next = NULL;
    return temp;
}

/// method to push the element in queue ///
void push(int weight,int vertex){
    pq *start = head;
    pq *temp = createNode(weight,vertex);
    if(head == NULL){
        head = temp; 
        return;
    }
    if(temp->weight < start->weight){
        temp->next = head;
        head = temp;
    }else{
        while(start->next != NULL && temp->weight > start->weight){
            start = start->next;
        }
        temp->next = start->next;
        start->next = temp;
    }
}

/// method for poping element in queue ///
int pop(){
    int v;
    pq* temp = head;
    v = head->vertex;
    head = head->next;
    free(temp);
    return v;
}

/// checking method for linked list ///
int isEmpty(){
    if(head == NULL){
        return 0;
    }
    return 1;
}

/// Dijkstra logic 👀 ///
void getShortesPath(int n, int mat[][n], int source, int *distance){
    /// Inserting the source node and the weight of it to priority...
    /// queue managed by linked list
    head = createNode(0,source - 1);
    distance[source - 1] = 0;
    
    /// checking and processing the linked list whether its is empty ///
    while(isEmpty()){
        /// Poping the first element in the queue with lowest weight ///
        int u = pop();
        for(int i = 0; i < n; i++){
            /// taking all the adjacent node of poped element and comparing
            /// with the previous distance whether the current distance is low
            if(mat[u][i] != -1){
                int v = i;
                int weight = mat[u][i];
                if(distance[v] > distance[u] + weight){
                    distance[v] = distance[u] + weight;
                    /// if current distance is low push into the linked list
                    push(distance[v],v);
                }
            }
            
        }
    }
    printf("Distance from source node to each vertices are \n");
    for(int i = 0; i < n; i++){
        printf("%d -> %d is %d\n",source,i+1,distance[i]);
    }
}
/* Sample test case
7
-1 2 -1 1 -1 -1 -1
-1 -1 -1 3 10 -1 -1
4 -1 -1 -1 -1  5 -1
-1 -1 2 -1 2 8 4
-1 -1 -1 -1 -1 -1 6
-1 -1 -1 -1 -1 -1 -1
-1 -1 -1 -1 -1 1 -1
4
*/

/// Inputs ///
int main()
{
    int m,val;
    printf("Enter the adjacency matrix dimensions i.e input is 5 then 5 x 5 matrix\n");
    scanf("%d",&m);
    int mat[m][m];
    int distance[m];
    printf("Enter -1 if the is no distance between the vertices else enter the weight\n");
    for(int i = 0; i < m; i++){
        distance[i] = 9999;
        for(int j = 0; j < m; j++){
            scanf("%d",&val);
            mat[i][j] = val;
        }
    }
    printf("Enter the soucre to find the shortest path of each vertex\n");
    int source;
    scanf("%d",&source);
    

    getShortesPath(m,mat,source,distance);

    return 0;
}
