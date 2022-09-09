#include <iostream>
using namespace std;



void cadastroUsuario();

int main()
{

    // cadastroUsuario();

    char nomeUsuario, senhaUsuario, confirmaSenha;
    int senha;

    cout << "Digite o nome do usuario: ";
    cin >> nomeUsuario;
    cout << "Digite uma senha: ";
    scanf("%c", &senha);
=======
    cin >> senha;


    //system("pause");


    

    return 0;
}

/*void cadastroUsuario()
{

    char nomeUsuario, senhaUsuario, confirmaSenha, senha;

    cout << "Digite o nome do usuario: ";
    cin >> nomeUsuario;
    cout << "Digite uma senha: ";
    

    
    while (confirmaSenha != senha)
       {
           cout << "Confime sua senha: ";
           cin >> confirmaSenha;

           if (confirmaSenha != senha)
           {
               cout << "Senha não correspondente, tente novamente!";
           }
           else
           {
               senhaUsuario = senha;
               cout << "Usuario cadastrado! Seja bem vindo!";
           }
       }

       
}


*/