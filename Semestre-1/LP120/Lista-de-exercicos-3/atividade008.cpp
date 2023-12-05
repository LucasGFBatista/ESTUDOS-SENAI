/*
8. Exercício - comando for em linguagem C
Desenvolver um Código fonte que imprime os números de 7 até 61
na tela

*/
/*
eu acho que teve algumas questoes que voce facilitou a vida da gente. Sendo que ja tinha facilitado dizendo
qual funcao seria usado
*/

#include <iostream>
#include <cmath>
#include <locale.h>

using namespace std;

int main()
{
    setlocale(LC_ALL,"");


    for(int i = 7; i <= 61; i++){

        cout << i << endl;
    }


    return 0;
}