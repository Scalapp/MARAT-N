
#include <bits/stdc++.h>


using namespace std;
int main( ){

    int N, len;
    bool first = false;
    while( scanf("%d" , &N ) , N ){
        int a[ N + 5 ], ini[ N + 5 ];
        while( scanf("%d" , &a[ 0 ]) , a[ 0 ] ){
            for( int i = 1 ; i < N ; ++i ){
                scanf("%d" , &a[ i ] );
            }
            int i = 1 , idx = 0;
            stack<int> S;
            while( idx < N){
                while( !S.empty() &&  a[ idx ] == S.top() ){
                    S.pop();
                    idx++;
                }
                if( idx == N || i > N ){ break; }
                for(; i <= N ; ++i ){
                    if( i == a[ idx ] ){
                        idx++;
                        i++;
                        break;
                    }
                    else{
                        S.push( i );
                    }
                }
            }
            if( idx == N )puts("Yes");
            else puts("No");
        }
        first = true;
        printf("\n");
    }

    return 0;
}
