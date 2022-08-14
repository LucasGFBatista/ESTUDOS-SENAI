#include <iostream> 
using namespace std;

int main(){
    float cel, fah;
    
    cout << "DIGITE O VALOR A TEMPERATURA EM CELCIUS: ";
    cin >> cel;
    
    fah = (1.8 * cel) + 32;
    
    cout << "O VALOR EM FAHRENHEIT EH: " << fah;
    
  return 0;
}
