#include <iostream>
#include <string>
using namespace std;

int main() {
	int arr[1000];

	int tmp, n;
	cin >> n;

	for (int i = 0; i < n; i++) {
		cin >> arr[i];
	}
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n - 1; j++) {
			if (arr[j] > arr[j + 1]) {
				tmp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = tmp;
			}
		}
	}
	for (int i = 0; i < n; i++) {
		cout << arr[i] << endl;
	}
	return 0;
}