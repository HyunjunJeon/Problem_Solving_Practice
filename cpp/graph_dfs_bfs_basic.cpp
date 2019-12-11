#include <iostream>
#include <vector>
#include <queue>
#include <string>
using namespace std;

vector<int> a[1001];
bool check[1001];

void dfs(int node){
    check[node] = true;
    cout << node << " ";
    for(int i = 0; i < a[node].size(); i++){
        int next = a[node][i];
        if(!check[next]) dfs(next);
    }
}

void bfs(int start){
    queue<int> q;
    memset(check, false, sizeof(check));
    check[start] = true; q.push(start);
    while(!q.empty()){
        int node = q.front(); q.pop();
        cout << node << " ";
        for(int next : a[node]){
            if(!check[next]) {
                check[next] = true;
                q.push(next);
            }
        }
    }

}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);


}
