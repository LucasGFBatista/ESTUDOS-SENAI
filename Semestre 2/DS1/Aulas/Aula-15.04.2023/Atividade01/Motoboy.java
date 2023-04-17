package Atividade01;

import java.time.LocalDate;

public class Motoboy extends Funcionario {
	private String PlacaDaMoto;

	// CONSTRUCTORS
	public Motoboy() {
		super();
	}

	public Motoboy(String nome, String cpf, Genero genero, double salarioBase, LocalDate dataAdmissao,
			String placaDaMoto) {
		super(nome, cpf, genero, salarioBase, dataAdmissao);
		PlacaDaMoto = placaDaMoto;
	}

	// GET AND SETTER
	public String getPlacaDaMoto() {
		return PlacaDaMoto;
	}

	public void setPlacaDaMoto(String placaDaMoto) {
		PlacaDaMoto = placaDaMoto;
	}

	// GET SALARIO FINAL
	public String getSalarioFinal(double salarioBase) {

		double salarioFinal = salarioBase + (salarioBase * Bonificacao.MOTOBOY.valor);

		return Util.formatBrl(salarioFinal);
	}
 
	@Override
	public String toString() {
		return "\nMOTOBOY \n" +
				"\nNome: " + super.nome +
				"\nCPF: " + super.cpf +
				"\nPlacaDaMoto: " + this.PlacaDaMoto +
				"\nData de admissao: " + super.getDataAdmissao() +
				"\nGenero: " + super.genero.texto + 
				"\nSalario Base: " + super.getSalarioBase() +
				"\nSalario Final: " + this.getSalarioFinal(salarioBase) 
		;
	}

}
