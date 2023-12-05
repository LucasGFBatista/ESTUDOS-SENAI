/*
A - Escreva um algoritmo que lê 50 números inteiros e em seguida
mostra a soma de todos os ímpares lidos.

B - Altere o algoritmo anterior para que ele considere apenas a
soma dos ímpares que estejam entre 100 e 200.

C - Construa um algoritmo que leia um conjunto de 20 números
inteiros e mostre qual foi o maior e o menor valor fornecido.

D - Altere o programa anterior para que ele não permita a entrada
de valores negativos. */
#include <iostream>
#include <locale.h>
using namespace std;

char continuar;

// chamar funções abaixo de main decladas
void menu();
int questaoA();
int questaoB();
int questaoC();
// int questaoD();

int main(void)
{
    setlocale(LC_ALL, "");

    // fazer rodas as funções dentro da main
    menu();
    questaoA();
    questaoB();
    questaoC();
    // questaoD();

    return 0;
}

// função menu
void menu()
{
    int opcao;

    cout << "Escolha as questões";
    cout << "\nQuestão 1 (A)  \nQuestão 2 (B) \nQuestão 3 (C) \nQuestão 4 (D)\n";
    cin >> opcao;
    system("cls");

    switch (opcao)
    {
    case 1:
        do
        {
            questaoA();
        } while (continuar == 's' || continuar == 'S');
        break;
    case 2:
        questaoB();
        break;
    case 3:
        questaoC();
        break;
    case 4:
        // int questaoD();
        break;
    default:
        cout << "Questão invalida!";
    }
}

// função que resolve a questão "A" da ativade
int questaoA()
{
    int numero, soma = 0;

    cout << "A - Escreva um algoritmo que lê 50 números inteiros e em seguida mostra a soma de todos os ímpares lidos.\n"; 

    for (int i = 0; i < 10; i++)
    {
        cout << "Digite o numero: ";
        cin >> numero;

        if (numero % 2 != 0) // somar somente numeros impares
        {
            soma += numero;
        }
    }

    cout << "A soma de todos os valores impares é: " << soma << endl;
    
    cout << "Deseja continuar? ";
    cin >> continuar;
}

// função que resolve a questão "B" da ativade
int questaoB()
{
    int numero, soma_cem;
    if (numero > 100 && numero < 200) // somar valores entre 100 e 200
    {
        soma_cem += numero;
    }
}

// função que resolve a questão "C" da ativade
int questaoC()
{
    int numero, maior, menor;

    for (int i = 0; i <= 10; i++)
    {
        cout << "Digite o numero: ";
        cin >> numero;

        if (i == 1)
        {
            maior = numero; // atribuir valor à variavel maior
            menor = maior;  // atribuir valor à variavel menor
        }
        else if (numero > maior) // comparar variaveis numero e maior
        {
            maior = numero; // atribuir valor caso a condição seja verdadeira
        }
        if (numero < menor) // comparar variaveis numero e menor
        {
            menor = numero; // atribuir valor caso a condição seja verdadeira
        }
    }
    cout << "\nMenor numero: " << menor << "\nMaior numero: " << maior;
}
