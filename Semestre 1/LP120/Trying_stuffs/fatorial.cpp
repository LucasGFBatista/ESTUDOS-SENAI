#include <iostream>
#include <stdio.h>
using namespace std;

int main()
{
	float numero;
	long double fatorial = 1;

	cout << "Digite o numeto para calcular fatorial: ";
	cin >> numero;

	while (numero > 1)
	{
		fatorial *= numero--;

		cout << fatorial << endl;
	}

	cout << "O fatorial eh: " << fatorial;

	return 0;
}