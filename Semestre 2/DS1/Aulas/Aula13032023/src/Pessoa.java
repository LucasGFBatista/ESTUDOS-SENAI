public abstract class Pessoa {
    protected int id;
    protected String nome;
    protected int idade;
    protected Genero genero;
    protected Endereco endereco;


    @Override
    public String toString() {
        return "Pessoa" +
                "\nID: " + this.id +
                "\nNome: " + this.nome +
                "\nIdade=" + this.idade +
                "\nGenero=" + this.genero +
                "\nEndereco=" + endereco.toString();
    }

    /*      COSTRUCTORS     */
    public Pessoa() {
    }

    public Pessoa(int id, String nome, int idade, Genero genero, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.endereco = endereco;
    }

    /*      GETTER AND SETTER       */

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
