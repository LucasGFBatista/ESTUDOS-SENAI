/* Fazer um programa em "C" que lê o preço de um produto e inflaciona esse preço em 10% se ele for menor que 100 e em 20% se ele for maior ou igual a 100

OBS: não use o comando "if" ou o operador de condição "?".
*/

#include <iostream>
#include <locale.h>
using namespace std;
int main(){
    setlocale(LC_ALL, "Portuguese");

    float preco, preco_inflacionado;
    

    cout << "Digite o valor do produto R$";
    cin >> preco;

    if(preco < 100){
        preco_inflacionado = preco + (preco * 0.1);

        cout << "O preço inflacionado é R$" << preco_inflacionado;
    } else {
          preco_inflacionado = preco + (preco * 0.2);

        cout << "O preço inflacionado é R$" << preco_inflacionado;
    }

    return 0;
}