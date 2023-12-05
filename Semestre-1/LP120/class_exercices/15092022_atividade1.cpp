/*
Considerando os dados abaixo:
1 mês tem 30 dias
1 ano tem 365 dias
1 semana tem 7 dias
Crie um programa que ao usuario colocar a data do nascimento ele informe a idade dele ou em dias, ou em anos ou em semana conforme a escolha do usuario

*/

#include <iostream>
#include <cmath>

using namespace std;

int main()
{

    int diaNascimento, mesNascimento, anoNascimento;
    int diaAtual, mesAtual, anoAtual;
    int diferencaDia, diferencaSemana, diferencaMes, diferencaAno;
    int idadeDia, idadeSemana, idadeMes, idadeAno;

    cout << "Insira sua data de nascimento: ";
    cin >> diaNascimento >> "/" >> mesNascimento >> anoNascimento;
    cout << "Insira a data atual: ";
    cin >> diaAtual >> mesAtual >> anoAtual;

    // calculo dos meses
    if (mesNascimento > mesAtual)
    {
        diferencaMes = (mesNascimento + mesAtual) - 12;
        diferencaAno = (anoAtual - anoNascimento) - 1;
    }
    else
    {
        diferencaMes = mesAtual - mesNascimento;
        diferencaAno = anoAtual - anoNascimento;
    }

    // calculo dias
    if (diaNascimento > diaAtual)
    {
        diferencaDia = (diaNascimento + diaAtual) - 30;
    }
    else
    {
        diferencaDia = diaAtual - diaNascimento;
    }

    idadeDia = (diferencaAno * 365) + (diferencaMes * 30) + diferencaDia;
    idadeSemana = idadeDia / 7;
    idadeAno = diferencaAno;

    cout << "\n\n\n";
    cout << "DATA DE NASCIMENTO: "<< diaNascimento << "/" << mesNascimento << "/" << anoNascimento << endl;
    cout << "DATA ATUAL: " << diaAtual << "/" << mesAtual << "/" << anoAtual << endl;
    cout << "A idade em dias eh: " << idadeDia << endl;
    cout << "A idade em semanas eh: " << idadeSemana << endl;
    cout << "A idade em anos eh: " << idadeAno << endl;

    return 0;
}