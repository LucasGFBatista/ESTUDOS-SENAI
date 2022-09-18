/*
13. Exercício - comando while
Faça um Código fonte que mostre a tabuada de um número N (N será
lido do teclado).
*/

#include <iostream>
#include <cmath>
#include <locale.h>

using namespace std;

// chamando as funçoes existentes no codigo
void usandoFor();
void usandoWhile();

int main()
{
    setlocale(LC_ALL, "");

    float media, nota, soma;
    bool repetir = 1;
    int humor = 0;
    int opcao;

    do
    {
        cout << "======================\n";
        cout << "1 -   USANDO LOOP FOR \n2 - USANDO LOOP WHILE\n";
        cout << "======================\n";
        cout << "ESCOLHA UMA OPCAO:";
        cin >> opcao;

        switch (opcao)
        {
        case 1:
            system("cls");
            usandoFor(); // funcao usando o for
            repetir = 1;
            break;
        case 2:
            system("cls");
            usandoWhile(); // funcao usando while
            repetir = 1;
            break;
        default: // piadinha de pessimo gosto
            system("cls");
            while (humor <= 4)
            {
                humor++;

                switch (humor)
                {
                case 1:
                    cout << "\nSo tem duas opcoes, nem eh dificil de enteder isso!\n\n\n";
                    break;
                case 2:
                    cout << "\nPorra, vei! São apenas duas opcoes!\n";
                    break;
                case 3:
                    cout << "\nDisgraca, vei! Deixa de ser burro e escolhe uma das opcoes!\n";
                    break;

                default:
                    cout << "\nDESISTO DE VOCE!!\n";
                    break;
                }

                repetir = 0;
                break;
            }
        }
    } while (repetir == 0 && humor < 4);

    return 0;
}

// REALIZANDO A TABUADA EM LOOP FOR, AINDA COM DIREITO A ESCOHER A OPERACAO DA TABUADA
void usandoFor()
{

    int numero, i, resultado;
    int operacao;

    cout << "\n";
    cout << "1 -------- Adicao" << endl;
    cout << "2 ----- Subtracao" << endl;
    cout << "3 - Multiplicacao" << endl;
    cout << "Escolha uma opcao: ";
    cin >> operacao;
    cout << "\n\n\n";

    switch (operacao)
    {
    case 1:
        cout << "ADICAO\n";
        cout << "Insira numero: ";
        cin >> numero;
        for (i = 0; i <= 10; i++)
        {
            resultado = numero + i;
            cout << numero << " + " << i << " = " << resultado << endl;
        }

        break;
    case 2:
        cout << "SUBTRACAO\n";
        cout << "Insira numero: ";
        cin >> numero;
        for (i = 0; i <= 10; i++)
        {
            resultado = numero - i;
            cout << numero << " - " << i << " = " << resultado << endl;
        }

        break;
    case 3:
        cout << "MULTIPLICACAO\n";
        cout << "Insira numero: ";
        cin >> numero;
        for (i = 0; i <= 10; i++)
        {
            resultado = numero * i;
            cout << numero << " * " << i << " = " << resultado << endl;
        }
        break;
    default:
        cout << "ERA UMA DAS OPCOES. VOCE INVETANDO MODA!";
        break;
    }
}

// REALIZANDO A TABUADA EM WHILE FOR, AINDA COM DIREITO A ESCOHER A OPERACAO DA TABUADA
void usandoWhile()
{
    int numero, i = 0, resultado;
    int operacao;

    cout << "\n";
    cout << "1 -------- Adicao" << endl;
    cout << "2 ----- Subtracao" << endl;
    cout << "3 - Multiplicacao" << endl;
    cout << "Escolha uma opcao: ";
    cin >> operacao;
    cout << "\n\n\n";

    switch (operacao)
    {
    case 1:
        cout << "ADICAO\n";
        cout << "Insira numero: ";
        cin >> numero;

        while (i <= 10)
        {
            resultado = numero + i;
            cout << numero << " + " << i << " = " << resultado << endl;

            i++;
        }

        break;
    case 2:
        cout << "SUBTRACAO\n";
        cout << "Insira numero: ";
        cin >> numero;

        while (i <= 10)
        {
            resultado = numero - i;
            cout << numero << " - " << i << " = " << resultado << endl;

            i++;
        }

        break;
    case 3:
        cout << "MULTIPLICACAO\n";
        cout << "Insira numero: ";
        cin >> numero;

        while (i <= 10)
        {

            resultado = numero * i;
            cout << numero << " * " << i << " = " << resultado << endl;

            i++;
        }
        break;
    default:
        cout << "ERA UMA DAS OPCOES. VOCE INVETANDO MODA!";
        break;
    }
}