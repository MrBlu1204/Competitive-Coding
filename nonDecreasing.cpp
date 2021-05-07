//minimum increment/decrement to make array non-decreasing
#include <iostream>
#include <vector>
using namespace std;

int main() 
{
    int n;
    cin >> n;
	  vector<int> a(n);
	  for (auto & itr : a) {
		  cin >> itr;
	  }
	  int ans = 0;
	  for (int i = 1; i < n; i ++) {
	    ans += max(abs(a[i - 1] - a[i]), 0);
	  }
    cout << ans << endl;
    
    return 0;
}
