/*
7. Exercício - comando for
Ler um valor inteiro (aceitar somente valores entre 1 e 10) e escrever
a tabuada de 1 a 10 do valor lido.
*/

/*
Oi, Sheila! Esse codigo parece com o codigo da atividade 5, pois é quase o mnesmo. Como foi eu quem fiz os dois  e vi que dava pra usar de novo, então assim o fiz.

*/

#include <iostream>
#include <cmath>
#include <locale.h>

using namespace std;

int main()
{
    setlocale(LC_ALL, "UTF-8");

    int operacao, numero, i;
    double resultado;
    bool repetir = 1;

    do
    {
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

            do
            {
                cout << "ADICAO\n";
                cout << "Insira numero: ";
                cin >> numero;

                if (numero > 1 && numero < 10)
                {

                    for (i = 0; i <= 10; i++)
                    {
                        resultado = numero + i;

                        cout << numero << " + " << i << " = " << resultado << endl;
                    }
                    repetir = 1;
                }
                else
                {
                    system("cls");
                    cout << "\nInsira valor entre 1 e 10\n";
                    repetir = 0;
                }

            } while (repetir == 0);

            repetir = 1;

            break;
        case 2:
            do
            {
                cout << "SUBTRACAO\n";
                cout << "Insira numero: ";
                cin >> numero;

                if (numero > 1 && numero < 10)
                {

                    for (i = 0; i <= 10; i++)
                    {
                        resultado = numero - i;

                        cout << numero << " - " << i << " = " << resultado << endl;
                    }
                    repetir = 1;
                }
                else
                {
                    system("cls");
                    cout << "\nInsira valor entre 1 e 10\n";
                    repetir = 0;
                }

            } while (repetir == 0);

            repetir = 1;
            break;
        case 3:
            do
            {
                cout << "MULTIPLICACAO\n";
                cout << "Insira numero: ";
                cin >> numero;

                if (numero > 1 && numero < 10)
                {

                    for (i = 0; i <= 10; i++)
                    {
                        resultado = numero * i;

                        cout << numero << " * " << i << " = " << resultado << endl;
                    }
                    repetir = 1;
                }
                else
                {
                    system("cls");
                    cout << "\nInsira valor entre 1 e 10\n";
                    repetir = 0;
                }

            } while (repetir == 0);

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