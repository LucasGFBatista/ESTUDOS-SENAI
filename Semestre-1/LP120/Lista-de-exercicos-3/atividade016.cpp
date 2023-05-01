/*
16. Exercício - comando do-while
Crie um Código fonte que leia um número do teclado até que
encontre um número igual a zero. No final, mostre a soma dos
números digitados
*/
#include <iostream>
#include <cmath>
#include <locale.h>

using namespace std;

int main()
{
    setlocale(LC_ALL, "");

    bool repetir = 1;
    int numero, soma = 0;

    do
    {
        cout << "Digite um numero: ";
        cin >> numero;

        if (numero == 0)
        {
            repetir = 0;
        }
        else
        {
            repetir = 1;
        }

        soma += numero;

    } while (repetir == 1);

    cout << "\nA soma dos valores digitados eh: " << soma;

    return 0;
}
