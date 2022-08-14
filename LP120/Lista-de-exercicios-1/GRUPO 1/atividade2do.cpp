/*
2. Fazer um programa em C que imprime uma tabela com a tabuada de 1 a 9

*/


#include <iostream>
using namespace std;

int main(){
  int resultado, numero;
  
  cout << "Digite o valor da tabuada: ";
  cin >> numero;
  int i = 0; 
  do{
    resultado = numero * i;
    cout << numero << "x" << i << "=" << resultado << endl;
    i++;
    
    } while(i < 10);
  
return 0;}