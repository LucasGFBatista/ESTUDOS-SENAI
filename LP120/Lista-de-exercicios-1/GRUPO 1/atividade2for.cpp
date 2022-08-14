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