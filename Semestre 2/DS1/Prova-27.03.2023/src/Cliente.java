public class Cliente extends PessoaFisica {

	private int protocoloAtendimento;

	/* CONSTRUCTORS */

	public Cliente() {

	}

	public Cliente(int id, String nome, String telefone, String email, int idade, Genero genero,
			int protocoloAtendimento, Endereco endereco) {
		super(id, nome, telefone, email, endereco, idade, genero);
		this.protocoloAtendimento = protocoloAtendimento;
	}

	/* GETTERS AND SETTERS */

	public int getProtocoloAtendimento() {
		return protocoloAtendimento;
	}

	public void setProtocoloAtendimento(int protocoloAtendimento) {
		this.protocoloAtendimento = protocoloAtendimento;
	}

	@Override
	public String toString() {
		return "CLIENTE\n" + 
				"\nNome: " + nome +
				"\nID: " + id +
				"\nProtocolo de atendimento" + protocoloAtendimento +
				"\nIdade: " + idade +
				"\nGenero: " + genero.texto +
				"\nTelefone: " + telefone +
				"\nE-mail: " +  email +
				"\n\nENDERECO\n" + endereco.toString();
	}

}
