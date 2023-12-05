package interfaceAnimal;

public class Main {
    public static void main(String[] args) {

    	Cachorro dog = new Cachorro();
        Pato pato = new Pato();
        Gato gato = new Gato();
        Galo galo = new Galo();

        System.out.println("\nPato: ");
        pato.comer();
        pato.emitirSom();
        
        System.out.println("\nGato: ");
        gato.comer();
        gato.emitirSom();
        
        System.out.println("\nGalo: ");
        galo.comer();
        galo.emitirSom();
        
        System.out.println("\nCachorro: ");
        dog.comer();
        dog.emitirSom();

    }
}
