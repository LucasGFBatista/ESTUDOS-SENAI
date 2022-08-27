/*
Uma empresa vende o mesmo produto para quatro diferentes estados. Cada estado possui uma taxa diferente de imposto sobre o produto (MG 7%; SP 12%; RJ 15%; MS 8%). Faça um programa em que o usuario entre com o valor e o estado destino do produto e o programa retorne o preço final do produto acrescido do imposto do estado em que ele será vendido. Se o estado digitado não for valido, mostrar uma mensagem de erro. 

 https://github.com/LucasGFBatista

 https://github.com/LucasGFBatista/ESTUDOS_SENAI/tree/master/LP120	onde estou subindo as atividades propostas na materia
*/

#include <iostream>
#include <locale.h>
using namespace std;

int main()
{
    setlocale(LC_ALL, "");
    int opcao_menu, preco_produto, preco_final;
    float valor_produto;
    bool ok;

    cout << "Digite o valor do produto: R$";
    cin >> valor_produto;

    do
    {
        cout << "Digite qual estado você quer calcular o preço final\n";
        cout << "1 - MG\n";
        cout << "2 - SP\n";
        cout << "3 - RJ\n";
        cout << "4 - MS\n";
        cin >> opcao_menu;

        if (ok = !cin.fail())
        {

            switch (opcao_menu)
            {
            case 1:
                preco_final = valor_produto * 1.07;
                cout << "\nO valor do final do produto é: R$" << preco_final;
                break;
            case 2:
                preco_final = valor_produto * 1.12;
                cout << "\nO valor do final do produto é: R$" << preco_final;
                break;
            case 3:
                preco_final = valor_produto * 1.15;
                cout << "\nO valor do final do produto é: R$" << preco_final;
                break;
            case 4:
                preco_final = valor_produto * 1.08;
                cout << "\nO valor do final do produto é: R$" << preco_final;
                break;
            default:
                system("cls");
                cout << "Valor do produto R$" << valor_produto;
                cout << "\nOpção invalida! Por favor, escolha uma presente na lista.";
                ok = false;
                break;
            }
        }

    } while (!ok);
    return 0;
}