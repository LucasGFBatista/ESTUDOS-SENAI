#include <iostream>
using namespace std;


char opcao;
const int lista_tamanho = 5;
char nome[lista_tamanho][50];
char email[lista_tamanho][50];
int cpf[lista_tamanho];

void cadastro_cliente();
void menu_principal();

int main(void)
{
    cadastro_cliente();
    menu_principal();
    return 0;
}

void cadastro_cliente()

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
        linha++;
        system("cls");
        

    } while (opcao == 's' || opcao == 'S');
}

void menu_principal(){


}


void cadastro_livro(){
        static int linha;
    char 
    do
    {
        cout << "\nDigite nome do livro: ";
        cin >> nome[linha];
        cout << "\nDigite email: ";
        cin >> email[linha];
        cout << "\nDigite CPF: ";
        cin >> cpf[linha];

        cout << "Deseja continuar? ";
        cin >> opcao;
        linha++;
        system("cls");
        

    } while (opcao == 's' || opcao == 'S');
}

}