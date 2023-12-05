/*
2. Leia um numero fornecido pelo usu ´ ario. Se esse n ´ umero for positivo, calcule a raiz ´
quadrada do numero. Se o n ´ umero for negativo, mostre uma mensagem dizendo que o ´
numero ´ e inv ´ alido.
*/
#include <iostream>
#include <locale.h>
#include <cmath>
using namespace std;
int main()
{
    setlocale(LC_ALL,"Portuguese_Brazil");

    int numero;

    cout << "Digite um número inteiro: ";
    cin >> numero;

    if (numero > 0)
    {
        float raiz = sqrt(numero);
        cout << "A raiz de " << numero << " é " << raiz;
    }
    else
    {
        cout << "Numero invalido!";
    }

    return 0;
}