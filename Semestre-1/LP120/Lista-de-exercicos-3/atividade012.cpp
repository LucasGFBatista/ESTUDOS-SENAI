/*
12. Exercício - comando while
Crie um Código fonte para ler 3 notas e mostrar a
média delas.
*/

/*
na sala voce disse que colocou que as funcoes a utilizar, mas necessariamente precisava usar essas. Fiz incialmente em loop for, mas depois fiz o que a questão pede em while. Você escolhe qual das duas que quer usar. O resultado vai ser o mesmo.
*/

#include <iostream>
#include <cmath>
#include <locale.h>

using namespace std;

int main()
{
    setlocale(LC_ALL, "");

    int cardianal = 1, opcao;
    float media, nota, soma;
    int i, j = 0;

    cout << "======================\n";
    cout << "1 -   USANDO LOOP FOR \n2 - USANDO LOOP WHILE\n";
    cout << "======================\n";
    cout << "ESCOLHA UMA OPCAO:";
    cin >> opcao;

    switch (opcao)
    {
    case 1:

        for (i = 0; i < 3; i++)
        {
            cout << "Digite  a " << cardianal << "ª"
                 << " nota: ";
            cin >> nota;

            soma += nota;

            cardianal++;
        }

        media = soma / i;
        cout << "\n\nA MEDIA EH " << media;

        break;
    case 2:

        while (j < 3)
        {
            cout << "Digite  a " << cardianal << "ª"
                 << " nota: ";
            cin >> nota;

            soma += nota;

            cardianal++;
        }

        media = soma / i;
        cout << "\n\nA MEDIA EH " << media;

        break;
    default:
        cout << "\n\nSo tem duas opcoes, nem eh dificil de enteder isso!\n\n\n";
        break;
    }

    return 0;
}