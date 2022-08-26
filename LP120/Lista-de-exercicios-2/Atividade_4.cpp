/*
Fac¸a um programa que leia um numero e, caso ele seja positivo, calcule e mostre:
• O numero digitado ao quadrado ´
• A raiz quadrada do numero digitado
*/
#include <iostream>
#include <cmath>
#include <locale.h>
using namespace std;

int main()
{
    setlocale(LC_ALL, "");

    float numero;

    cout << "Digite um número inteiro: ";
    cin >> numero;

    if (numero > 0)
    {
        float raiz = sqrt(numero);
        float quadrado = pow(numero, 2);
        cout << "A raiz de " << numero << " é " << raiz;
        cout << "\nO quadrado de " << numero << " é " << quadrado;
    }
    else
    {
        cout << "Numero invalido!";
    }

    return 0;
}