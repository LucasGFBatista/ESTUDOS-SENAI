/*
Foi feita uma pesquisa entre os habitantes de uma região. Foram
coletados os dados de idade,
sexo (M/F) e salário. Faça um programa que calcule e mostre:
a) A média dos salários do grupo;
b) A maior e a menor idade do grupo;
c) A quantidade de mulheres na região;
d) A idade e o sexo da pessoa que possui o menor salário;
*/

#include <bits/stdc++.h>
using namespace std;

struct Entrevistado
{
    // int codigo;
    // char nome[100];
    int idade;
    char genero;
    float salario;
};

/*
void cadastro(int quantidade, Entrevistado pessoa[])
{
    int qtd_mulheres = 0;

    for (int i = 0; i < quantidade; i++)
    {
        cout << "\nEntrevistado " << i + 1 << endl;
        // cout << "Digite o nome: ";
        // cin >> pessoa[quantidade].nome;
        cout << "Digite o genero: ";
        cin >> pessoa[i].genero;
        cout << "Digite a idade: ";
        cin >> pessoa[i].idade;
        cout << "Digite o salario: ";
        cin >> pessoa[i].salario;

        if (pessoa[i].genero == 'F')

        {
            qtd_mulheres++;
        }
    }
}
*/

float calculo(char genero, int quantidade, Entrevistado pessoa[])
{

    float total = 0;
    int i;
    int total_genero = 0;

    for (i = 0; i < quantidade; i++)
    {
        if (pessoa[i].genero == genero)
        {
            total += pessoa[i].salario;
            total_genero++;
        }
    }

    return (float)total / total_genero;
}

int main()
{
    int qtd_mulheres = 0;
    int quantidade;
    Entrevistado pessoa[500];
    char genero;
    char generoMenorSal;
    int menorIdade = 999;
    int maiorIdade = 0;
    int idadeMenorSalario = 999;
    float menorSalario = 0.1;

    cout << "Digite a quantidade de pessoas: ";
    cin >> quantidade;

    for (int i = 0; i < quantidade; i++)
    {
        cout << "\nEntrevistado " << i + 1 << endl;
        // cout << "Digite o nome: ";
        // cin >> pessoa[quantidade].nome;
        cout << "Digite o genero: ";
        cin >> pessoa[i].genero;
        cout << "Digite a idade: ";
        cin >> pessoa[i].idade;
        cout << "Digite o salario: ";
        cin >> pessoa[i].salario;

        if (pessoa[i].salario < menorSalario)
        {
            menorSalario = pessoa[i].salario;
            idadeMenorSalario = pessoa[i].idade;
            generoMenorSal = pessoa[i].genero;
        }

        if (pessoa[i].genero == 'F' || pessoa[i].genero == 'f')

        {
            qtd_mulheres++;
        }

        if (pessoa[i].idade > maiorIdade)
        {
            maiorIdade = pessoa[i].idade;
        }
        if (pessoa[i].idade < menorIdade)
        {
            menorIdade = pessoa[i].idade;
        }

        if (pessoa[i].salario < menorSalario)
        {
            menorSalario = pessoa[i].salario;
            idadeMenorSalario = pessoa[i].idade;
            generoMenorSal = pessoa[i].genero;
        }
    }

    cout << "\n\n\n";
    cout << "Quantidade de mulheres: " << qtd_mulheres << endl;
    cout << "Menor idade: " << menorIdade << endl;
    cout << "Maior idade: " << maiorIdade << endl;
    cout << "Genero e idade da pessoa com nenor salario " << endl;
    cout << "GENERO\tIDADE\tSALARIO\n";
    cout << generoMenorSal << "\t" << idadeMenorSalario << "\t" << menorSalario << "\n";

    // cadastro(quantidade, pessoa);

    cout << "\nDigite o genero para consulta:(M/F) ";
    cin >> genero;

    float media = calculo(genero, quantidade, pessoa);
    cout << "A media salarial eh: " << media << endl;

    return 0;
}
