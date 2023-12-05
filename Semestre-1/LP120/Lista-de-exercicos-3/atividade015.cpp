/*
15. Exercício - comando do-while
Escreva um algoritmo que leia um número do teclado até que
encontre um número menor ou igual a 1.

*/
#include <iostream>
#include <cmath>
#include <locale.h>

using namespace std;

int main()
{
    setlocale(LC_ALL, "");

    bool repetir = 1;
    int numero;

    do
    {
        cout << "Digite um numero: ";
        cin >> numero;

        if (numero <= 1)
        {
            repetir = 0;
        }
        else
        {
            repetir = 1;
        }

    } while (repetir == 1);

    cout << "\nValor inserido menor ou igual a 1. ";

    return 0;
}
