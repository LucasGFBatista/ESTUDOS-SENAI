/*
9. Exercício - comando for
Utilizando a estrutura de repetição for, faça um Código fonte em C
que receba 10 números e conte quantos deles estão no intervalo
[10,20] e quantos deles estão fora do intervalo, escrevendo estas
informações.
*/

#include <iostream>
#include <cmath>
#include <locale.h>

using namespace std;

int main()
{
    setlocale(LC_ALL, "");
    int numero, contadorDentro = 0, contadorFora = 0, j = 1;

    for (int i = 0; i < 10; i++)
    {

        cout << "DIGITE " << j << "º"
             << " NUMERO: ";
        cin >> numero;
        j++;

        if (numero >= 10 && numero <= 20)
        {
            contadorDentro++;
        }
        else
        {
            contadorFora++;
        }
    }

    cout << "\n\nQUANTIDADE DE NUMEROS ENTRES 10 E 20: " << contadorDentro << endl;
    cout << "QUANTIDADE DE NUMEROS FORA DO RANGE ANTERIOR: " << contadorFora << endl;

    return 0;
}