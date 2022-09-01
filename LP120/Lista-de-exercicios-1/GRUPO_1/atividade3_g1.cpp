/*
3. Fazer um programa que solicita um número decimal e imprime o
correspondente em hexa e octal.
*/

#include <iostream>
using namespace std;

int main()
{
    int decimal;
    cout << "DIGITE O NUMERO DECIMAL A SER CONVERTIDO: ";
    cin >> decimal;

    cout << "HEXADECIMAL: " << hex << decimal << endl;
    cout << "OCTADECIMAL: " <<  oct << decimal << endl;

   
    return 0;
}
