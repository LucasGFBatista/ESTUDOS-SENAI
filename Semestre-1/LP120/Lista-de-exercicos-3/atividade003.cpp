/*
3. Exercício - comando switch case em linguagem C
Escreva um programa que leia um inteiro entre 1 e 7 e imprima o dia
da semana correspondente a este número. Isto e, domingo se ́ 1,
segunda-feira se 2, e assim por diante.
*/

#include <iostream>
#include <cmath>

using namespace std;

int main()
{
    int numero;
    bool repetir = 1;

    do
    {
        cout << "DIGITE UM NUMERO DE 1 A 7: ";
        cin >> numero;

        switch (numero)
        {
        case 1:
            cout << "Domingo";
            repetir = 1;
            break;
        case 2:
            cout << "Segunda-feira";
            repetir = 1;
            break;
        case 3:
            cout << "Terça-feira";
            repetir = 1;
            break;
        case 4:
            cout << "Quarta-feira";
            repetir = 1;
            break;
        case 5:
            cout << "Quinta-feira";
            repetir = 1;
            break;
        case 6:
            cout << "Sexta-feira";
            repetir = 1;
            break;
        case 7:
            cout << "Sabado";
            repetir = 1;
            break;
        default:
            cout << "ERA DE 1 A 7. TU FICA INVENTANDO MODA\n\n";
            repetir = 0;
            break;
        }

    } while (repetir == 0);

    return 0;
}