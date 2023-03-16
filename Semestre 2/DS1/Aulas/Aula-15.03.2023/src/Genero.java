public enum Genero {
    MASCULINO('M'),
    FEMININO('F');

    protected char valor;

    Genero(char valor) {
        this.valor = valor;
    }

    public char getValor() {
        return valor;
    }
}
