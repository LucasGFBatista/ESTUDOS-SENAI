#include <iostream>
#include <locale.h>
using namespace std;
int main()
{
    setlocale(LC_ALL, "");
    int numero1, numero2, max;
    char continuar;

    do
    {
        cout << "Digite o primeiro numero: ";
        cin >> numero1;
        cout << "Digite o primeiro numero: ";
        cin >> numero2;

        if (numero1 > numero2)
        {
            max = numero1;
            cout << "O maior número é: " << max;
        }
        else
        {
            max = numero2;
            cout << "\nO maior número é: " << max;
        }

        cout << "\nDeseja continuar? (S/N) :";
        cin >> continuar;
        system("cls");

    } while (continuar == 's' || continuar == 'S');

    return 0;
}
