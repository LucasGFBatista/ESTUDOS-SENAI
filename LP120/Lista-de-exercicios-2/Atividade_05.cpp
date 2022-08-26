/*
Fac¸a um programa que receba um numero inteiro e verifique se este numero eh par ou ımpar.
*/

#include <iostream>
#include <locale.h>
using namespace std;

int main()
{
    int numero;

    cout << "Digite um numero inteiro: ";
    cin >> numero;

    if (numero % 2 == 0)
    {
        cout << numero << "é um valor par.";
    }
    else
    {
        cout << numero << "é um valor impar.";
    }

    return 0;
}