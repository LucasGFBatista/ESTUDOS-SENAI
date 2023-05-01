import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LoginInformatica extends Fornecedor {
	LocalDate contratoInicio;
	LocalDate contratoFim;
	
	DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public LoginInformatica() {

	}

	public LoginInformatica(int id, String nome, LocalDate dataNascimento, int idade, Genero genero, Endereco endereco,
			String cnpj, String inscricaoEstadual, LocalDate contratoInicio, LocalDate contratoFim) {
		super(id, nome, dataNascimento, idade, genero, endereco, cnpj, inscricaoEstadual);
		this.contratoInicio = contratoInicio;
		this.contratoFim = contratoFim;
	}

	public String getContratoInicio() {
		return contratoInicio.format(formatar);
	}

	public void setContratoInicio(LocalDate contratoInicio) {
		this.contratoInicio = contratoInicio;
	}

	public String getContratoFim() {
		return contratoFim.format(formatar);
	}

	public void setContratoFim(LocalDate contratoFim) {
		this.contratoFim = contratoFim;
	}

	@Override
	public String toString() {
		return "\nInicio do contrato = " + contratoInicio +
				"\nFim do contrato = " + contratoFim;
	}

}