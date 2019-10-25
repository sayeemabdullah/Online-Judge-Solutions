#include <bits/stdc++.h>
using namespace std;
int main()
{
	int t,x1,x2,x3,y1,y2,y3,c=0,z12,z13,z23;
	cin>>t;

	while(t--)
	{
	    cin>>x1>>y1>>x2>>y2>>x3>>y3;
		z12 = (x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1);
		z13 = (x3 - x1)*(x3 - x1) + (y3 - y1)*(y3 - y1);
		z23 = (x2 - x3)*(x2 - x3) + (y2 - y3)*(y2 - y3);

		if((z12==z13+z23) || (z13==z12+z23) || (z23==z12+z13))
			c++;
	}

	cout << c << endl;
}