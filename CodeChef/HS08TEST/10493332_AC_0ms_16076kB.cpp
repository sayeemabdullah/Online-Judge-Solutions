#include <bits/stdc++.h>
using namespace std;

int main() {

	float A, B;
	scanf("%f %f", &B, &A);
	float total = B + 0.5;
	if(A > total && (int)B % 5 == 0) {
	    printf("%.2f",A - total);
	} else {
	    printf("%.2f",A);
	}
	return 0;
}
