/*
Fazer um programa em "C" que solicite 2 números e informe:

a) A soma dos números;
b) O produto do primeiro número pelo quadrado do segundo;
c) O quadrado do primeiro número;
d) A raiz quadrada da soma dos quadrados;
e) O seno da diferença do primeiro número pelo segundo;
f) O módulo do primeiro número.

*/
#include <iostream>
#include <cmath>
using namespace std;

int main()
{
    float num1, num2, a, b, c, d, e, f;

    cout << "Digite o primeiro numero: ";
    cin >> num1;
    cout << "Digite o segundo numero: ";
    cin >> num2;

    a = num1 + num2;
    b = num1 * (num2 * num2);
    c = num1 * num1;
    d = sqrt((num1 * num1) + (num2 * num2));
    e = sin(num1 - num2);
    f = fabsf(num1);

    cout << "A soma é dos valores eh: " << a << endl;
    cout << "O produto do primeiro numero pelo quadrado do segundo: " << b << endl;
    cout << "O quadrado do primeiro: " << c << endl;
    cout << "A raiz quadrada da soma dos quadrados: " << d << endl;
    cout << "O seno da diferença do primeiro numero pelo segundo: " << e << endl;
    cout << "O modulo do primeiro : " << f << endl;

    return 0;
}