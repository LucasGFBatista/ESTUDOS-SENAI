#include <bits/stdc++.h>
using namespace std;

char opcao;

// funções cliente
struct clientes
{
    string nome;
    int cpf;
    string email;
    int telefone;
};

int quantidadeClientes = 1000;

void cadastro_cliente();
void pesquisa_cliente();
// void lista_cliente();

/*--------------------------------------------------*/

// funções livro
struct livros
{
    string nomeLivro;
    string nomeAutor;
    int anoPublicacao;
};

int quantidadeLivros = 5000;

void cadastro_livro();
void pesquisa_livro();

/*--------------------------------------------------*/

int main() // função principal
{
   // menu_principal();

    // cliente funções
    cadastro_cliente();
    pesquisa_cliente();
    // lista_cliente();

    // livro funções
    //cadastro_livro();
    //pesquisa_livro();
    // lista_livros();

    return 0;
}

/*--------------------------------------------------*/
/*
void menu_principal() // função menu principal
{
    int opcao_menu;
    bool ok;

    do
    {
        cout << "*****************************\n";
        cout << "1 - CADASTRO DE CLIENTE\n2 - PESQUISAR CLIENTE\n3 - LISTA DE CLIENTES"
             << "\n4 - CADASTRO DE LIVRO\n5 - PESQUISAR LIVRO\n6 - LISTA DE LIVROS\n";
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
                pesquisa_cliente();
            case 3:
                system("cls");
                // lista_cliente();
            case 4:
                system("cls");
                //cadastro_livro();
            case 5:
                system("cls");
                // pesquisa_livro();
            case 6:
                system("cls");
                // lista_livros();
            default:
                system("cls");
                cout << "\nOpção inválida\n";
                ok = false;
                break;
            }
        }
    } while (!ok);
}
*/
/*------------------- funções cliente ------------------*/

void cadastro_cliente()
{
    struct clientes cliente[quantidadeClientes];

    static int linha;

    do
    {
        cout << "CADASTRO DE CLIENTES\n\n";

        cout << "\nDigite nome: ";
        cin >> cliente[linha].nome;
        cin.ignore();
        cout << "\nDigite CPF: ";
        cin >> cliente[linha].cpf;
        cout << "\nDigite o telefone: ";
        cin >> cliente[linha].telefone;
        cout << "\nDigite email: ";
        cin >> cliente[linha].email;

        cout << "\Deseja continuar? (S/N) ";
        cin >> opcao;
        linha++;
        system("cls");

        if (opcao != 's' && opcao != 'S')
        {
            cout << "fim!";
            //menu_principal();
        }

    } while (opcao == 's' || opcao == 'S');
}

void pesquisa_cliente() // função pesquisa cliente por cpf e email
{
    struct clientes cliente[quantidadeClientes];
    int cpfPesquisa, opcao_pesquisa;
    string emailPesquisa;
    bool ok;

    do
    {
        cout << "PESQUISAR CLIENTE\n\n";
        cout << "1 - Pesquisar por CPF \n2 - Pesquisar por e-mail\n";
        cin >> opcao_pesquisa;
        system("cls");

        switch (opcao_pesquisa)
        {
        case 1:
            cout << "Digite o CPF: ";
            cin >> cpfPesquisa;
            for (int i = 0; i < quantidadeClientes; i++)
            {
                if (cliente[i].cpf == cpfPesquisa)
                {
                    cout << "\n"
                         << "NOME: " << cliente[i].nome << "\n"
                         << "CPF: " << cliente[i].cpf << "\n"
                         << "TELEFONE: " << cliente[i].telefone << "\n"
                         << "E-MAIL: " << cliente[i].email << "\n";
                }
            }

            break;
        case 2:
            cout << "Digite o E-mail: ";
            cin >> emailPesquisa;

            for (int j = 0; j < quantidadeClientes; j++)
            {

                if (cliente[j].email == emailPesquisa)
                {
                    cout << "\n"
                         << "NOME: " << cliente[j].nome << "\n"
                         << "CPF: " << cliente[j].cpf << "\n"
                         << "TELEFONE: " << cliente[j].telefone << "\n"
                         << "E-MAIL: " << cliente[j].email << "\n";
                }
            }
            break;
        default:
            system("cls");
            cout << "Opção inválida.";
            break;
        }

        cout << "\nDeseja realizar uma nova pesquisa? (S/N) ";
        cin >> opcao;
        system("cls");

        if (opcao != 's' && opcao != 'S')
        {
            cout << "fim";
            //menu_principal();
        }

    } while (opcao == 's' || opcao == 'S');
}


/*--------------------- funções livros --------------------*/
/*
void cadastro_livro() // função cadastro de livros
{
    struct livros livro[quantidadeLivros];
    static int linha;

    do
    {
        cout << "CADASTRO DE LIVROS\n\n";

        cout << "\nDigite nome do livro: ";
        cin >> livro[linha].nomeLivro;
        cout << "\nDigite nome do autor: ";
        cin >> livro[linha].nomeAutor;
        cout << "\nDigite ano de publicação: ";
        cin >> livro[linha].anoPublicacao;

        cout << "Deseja continuar? (S/N) ";
        cin >> opcao;
        linha++;
        system("cls");

        if (opcao != 's' && opcao != 'S')
        {
            menu_principal();
        }

    } while (opcao == 's' || opcao == 'S');
}
*/

/*
void pesquisa_livro()
{
    struct livros livro[quantidadeLivros];
    int opcaoPesquisa;
    string nomeAutorPesquisa, nomeLivroPesquisa;

    cout << "PESQUISAR LIVRO\n\n";
    cout << "1 - Pesquisar por nome do autor \n2 - Pesquisar por nome do livro\n";
    cin >> opcaoPesquisa;
    system("cls");

    switch (opcaoPesquisa)
    {
    case 1:
        cout << "Digite o nome do autor: ";
        cin >> nomeAutorPesquisa;

        for (int i = 0; i < quantidadeLivros; i++)
        {

            if (livro[i].nomeAutor == nomeAutorPesquisa)
            {
                cout << "\n"
                     << "NOME DO LIVRO: " << livro[i].nomeLivro << "\n"
                     << "NOME DO AUTOR: " << livro[i].nomeAutor << "\n"
                     << "TELEFONE: " << livro[i].anoPublicacao << "\n";
            }
        }
        break;
    case 2:
        cout << "Digite o nome do autor: ";
        cin >> nomeLivroPesquisa;

        for (int j = 0; j < quantidadeLivros; j++)
        {

            if (livro[j].nomeLivro == nomeLivroPesquisa)
            {
                cout << "\n"
                     << "NOME DO LIVRO: " << livro[j].nomeLivro << "\n"
                     << "NOME DO AUTOR: " << livro[j].nomeAutor << "\n"
                     << "TELEFONE: " << livro[j].anoPublicacao << "\n";
            }
        }

        break;

    default:
        system("cls");
        cout << "Opção inválida.";
        break;
    }
}
*/