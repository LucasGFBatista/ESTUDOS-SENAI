/*
	1. Faça um programa em "C" que lê dois valores e imprime:
- se o primeiro valor for menor que o segundo, a lista de valores do primeiro até
o segundo;
- se o primeiro valor for menor que o segundo a lista de valores do segundo até
o primeiro em ordem decrescente;
- se ambos forem iguais a mensagem "valores iguais".
	*/

#include <iostream>
using namespace std;

int main(){
	int numero1, numero2;
	
	cout << "Digite o primeiro valor: ";
	cin >> numero1;
	cout << "Digite o segundo valor: ";
	cin >> numero2;
	
	if (numero1 < numero2){
		do{ cout << numero1++ << endl;
		} while (numero1 <= numero2);
	}
 if (numero1 > numero2){
		do { cout << numero1-- << endl;
		} while (numero1 >= numero2);
	} 
if(numero1 == numero2) {
		cout << "valores iguais";
	}
	
	return 0;
}