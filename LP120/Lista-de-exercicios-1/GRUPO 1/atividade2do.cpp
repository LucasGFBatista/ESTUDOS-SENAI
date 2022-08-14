/*
2. Fazer um programa em C que imprime uma tabela com a tabuada de 1 a 9

*/
#include <iostream>
using namespace std;

int main(){
  int resultado, numero, operacao, i = 0;
  
  cout << "1 - Adicao" << endl;
  cout << "2 - Subtracao" << endl;
  cout << "3 - Multiplicacao" << endl;
  cout << "4 - Divisao" << endl;
  cout << "Escolha qual operacao da tabuada: ";
  cin >> operacao;
 
 switch (operacao){
  case 1:
    system("cls");
    cout << "Adicao\n";
    break;
  case 2:
    system("cls");
    cout << "Subtracao\n";
    break;
  case 3:
    system("cls");
    cout << "Multiplicacao\n";
    break;
  case 4:
    system("cls");
    cout << "Divisao\n";
    break;
 }

  cout << "Digite o valor da tabuada: ";
  cin >> numero;

  if(operacao == 1){
     do{
    resultado = numero + i;
    cout << numero << " + " << i << " = " << resultado << endl;
    i++;
    
    } while(i <= 10);
  }

  if(operacao == 2){
     do{
    resultado = numero - i;
    cout << numero << " - " << i << " = " << resultado << endl;
    i++;
    
    } while(i <= 10);
  }

  if(operacao == 3){
     do{
    resultado = numero * i;
    cout << numero << " * " << i << " = " << resultado << endl;
    i++;
    } while(i <= 10);
  }

  if(operacao == 4){
     do{
    resultado = numero + i;
    cout << numero << " / " << i << " = " << resultado << endl;
    i++;
    } while(i <= 10);
  }

return 0;}