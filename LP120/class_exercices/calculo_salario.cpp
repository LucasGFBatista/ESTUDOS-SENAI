/*
Código que calcula o salario liquido de alguem que o salario bruto é 2mil reais, transporte de seg a sexta, alimentação de R$22,00/dia

Entrega no papel em sala
*/
/*
	imposto de renda
 até R$ 1.903,98 - Isento -R$ 0
 de R$ 1.903,99 a R$ 2.826,65 - 7,5% - R$ 142,80
 de R$ 2.826,66 a R$ 3.751,05 - 15% - R$ 354,80
 de R$ 3.751,06 a R$ 4.664,68 - 22,5% - R$ 636,13 acima
 de R$ 4.664,68 - 27,5% - R$ 869,36...

No teste de mesa não foi solicitado o calculo de imposto de renda, mas eu adicionei no codigo para poder usar as condicionais.

*/

// github.com/lucasgfbatista

#include <iostream>
#include <locale.h>
using namespace std;

int main()
{
	setlocale(LC_ALL, "");
	float salario, salario_liquido, desconto, bonus, alimentacao;
	float valor_transporte_cidade, qnt_transporte_dia, transporte, desconto_transporte_clt;
	float imposto_renda;
	int dias;

	cout << "Digite o valor do seu salario: R$";
	cin >> salario;
	cout << "Digite o valor da alimentacao por dia: R$";
	cin >> alimentacao;
	cout << "Digite o valor do transporte em sua cidade: R$";
	cin >> valor_transporte_cidade;
	cout << "Digite a quantidade de transporte por dia: ";
	cin >> qnt_transporte_dia;
	cout << "Digite a quantidade de dias trabalhados: ";
	cin >> dias;

	desconto_transporte_clt = 0.06; // porcentagem adotada pela clt para desconto do transporte
	bonus = alimentacao * dias;
	transporte = (valor_transporte_cidade * qnt_transporte_dia) * dias;
	desconto = transporte * desconto_transporte_clt;
	salario_liquido = salario - desconto + transporte + bonus;

	cout << "\n\nO valor do seu salario liquido é: R$" << salario_liquido << "\n\n";

	if (salario <= 1093.98)
	{
		cout << "Você está ISENTO do pagamento do emposto de renda!" << endl;
	}
	else
	{
		if (salario >= 1903.99)
		{
			imposto_renda = salario * 0.075;
			cout << "Você será taxado em 7,5% do seu salario, equivale a R$" << imposto_renda << endl;
		}
		else
		{
			if (salario >= 2826.66)
			{
				imposto_renda = salario * 0.15;
				cout << "Você será taxado em 15% do seu salario, equivale a R$" << imposto_renda << endl;
			}
			else
			{
				if (salario >= 3751.06)
				{
					imposto_renda = salario * 0.22;
					cout << "Você será taxado em 22% do seu salario, equivale a R$" << imposto_renda << endl;
				}
				else
				{
					imposto_renda = salario * 0.275;
					cout << "Você será taxado em 27,5% do seu salario, equivale a R$" << imposto_renda << endl;
				}
			}
		}
	}

	return 0;
}