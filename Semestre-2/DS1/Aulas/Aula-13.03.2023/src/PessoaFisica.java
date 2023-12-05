public class PessoaFisica extends Pessoa {
    private String cpf;
    private String rg;


    @Override
    public String toString() {
        return "Pessoa Fisica" +
                "\nID: " + super.id +
                "\nNome: " + super.nome +
                "\nIdade=" + super.idade +
                "\nGenero=" + super.genero +
                "\nCPF: " + this.cpf +
                "\nRG: " + this.rg +
                "\nEndereco: " + endereco +
                '}';
    }

    /*      CONSTRUCTOR */
    public PessoaFisica() {
    }

    public PessoaFisica(int id, String nome, int idade, String cpf, String rg, Genero genero, Endereco endereco) {
        super(id, nome, idade, genero, endereco);
        this.cpf = cpf;
        this.rg = rg;
    }


    /*          GETTER AND SETTER       */
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }




}
