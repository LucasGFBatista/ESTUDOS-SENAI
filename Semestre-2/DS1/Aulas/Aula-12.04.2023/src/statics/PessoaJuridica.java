package statics;

import java.time.LocalDate;

public class PessoaJuridica extends Pessoa {

	private String cnpj;
	private String inscricaoEstadual;
	private LocalDate dataInicio;
	private LocalDate dataFim;

	/* CONSTRUCTOR */

	public PessoaJuridica() {
		super();
	}



	public PessoaJuridica(int id, String nome, Genero genero, String cnpj, String inscricaoEstadual,
			LocalDate dataInicio, LocalDate dataFim, Endereco endereco) {
		super(id, nome, genero, endereco);
		this.cnpj = cnpj;
		this.inscricaoEstadual = inscricaoEstadual;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
	}



	/* GETTERS AND SETTERS */

	public String getCnpj() {
		return cnpj;
	}

	public String getDataInicio() {
		return Util.formatDate(dataInicio);
	}

	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}

	public String getDataFim() {
		
		return Util.formatDate(dataFim);
	}

	public void setDataFim(LocalDate dataFim) {
		this.dataFim = dataFim;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	
	public String getTempoContrato() {
		
		return Util.timeBetween(dataInicio, dataFim);
	}
	
	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}

	@Override
	public String toString() {
		return "CLIENTE\n" + 
				"\nNome: " + super.nome +
				"\nID: " + super.id +
				"\nInicio contrato: " + this.getDataInicio() +
				"\nFim do contrato: " + this.getDataFim() +
				"\nTempo de contrato: " + this.getTempoContrato() +				
				"\nInscri�ao Estadual: " + this.inscricaoEstadual +
				"\nCNPJ: " + this.cnpj +
				"\n\nENDERECO\n" + super.endereco.toString();
	}



}