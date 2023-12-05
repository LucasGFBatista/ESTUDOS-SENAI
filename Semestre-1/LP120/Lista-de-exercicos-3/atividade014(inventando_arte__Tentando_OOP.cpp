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
#include <string.h>

using namespace std;

class Entrevistado
{
private:
    string nome;
    int idade;
    string genero;
    float salario;

public:
    string getNome() const;
    void setNome(string);
    int getIdade() const;
    void setIdade(int);
    string getGenero() const;
    void setGenero(string);
    float getSalario() const;
    void setSalario(float);
};



//nome
string Entrevistado::getNome() const
{
    return nome;
}

void Entrevistado::setNome(string dadosNome)
{
    if (dadosNome.length() == 0)
    {
        nome = "Sem nome";
    }
    else
    {
        nome = dadosNome;
    }
}




//idade
int Entrevistado::getIdade() const
{
    return idade;
}

void Entrevistado::setIdade(int dadosIdade)
{
    if (dadosIdade < 0)
    {
        idade = 0;
    }
    else
    {
        idade = dadosIdade;
    }
}


//genero
string Entrevistado::getGenero() const{
    return genero;
}

void Entrevistado::setGenero( string dadosGenero){
    if(dadosGenero.lenght() == 0){
        genero = "Genero nao informado";
    } else {
        genero = dadosGenero;
    }
}



//salario
























int main()
{
    setlocale(LC_ALL, "");

    int maisNovo, maisVelho, qntEntrevistados, idadeInformada;
    char continuar;
    int entrevistado[qntEntrevistados];

    cout << "Deseja continuar? (S / N) ";
    cin >> continuar;

    return 0;
}