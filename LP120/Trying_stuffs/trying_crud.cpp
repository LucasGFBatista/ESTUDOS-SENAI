#include <iostream>
using namespace std;


char opcao;
char nome[20][50];
char email[20][50];
int cpf[20];

void cadastro();

int main(void)
{
    cadastro();
    return 0;
}

void cadastro()
{
    static int linha;

    do
    {
        cout << "\nDigite nome: ";
        cin >> nome[linha];
        cout << "\nDigite email: ";
        cin >> email[linha];
        cout << "\nDigite CPF: ";
        cin >> cpf[linha];

        cout << "Deseja continuar? ";
        cin >> opcao;
        system("cls");
        linha++;

    } while (opcao == 's' || opcao || 'S');
}