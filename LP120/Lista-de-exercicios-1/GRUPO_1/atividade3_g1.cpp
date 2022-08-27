/*
3. Fazer um programa que solicita um número decimal e imprime o
correspondente em hexa e octal.
*/

#include <iostream>
using namespace std;

int main()
{
    int decimal, resto, resultado, hexadecimal, i = 0;
    cout << "DIGITE O NUMERO DECIMAL A SER CONVERTIDO: ";
    cin >> decimal;

    do
    {
        resto = decimal % 16;
        resultado = decimal / 16;
        hexadecimal = resultado;
        i++;
    } while (decimal > 15);

    cout << "O resultado do valor em hexadecimal eh: " << resultado;

    return 0;
}
