/*
Escreva um programa que, dados dois numeros inteiros, mostre na tela o maior deles, ´
assim como a diferenc¸a existente entre ambos
*/

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
            cout << "\nO maior número é: " << max;
            cout << "\nA diferença entre " << numero1 << " e " << numero2 << " é " << abs(numero1 - numero2);
        }
        else
        {
            max = numero2;
            cout << "\nO maior número é: " << max;
            cout << "\nA diferença entre " <<  numero1 << " e " <<  numero2 <<  " é " << abs(numero2 - numero1);
        }

        cout << "\nDeseja continuar? (S/N) : ";
        cin >> continuar;
        system("cls");

    } while (continuar == 's' || continuar == 'S');

    return 0;
}
