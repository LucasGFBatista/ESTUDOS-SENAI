#include <iostream>
using namespace std;

int main()
{
  int resultado, numero;

  cout << "Digite o valor da tabuada: ";
  cin >> numero;
  int i = 0;
  while (i < 10)
  {
    resultado = numero * i;
    cout << numero << "x" << i << "=" << resultado << endl;
    i++;
  }

  return 0;
}