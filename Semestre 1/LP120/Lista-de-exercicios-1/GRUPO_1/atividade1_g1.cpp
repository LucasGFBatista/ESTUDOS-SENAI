/*
1. Fazer um programa em C/C++ que pergunta um valor em metros e imprime o
correspondente em decímetros, centímetros e milímetros.

*/

#include <iostream>
using namespace std;

int main()
{
  float m, dm, cm, mm;

  cout << "Digite um valor do metro: ";
  cin >> m;

  dm = m * 10;
  cm = m * 100;
  mm = m * 1000;

  cout << "Decímetro: " << dm << endl;
  cout << "Centímetro: " << cm << endl;
  cout << "Milímetro: " << mm << endl;

  return 0;
}