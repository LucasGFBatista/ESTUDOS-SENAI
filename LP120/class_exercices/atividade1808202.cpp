#include <iostream> 
using namespace std;

int main (){
    setlocale(LC_ALL,"Portuguese");
    float notas, media, soma_notas, qnt_ativ;

    cout << "Quantas atividades foram feitas essa unidade? ";
    cin >> qnt_ativ;

    for (int i = 0; i < qnt_ativ; i++){
        cout << "Digite a nota: ";
        cin >> notas;

        soma_notas += notas;
    }

    media = soma_notas / qnt_ativ;
    cout << "\n\nA media do aluno é: " << media;
    
        if (media > 7){
        cout << "\nAluno aprovado!";
        }else if (media > 6){
            cout << "\nAluno em recuperação!";
            } else {
            cout << "\nAluno reprovado!";
        }


    return 0;
}