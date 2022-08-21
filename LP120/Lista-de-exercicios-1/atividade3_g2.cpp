/* 
Fazer um programa que lê um valor, um operador (+,-,*,/) e outro valor e imprime o resultado da expressão: <valor 1> <valor 2>
*/

#include <iostream>
#include <locale.h>
using namespace std;

int main(){
    char operador;
    float num1, num2, resultado;

    cout << "Insira os valor a ser calculado: ";
    cin >> num1;
    cout << "Insira os valor a ser calculado: ";
    cin >> num1;
    cout << "Qual operador? ";
    cin >> operador;

    switch (operador)
    {
    case "+":
        resultado = num1 + num2;
        cout << resultado;
    break;
    case '-':
        resultado = num1 - num2;
        cout << resultado;
    break;
    case '*':
          resultado = num1 * num2;
        cout << resultado;
    break;
    case '/':
        resultado = num1 / num2;
        cout << resultado;
    break;
    default:
    cout << "Operador invalido!";
        break;
    }




    return 0;
}
