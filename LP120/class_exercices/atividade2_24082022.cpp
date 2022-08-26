/*
2 - FAÇA UM PROVA DE MATEMATICA PARA CRIANÇAS QUE ESTÃO APRENDENDO A SOMAR NUMEROS INTEIROS MENORES DO QUE 100. ESCOLHA NUMEROS ALEATORIOS ENTRE 1 E 100, E MOSTRE NA TELA A PERGUNTA: "QUAL A SOMA DE A + B?", ONDE "A" E "B" SÃO OS NUMEROS ALEATORIOS. PEÇA A RESPOSTSA. FAÇA CINCO(5) PERGUNTAS AO ALUNO, E MOSTRE PARA ELE AS PERGUNTAS E AS RESPOSTAS CORRETAS, ALEM DE QUANTAS VESES O ALUNO ACERTOU.
*/
// https://github.com/LucasGFBatista

#include <iostream>
#include <stdlib.h>
#include <cmath>
#include <locale.h>
using namespace std;

int main()
{
	int numero1, numero2, resultado, resposta_aluno, acertos = 0;
	char continuar;

	do
	{
		for (int i = 0; i < 5; i++)
		{
			numero1 = rand() % 100 + 1;
			numero2 = rand() % 100 + 1;
			resultado = numero1 + numero2;

			cout << "\n\nQual a Soma dos valores abaixo? \n";
			cout << numero1 << " + " << numero2 << " = ";
			cin >> resposta_aluno;

			if (resultado != resposta_aluno)
			{
				cout << "\nSua resposta esta errada!"
					 << "\nO resultado correto é: " << resultado;
			}
			else
			{
				acertos++;
				cout << "Parabens! Resultado está correto!\n";
			}
		}
		cout << "\nVocê acertou " << acertos << " de 5!";
		cout << "\nDeseja continuar? (S/N) ";
		cin >> continuar;
		system("cls");

	} while (continuar == 's' || continuar == 'S');

	return 0;
}