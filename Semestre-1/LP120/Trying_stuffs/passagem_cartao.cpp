
/*
ISSO AQUI SE CHAMA PREGUIÇA DE FICAR CALCULANDO TODO MÊS QUANTO PRECISA RECEBER DE PASSAGEM

*/

#include <iostream>
using namespace std;

int main()
{
    int dias_uteis;
    float valor_transporte_cidade, valor_desconto, qnt_transporte_dia, soma_desconto;
    char resposta;

    cout << "Quantidade de dias uteis no mês: ";
    cin >> dias_uteis;
    cout << "Valor de transporte na cidade: ";
    cin >> valor_transporte_cidade;
    cout << "Quantos transporte por dia: ";
    cin >> qnt_transporte_dia;

    do
    {

        cout << "Digite o valor do desconto: ";
        cin >> valor_desconto;
        cout << "\n";
        cout << "Tem mais desconto? ";
        cin >> resposta;

        soma_desconto += valor_desconto;

    } while (resposta == 's' || resposta == 'S');

    int valor_transporte_mes = (valor_transporte_cidade * qnt_transporte_dia) * dias_uteis;

    int valor_receber = valor_transporte_mes - soma_desconto;

    cout << "A quantidade de transporte que entrou no mês foi R$" << valor_transporte_mes;
    cout << "\n O  valor a pagar é R$ " << valor_receber;

    return 0;
}