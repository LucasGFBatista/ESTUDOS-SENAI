/*
6. Exercício - comando for
Fazer um Código fonte para encontrar todos os números pares entre
79 e 201.

*/

#include <iostream>

using namespace std;

// easy peasy lemon squeezy, essa foi de boa

int main()
{

    for (int i = 79; i < 201; i++)
    {

        if (i % 2 == 0)
        {
            cout << i << endl;
        }
    }

    return 0;
}