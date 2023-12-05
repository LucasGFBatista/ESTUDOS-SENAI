/*
FAZER UM PROGRAMA EM C DE UMA AGENDA. USANDO STRUCT DE HORARIO COM (HORA, MINUTO E SEGUNDOS) E UM STRUCT DE DATA, COM (DIA, MES E ANO).
*/

#include <bits/stdc++.h>
#include <locale.h>

using namespace std;

    struct data{
        int dia;
        int mes;
        int ano;
    };
    
        struct horario{
        int hora;
        int minutos;
        //int segundos;
    };


struct compromisso{
    
    char nome[200];
    char texto[200];
    
    data Data;
    horario Horario;
    
};
/*
void criar(){
        struct compromisso agenda;
    
        cout << "Digite o nome do compromisso: ";
        fflush(stdin);
        fgets(agenda.nome, 256, stdin);
        cout << "Observação: ";
        fflush(stdin);
        fgets(agenda.texto, 256, stdin);
        
        cout << "Dia:";
        fflush(stdin);
        cin >> agenda.Data.dia;
        cout << "Mês:";
        fflush(stdin);
        cin >> agenda.Data.mes;
        cout << "Ano:";
        fflush(stdin);
        cin >> agenda.Data.ano;        
        
        cout << "Hora:";
        fflush(stdin);
        cin >> agenda.Horario.hora;
        cout << "Minuto:";
        fflush(stdin);
        cin >> agenda.Horario.minutos;
    
}

void mostrar(){
    
    
}

*/
int main(){
    setlocale(LC_ALL, "PORTUGUESE");
    
    //criar();
    //mostrar();
        
        struct compromisso agenda;
    
        cout << "Digite o nome do compromisso: ";
        fflush(stdin);
        fgets(agenda.nome, 256, stdin);
        cout << "Observação: ";
        fflush(stdin);
        fgets(agenda.texto, 256, stdin);
        
        cout << "Dia:";
        fflush(stdin);
        cin >> agenda.Data.dia;
        cout << "Mês:";
        fflush(stdin);
        cin >> agenda.Data.mes;
        cout << "Ano:";
        fflush(stdin);
        cin >> agenda.Data.ano;        
        
        cout << "Hora:";
        fflush(stdin);
        cin >> agenda.Horario.hora;
        cout << "Minuto:";
        fflush(stdin);
        cin >> agenda.Horario.minutos;    
    
    
    
        cout << "\n\n\n\n\n";
        cout << agenda.nome << endl;
        cout << agenda.Data.dia << "/" << agenda.Data.mes << "/" << agenda.Data.ano << "\t" 
        << agenda.Horario.hora << ":" << agenda.Horario.minutos << endl;
        cout << "\n----------------------------------------------\n";
        cout << agenda.texto << endl;
        cout << "----------------------------------------------";    
                
    return 0;    
}