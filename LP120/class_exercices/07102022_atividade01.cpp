/*
1. Escreva um codigo que compare 2 inteiros e diga qual o menor .
*/

#include <bits/stdc++.h>
using namespace std;

int comparar(int num1, int num2);

int main()
{
    int numero1, numero2;

    cout << "Digite o primeiro numero: ";
    cin >> numero1;
    cout << "Digite o segundo numero: ";
    cin >> numero2;

    int resposta = comparar(numero1, numero2);

    cout << "O menor numero eh " << resposta << endl;

    return 0;
}

int comparar(int num1, int num2)
{

    if (num1 > num2)
    {
        return num2;
    }
    else
    {
        return num1;
    }
}