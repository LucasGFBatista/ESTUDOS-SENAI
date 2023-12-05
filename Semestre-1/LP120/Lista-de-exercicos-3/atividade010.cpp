/*
10. Exercício - comando while
Crie um Código fonte que imprima 11 vezes a frase " Hello World!"
utilizando uma estrutura sequencial e uma estrutura de repetição
while.

*/

#include <iostream>
#include <cmath>
#include <locale.h>

using namespace std;

int main()
{
    setlocale(LC_ALL, "");
    int i = 0;

    cout << "LOOP\n";
    while (i < 12)
    {

        cout << "Hello world!\n";
        i++;
    }

    cout << "\n\nSEQUENCIAL\n";

    cout << "Hello world!\n";
    cout << "Hello world!\n";
    cout << "Hello world!\n";
    cout << "Hello world!\n";
    cout << "Hello world!\n";
    cout << "Hello world!\n";
    cout << "Hello world!\n";
    cout << "Hello world!\n";
    cout << "Hello world!\n";
    cout << "Hello world!\n";
    cout << "Hello world!\n";
    cout << "Hello world!\n";

    return 0;
}