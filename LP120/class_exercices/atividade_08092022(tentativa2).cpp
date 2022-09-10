#include <iostream>
#include <locale.h>
#include <cstring>

using namespace std;

int main()
{
    setlocale(LC_CTYPE, "");

    char nomeCadastro[60], nomeUsuario[60], senhaCadastro[100], senhaUsuario[100];
    int validacao = 1;

    // cadastro do cliente
    cout << "Digite seu nome de usuario: ";
    fgets(nomeCadastro, 60, stdin);

    cout << "Digite sua senha: ";
    fgets(senhaCadastro, 100, stdin);

    system("cls");

    // login

    while (validacao)
    {

        do
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
                cout << "\n\nSenha invalida. Tente novamente.\n";

                validacao = 1;
            }
        }


    return 0;
}