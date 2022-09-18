/*
11. Exercício - comando while
Desenvolver um Código fonte para exibir os números de 1 até 50 na
tela.
*/

#include <iostream>
#include <cmath>
#include <locale.h>

using namespace std;

int main()
{
    setlocale(LC_ALL, "");

    int i = 1;

    while (i <= 50)
    {

        cout << i << endl;

        i++;
    }

    return 0;
}