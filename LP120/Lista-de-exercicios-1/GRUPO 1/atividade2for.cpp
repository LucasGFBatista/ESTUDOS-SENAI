/*
2. Fazer um programa em C que imprime uma tabela com a tabuada de 1 a 9
*/

#include <iostream>
using namespace std;

int main(){
  int numero, resultado;
  cout << "Digite o numero da tabuada desejada: ";
  cin >> numero;

  for(int i = 0; i < 10;i++){
    resultado = numero * i;
    cout << numero << "x" << i << "=" << resultado << endl;
  }
  return 0;
  }