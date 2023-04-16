
public class Main {
    public static void main(String[] args) {
        Subtracao_ soma = new Subtracao_();
        Subtracao_ sub = new Subtracao_();
        Multiplicacao mult = new Multiplicacao();
        Divisao div = new Divisao();

        System.out.println("Resultado de soma: " + soma.calcular(10, 4));
        System.out.println("Resultado de subtracao: " + sub.calcular(10, 4));
        System.out.println("Resultado de multiplicacao: " + mult.calcular(10, 4));
        System.out.println("Resultado de divisao: " + div.calcular(10, 4));

    }
}
