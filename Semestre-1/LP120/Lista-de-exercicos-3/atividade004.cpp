/*
4. Exercício - comando for
Ler 10 digitador pelo usuario números e imprimir quantos são pares e
quantos são ímpares
*/

#include <iostream>
#include <cmath>

using namespace std;

int main()
{
    int numero, contadorPar = 0, contadorImpar = 0, qntNumeros;

    cout << "QUANTOS NUMEROS VAO SER INSERIDOS? ";
    cin >> qntNumeros;

    for (int i = 0; i < qntNumeros; i++)
    {
        cout << "DIGITE O NUMERO: ";
        cin >> numero;

        if (numero % 2 == 0)
        {
            contadorPar++;
        }
        else
        {
            contadorImpar++;
        }
    }

    cout << "\n\nDesses numeros são pares: " << contadorPar << endl;
    cout << "Desses numeros são impares: "  << contadorImpar ;

    return 0;
}