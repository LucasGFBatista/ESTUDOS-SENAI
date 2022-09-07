// RASCUNHO DE TRABALHO DE LOGICA DE PRGRAMÇÃO. CADASTRO DE BIBLIOTECA

#include <iostream>
#include <iomanip>
#include <cstring>
#include <ctime>

using namespace std;

char opcao; // continuar cadastro (s/n)

// variaveis clientes
const int lista_tamanho = 200;

char nome[lista_tamanho][50];
int cpf[lista_tamanho];
char email[lista_tamanho][50];
int telefone[lista_tamanho];

// variaveis livros
char nome_livro[lista_tamanho][50];
char nome_autor[lista_tamanho][50];
int ano_publicacao[lista_tamanho];

// chamar funções presentes no codigo
void cadastro_cliente();
void menu_principal();
void cadastro_livro();
void pesquisa_cliente();
void lista_cliente();

int main(void) // função principal
{
    menu_principal();
    cadastro_cliente();
    cadastro_livro();
    pesquisa_cliente();
    lista_cliente();

    return 0;
}

void menu_principal() // função menu
{
    int opcao_menu;
    bool ok;

    do
    {
        cout << "*****************************\n";
        cout << "1 - CADASTRO DE CLIENTE\n2 - CADASTRO DE LIVROS\n3 - PESQUISAR CLIENTE\n4 - PESQUISAR LIVRO\n";
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
            case 3:
            	system("cls");
            	pesquisa_cliente();
            case 4:
            	system("cls");
            	
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
        cout << "\nDigite CPF: ";
        cin >> cpf[linha];
        cout << "\nDigite o telefone: ";
        cin >> telefone[linha];
        cout << "\nDigite email: ";
        cin >> email[linha];


        cout << "\Deseja continuar? (S/N) ";
        cin >> opcao;
        linha++;
        system("cls");
        
        if(opcao != 's' || opcao != 'S'){
        	menu_principal();
		}
	
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
        
        if(opcao != 's' || opcao != 'S'){
        	menu_principal();
		}

    } while (opcao == 's' || opcao == 'S');
}

void pesquisa_cliente() // função pesquisa cliente por cpf e email
{
    int cpfPesquisa, opcao_pesquisa;
    char emailPesquisa;
    bool ok;

    do
    {
    	cout << "PESQUISAR CLIENTE\n\n";
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
                        << "NOME: " << nome[i] << "\n" 
                        << "CPF: " << cpf[i]
                        << "E-MAIL: " << email[i] << "\n";
                }
            }

            break;
     /*  case 2:
            cout << "Digite o E-mail: ";
            cin >> emailPesquisa;
            for (int j = 0; j < lista_tamanho; j++)
            {
                if (strcmp(email[j] == emailPesquisa) = 0)
                {
                    cout << "\n"
                         << nome[j] << "\n"
                         << email[j] << "\n"
                         << cpf[j];
                }
            }
            */
            
        default:
            system("cls");
            cout << "Opção inválida.";
            break;
        }

        cout << "\nDeseja realizar uma nova pesquisa? (S/N) ";
        cin >> opcao;
        system("cls");
        
        if(opcao != 's' || opcao != 'S'){
        	menu_principal();
		}
        
    } while (opcao == 's' || opcao == 'S');
}

void lista_cliente(){
	
	for(int i = 0; i < lista_tamanho; i++){
		if(cpf[i] > 0){
			cout << "\n"
                << nome[i] << "\n"
                << email[i] << "\n"
                << cpf[i];
			
		}
	}
	
}