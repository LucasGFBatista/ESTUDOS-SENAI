/*
5. Exercício - comando IF/else em linguagem C
Faca um programa que mostre ao usuário um menu com 4 opções de
operações matemáticas (as básicas, por exemplo). O usuário escolhe
uma das opções e o seu programa então pede dois valores numericos e
realiza a operação, mostrando o resultado e saindo.
*/

#include <iostream>
#include <cmath>
#include <locale.h>

using namespace std;

int main()
{
    setlocale(LC_ALL, "UTF-8");

    int operacao, numero1, numero2;
    double resultado;
    bool repetir = 1;

    do
    {
        cout << "\n";
        cout << "1 -------- Adicao" << endl;
        cout << "2 ----- Subtracao" << endl;
        cout << "3 - Multiplicacao" << endl;
        cout << "4 ------- Divisao" << endl;
        cout << "Escolha uma opcao: ";
        cin >> operacao;
        cout << "\n\n\n";

        switch (operacao)
        {
        case 1:
            cout << "ADICAO\n";
            cout << "Insira o primeiro valor: ";
            cin >> numero1;
            cout << "Insira o segundo valor: ";
            cin >> numero2;

            resultado = numero1 + numero2;

            cout << numero1 << " + " << numero2 << " = " << resultado;

            repetir = 1;

            break;
        case 2:
            cout << "SUBTRACAO\n";
            cout << "Insira o primeiro valor: ";
            cin >> numero1;
            cout << "Insira o segundo valor: ";
            cin >> numero2;

            resultado = numero1 - numero2;

            cout << numero1 << " - " << numero2 << " = " << resultado;

            repetir = 1;
            break;
        case 3:
            cout << "MULTIPLICAO\n";
            cout << "Insira o primeiro valor: ";
            cin >> numero1;
            cout << "Insira o segundo valor: ";
            cin >> numero2;

            resultado = numero1 * numero2;

            cout << numero1 << " * " << numero2 << " = " << resultado;

            repetir = 1;

            break;
        case 4:
            cout << "DIVISAO\n";
            cout << "Insira o primeiro valor: ";
            cin >> numero1;
            cout << "Insira o segundo valor: ";
            cin >> numero2;

            resultado = numero1 / numero2;

            cout << numero1 << " / " << numero2 << " = " << resultado;

            repetir = 1;

            break;
        default:
            system("cls");
            cout << "Deixe de arte e escolhe um das opcoes existentes.";

            repetir = 0;
            break;
        }

    } while (repetir == 0);

    return 0;
}