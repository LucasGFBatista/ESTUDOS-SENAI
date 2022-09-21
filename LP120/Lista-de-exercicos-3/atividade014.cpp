/*
14. Exercício - comando while
Foi feita uma pesquisa entre os habitantes de uma região. Foram
coletados os dados de idade,
sexo (M/F) e salário. Faça um Código fonte que calcule e mostre:
a) A média dos salários do grupo;
b) A maior e a menor idade do grupo;
c) A quantidade de mulheres na região;
d) A idade e o sexo da pessoa que possui o menor salário;
Finalize a entrada de dados ao ser digitada uma idade negativa.
*/

/*
acho que vai dar errado, mas vou tentar fazer orientado a objetos. Se der certo... reeeeeeeee
*/
#include <iostream>
#include <cmath>
#include <locale.h>
#include <string>

using namespace std;

struct Entrevistado
{
    int codigo;
    string nome;
    int idade;
    char genero;
    float salario;

    void insere(string stnome, int stidade, char stgenero, float stsalario)
    {

        nome = stnome;
        idade = stidade;
        genero = stgenero;
        salario = stsalario;
    }

    void mostra()
    {
        cout << "Nome : " << nome << endl;
        cout << "Idade: " << idade << endl;
        cout << "Genero: " << genero << endl;
        cout << "Salario: " << salario << endl;
    }
};



void cadastro();

int main()
{
    setlocale(LC_ALL, "");
    int quantidade;

    

    cadastro(quantidade, Entrevistado);

    return 0;
}

void cadastro(int quantidade, Entrevistado pessoa[])
{
    

    bool repetir = 1;
    char continuar;

    do
    {
        cout << "Entrevistado " << quantidade + 1 << endl;
        cout << "Digite o nome: ";
        cin >> pessoa[quantidade].nome;
        cout << "Digite o genero: ";
        cin >> pessoa[quantidade].genero;
        cout << "Digite a idade: ";
        cin >> pessoa[quantidade].idade;
        cout << "Digite o salario: ";
        cin >> pessoa[quantidade].salario;

        cout << "Deseja continuar cadastro? (S/N) ";
        cin >> continuar;

        if (continuar == 's' || continuar == 'S')
        {
            repetir = 1;

            quantidade++;
        }
        else
        {
            repetir = 0;
        }

    } while (repetir == 1);
}
