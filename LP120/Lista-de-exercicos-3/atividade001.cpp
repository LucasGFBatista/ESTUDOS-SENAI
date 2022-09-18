/*
1. Exercício - comando IF/else em linguagem C
Faça um Código fonte que leia um número e, caso ele seja positivo,
calcule e mostre:
• O número digitado ao cubo ́
• A raiz quadrada do número digitado
*/
#include <iostream>
#include <cmath>

using namespace std;

int main()
{

    float raiz, numero, cubo;

    cout << "Digite um numero: ";
    cin >> numero;

    raiz = sqrt(numero);
    cubo = numero * numero * numero;

    if (numero > 0)
    {
        cout << "RAIZA DE " << numero << " EH " << raiz << endl;
        cout << "CUBO DE " << numero << " EH " << cubo << endl;
    }
    else
    {

        cout << "NUMERO MENOR OU IHUAL A ZERO, NAO EH POSSIVEL CONTINUAR ";
    }

    return 0;
}