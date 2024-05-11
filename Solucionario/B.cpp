#include<bits/stdc++.h>

using namespace std;
typedef long long LL;
typedef unsigned long long ULL;
#define MEM(a,b) memset ((a),(b).sizeof(a))
const LL INF = 1e9+7;
const int N=2e2+10;




int main() {
	string str;
	int ks=0;
	while (cin >> str){
		int pos;
		cin >>pos;
		if (str=="END" && pos ==0) break;
		if (ks++) puts("");
		vector <string> vs (str.length());
		int n = str.length();
		for (int i =0;i<n;i++){
			for (int j =0;j<n;j++){
				vs[j].insert(vs[j].begin(),str[j]);
			}
			sort (vs.begin(),vs.end());
		}
		puts(vs[pos-1].c_str());  
	}
	return 0;
}
