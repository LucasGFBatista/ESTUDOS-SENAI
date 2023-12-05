public class PessoaJuridica extends Pessoa {
    private String cnpj;
    private String inscricaoEstadual;

    /*      CONSTRUCTORS        */

    public PessoaJuridica() {
    }

    public PessoaJuridica(int id, String nome, int idade, String cnpj, String inscricaoEstadual, Genero genero, Endereco endereco) {
        super(id, nome, idade, genero, endereco);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
    }

    @Override
    public String toString() {
        return "Pessoa Juridica " +
                "\nID: " + super.id +
                "\nNome: " + super.nome +
                "\nIdade=" + super.idade +
                "\nGenero=" + super.genero +
                "\nCPF: " + this.cnpj +
                "\nRG: " + this.inscricaoEstadual +
                "\nEndereco: " + endereco;

    }


    /*      GETTER AND SETTER          */

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }
}
