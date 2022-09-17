/*
Em uma eleição gremio estudantil concorreram ao cargo de presidente três alunos (A, B e C).
Durante a apuração dos votos foram computados votos nulos e votos em branco, além dos votos válidos para cada aluno.
Deve ser criado um programa de computador que efetue a leitura da quantidade de votos válidos para cada aluno, além de efetuar também a leitura da quantidade de votos nulos e votos em branco.
Ao final o programa deve apresentar o número total de votantes, considerando votos válidos, nulos e em branco;
o percentual correspondente de votos válidos em relação à quantidade de votantes;
o percentual correspondente de votos válidos do aluno A em relação à quantidade de votantes;
o percentual correspondente de votos válidos do aluno B em relação à quantidade de votantes;
 percentual correspondente de votos válidos do aluno C em relação à quantidade de votantes;
 o percentual correspondente de votos nulos em relação à quantidade de votantes;
 e por último o percentual correspondente de votos em branco em relação à quantidade de votantes.

*/

#include <iostream>
#include <cmath>
#include <string.h>

using namespace std;

int main()
{
    float perValidosTotal, perValidosA, perValidosB, perValidosC, perNulos, perBrancos;
    int somaVotos, votosValidos, votosInvalidos;

    // calcular a quantidade de votos
    int qntTotal = 0;
    int candidatoA, candidatoB, candidatoC, nulo, branco;

    /*

        // o nome da variavel é auto explicativa
        int opcaoVoto;
        char repetir;

        do
        {
            cout << "1 - Candidato A\n 2 - Candidato B\n 3 - Candidato C\n 4 - Branco\n";
            cin >> opcaoVoto;

            switch (opcaoVoto)
            {
            case 1:
                candidatoA++;
                break;
            case 2:
                candidatoB++;
                break;
            case 3:
                candidatoC++;
                break;
            case 4:
                branco++;
                break;
            default:
                nulo++;
                break;
            }
            qntTotal++;

            cout << "\n\nDeseja continuar a votação? (S/N) ";
            cin >> repetir;
            system("cls");

        } while (repetir == 's' || repetir == 'S');
        */

    cout << "Digite a quantidade de candidato A: ";
    cin >> candidatoA;
    cout << "Digite a quantidade de candidato B: ";
    cin >> candidatoB;
    cout << "Digite a quantidade de candidato C: ";
    cin >> candidatoC;
    cout << "Digite a quantidade de branco: ";
    cin >> branco;
    cout << "Digite a quantidade de nulo: ";
    cin >> nulo;


    somaVotos = candidatoA + candidatoB + candidatoC + nulo, branco;
    votosValidos = candidatoA + candidatoB + candidatoC;
    votosInvalidos = nulo + branco;

    // calculos porcetengaem
    perValidosTotal = (votosValidos / qntTotal) * 100;
    perValidosA = (votosValidos / candidatoA) * 100;
    perValidosB = (votosValidos / candidatoB) * 100;
    perValidosC = (votosValidos / candidatoC) * 100;
    perNulos = (qntTotal / nulo) * 100;
    perBrancos = (qntTotal / branco) * 100;



    cout << "TOTAL DE VOTOS: " << somaVotos << " teste " << qntTotal << endl;
    cout << "TOTAL DE VOTOS VALIDOS: " << votosValidos << endl;
    cout << "TOTAL DE VOTOS INVALIDOS: " << votosInvalidos << endl;
    cout << "PORCETAGEM DE VOTOS CANDIDATO A: " << perValidosA << endl;
    cout << "PORCETAGEM DE VOTOS CANDIDATO A: " << perValidosB << endl;
    cout << "PORCETAGEM DE VOTOS CANDIDATO A: " << perValidosC << endl;
    cout << "PORCETAGEM DE VOTOS CANDIDATO A: " << perNulos << endl;
    cout << "PORCETAGEM DE VOTOS CANDIDATO A: " << perBrancos << endl;

    return 0;
}
