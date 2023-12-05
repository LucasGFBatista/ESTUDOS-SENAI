/*
2. Fazer um programa em C que imprime uma tabela com a tabuada de 1 a 9
*/

#include <iostream>
using namespace std;

int main()
{
  int resultado, numero, operacao, i;

  cout << "1 - Adicao" << endl;
  cout << "2 - Subtracao" << endl;
  cout << "3 - Multiplicacao" << endl;
  cout << "4 - Divisao" << endl;
  cout << "Escolha qual operacao da tabuada: ";
  cin >> operacao;

  switch (operacao)
  {
  case 1:
    system("cls");
    cout << "Adicao\n";
    cout << "Digite o valor da tabuada: ";
    cin >> numero;
    break;
  case 2:
    system("cls");
    cout << "Subtracao\n";
    cout << "Digite o valor da tabuada: ";
    cin >> numero;
    break;
  case 3:
    system("cls");
    cout << "Multiplicacao\n";
    cout << "Digite o valor da tabuada: ";
    cin >> numero;
    break;
  case 4:
    system("cls");
    cout << "Divisao\n";
    cout << "Digite o valor da tabuada: ";
    cin >> numero;
    break;
  default:
    system("cls");
    cout << "Nao existe opcao. Por favor, escolher uma opercao da lista.\n";
  }

  if (operacao == 1)
  {
    for (i = 0; i <= 10; i++)
    {
      resultado = numero + i;
      cout << numero << " + " << i << " = " << resultado << endl;
    }
  }

  if (operacao == 2)
  {
    for (i = 0; i <= 10; i++)
    {
      resultado = numero - i;
      cout << numero << " - " << i << " = " << resultado << endl;
    }
  }

  if (operacao == 3)
  {
    for (i = 0; i <= 10; i++)
    {
      resultado = numero * i;
      cout << numero << " * " << i << " = " << resultado << endl;
    }
  }

  if (operacao == 4)
  {
    for (i = 0; i <= 10; i++)
    {
      resultado = numero / i;
      cout << numero << " / " << i << " = " << resultado << endl;
    }
  }
  return 0;
}