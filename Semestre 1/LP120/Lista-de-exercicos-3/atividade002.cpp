/*
2.Exercício - comando while
Faça um Código fonte que peça ao usuário um número entre 12 e 20.
Se a pessoa digitar um número diferente, mostrar a mensagem
"entrada inválida" e solicitar o número novamente. Se digitar correto
mostrar o número digitado.
*/

#include <iostream>
#include <cmath>

using namespace std;

int main()
{
    int numero;
    bool repetir = 0;

    do
    {
        cout << "Digite um numero: ";

        cin >> numero;

        if (numero >= 12 && numero <= 20)
        {
            cout << "NUMERO DIGITADO FOI: " << numero;
            repetir = 1;
        }
        else
        {
            cout << "NUMERO INVALIDO!\n";
            
            repetir = 0;
        }
    } while (repetir == 0);

    return 0;
}