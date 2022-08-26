/*
3. Leia um numero real. Se o numero for positivo imprima a raiz quadrada. Do contrario, 
imprima o numero ao quadrado
*/

#include <iostream>
#include <cmath>
#include <locale.h>
using namespace std;

int main (){
    setlocale(LC_ALL,"Portuguese_Brazil");

    float numero;

    cout << "Digite um número inteiro: ";
    cin >> numero;

    if (numero > 0)
    {
        float raiz = sqrt(numero);
        cout << "A raiz de " << numero << " é " << raiz;
    }
    else
    {
        float quadrado = pow(numero,2);
        cout << "O quadrado de " << numero << " é " << quadrado;
    }

    return 0;
}