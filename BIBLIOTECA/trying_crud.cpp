// RASCUNHO DE TRABALHO DE LOGICA DE PRGRAMÇÃO. CADASTRO DE BIBLIOTECA

#include <iostream>
#include <iomanip>
#include <cstring>
using namespace std;

char opcao; // continuar cadastro (s/n)

// variaveis clientes
const int lista_tamanho = 5;
char nome[lista_tamanho][50];
char email[lista_tamanho][50];
int cpf[lista_tamanho];

// variaveis livros
char nome_livro[lista_tamanho][50];
char nome_autor[lista_tamanho][50];
int ano_publicacao[4];

// chamar funções presentes no codigo
void cadastro_cliente();
void menu_principal();
void cadastro_livro();
void pesquisa();

int main(void) // função principal
{
    menu_principal();
    cadastro_cliente();
    cadastro_livro();
    pesquisa();

    return 0;
}

void menu_principal() // função menu
{
    int opcao_menu;
    bool ok;

    do
    {
        cout << "*****************************\n";
        cout << "1 - CADASTRO DE CLIENTE\n2 - CADASTRO DE LIVROS\n";
        cout << "3 - PESQUISAR CLIENTE\n4 - PESQUISAR LIVRO\n";
        cout << "*****************************\n";
        cout << "DIGITE OPÇÃO DA TAREFA: ";
        cin >> opcao_menu;

        if (ok = !cin.fail())
        {
            switch (opcao_menu)
            {
            case 1:
                system("cls");
                cadastro_cliente();
                break;
            case 2:
                system("cls");
                cadastro_livro();
            default:
                system("cls");
                cout << "\nOpção inválida\n";
                ok = false;
                break;
            }
        }
    } while (!ok);
}

void cadastro_cliente() // função cadastro de clientes

{
    static int linha;

    do
    {
        cout << "CADASTRO DE CLIENTES\n\n";

        cout << "\nDigite nome: ";
        cin >> nome[linha];
        cout << "\nDigite email: ";
        cin >> email[linha];
        cout << "\nDigite CPF: ";
        cin >> cpf[linha];

        cout << "Deseja continuar? (S/N) ";
        cin >> opcao;
        linha++;
        system("cls");

    } while (opcao == 's' || opcao == 'S');
}

void cadastro_livro() // função cadastro de livros
{
    static int linha;

    do
    {
        cout << "CADASTRO DE LIVROS\n\n";

        cout << "\nDigite nome do livro: ";
        cin >> nome_livro[linha];
        cout << "\nDigite nome do autor: ";
        cin >> nome_autor[linha];
        cout << "\nDigite ano de publicação: ";
        cin >> ano_publicacao[linha];

        cout << "Deseja continuar? (S/N) ";
        cin >> opcao;
        linha++;
        system("cls");

    } while (opcao == 's' || opcao == 'S');
}

void pesquisa() // função pesquisa por cpf e email
{
    int cpfPesquisa, opcao_pesquisa;
    char emailPesquisa;
    bool ok;

    do
    {
        cout << "1 - Pesquisar por CPF \n2 - Pesquisar por e-mail\n";
        cin >> opcao_pesquisa;

        switch (opcao_pesquisa)
        {
        case 1:
            cout << "Digite o CPF: ";
            cin >> cpfPesquisa;
            for (int i = 0; i < lista_tamanho; i++)
            {
                if (cpf[i] == cpfPesquisa)
                {
                    cout << "\n"
                         << nome << "\n"
                         << email << "\n"
                         << cpf;
                }
            }

            break;
       /* case 2:
            cout << "Digite o E-mail: ";
            cin >> emailPesquisa;
            for (int j = 0; j < lista_tamanho; j++)
            {
                if (strcmp(email[j] emailPesquisa))
                {
                    cout << "\n"
                         << nome << "\n"
                         << email << "\n"
                         << cpf;
                }
            }

            */
        default:
            system("cls");
            cout << "Opção inválida.";
            break;
        }

        cout << "Deseja realizar uma nova pesquisa? (S/N) ";
        cin >> opcao;
    } while (opcao == 's' || opcao == 'S');
}
