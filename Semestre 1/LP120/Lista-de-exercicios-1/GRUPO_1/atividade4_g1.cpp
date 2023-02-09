/*
4. Fazer um programa em "C" que pergunte um valor em graus Fahrenheit e
imprime no vídeo o correspondente em graus Celsius usando as fórmulas que
seguem.
*/

#include <iostream>
using namespace std;

int main()
{
  float cel, fah;

  cout << "DIGITE O VALOR A TEMPERATURA EM CELCIUS: ";
  cin >> cel;

  fah = (1.8 * cel) + 32;

  cout << "O VALOR EM FAHRENHEIT EH: " << fah;

  return 0;
}
