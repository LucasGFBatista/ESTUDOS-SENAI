#include <iostream>
#include <cstring>
#include <locale.h>
using namespace std;

char nomeCadastro[60], nomeUsuario[60], senhaUsuario[100], confirmaSenha[100], senhaCadastro[100];

// chamando funções presentes nos codigos
void cadastroUsuario();
void acessoSistema();

int main()
{
    setlocale(LC_CTYPE, "");

    cadastroUsuario();

    system("pause");

    acessoSistema();

    return 0;
}

void cadastroUsuario() // função cadatro cliente
{

    cout << "Digite o nome do usuario: ";
    fgets(nomeCadastro, 60, stdin);
    cout << "Digite uma senha: ";
    fgets(senhaCadastro, 100, stdin);

    cout << "\nUsuario cadastrado! Seja bem vindo!\n\n";

    // loop para validação de senha no cadastro
    // está dando erro
    /*
    while (strcmp(senhaCadastro, confirmaSenha) == 1)
    {
        cout << "Confime sua senha: ";
        cin >> confirmaSenha;

        if (strcmp(senhaCadastro, confirmaSenha) == 0)
        {
            cout << "Usuario cadastrado! Seja bem vindo!";
            system("pause");
            acessoSistema();
        }
        else
        {
            cout << "Senha não correspondente, tente novamente!\n";
        }
    }

    */


}

void acessoSistema() // funcao acesso sistema(login)
{
    system("cls");

    int validacao = 1;

    while (validacao)
    {

        do // valida se nome usuario existe
        {
            cout << "Digite seu usuario de login: ";
            fgets(nomeUsuario, 60, stdin);
            fflush(stdin);

            if (strcmp(nomeCadastro, nomeUsuario) == 1)
            {
                system("cls");
                cout << "\nUsuario invalido!\n";
            }

        } while (strcmp(nomeCadastro, nomeUsuario) == 1);

        // valida se senha digitada = senha cadastrada
        while (validacao)
        {
            cout << "Digite a sua senha: ";
            fgets(senhaUsuario, 60, stdin);
            fflush(stdin);

            if (strcmp(senhaCadastro, senhaUsuario) == 0)
            {
                cout << "\nSeja bem vindo, " << nomeUsuario;

                validacao = 0;
            }
            else
            {
                cout << "\nSenha invalida. Tente novamente.\n";

                validacao = 1;
            }
        }
    }
}