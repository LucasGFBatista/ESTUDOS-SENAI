package Atividade01;

public enum Bonificacao {

	MOTOBOY(0.1),
	GERENTE(0.2),
	DIRETOR(0.4);

	protected double valor;

	private Bonificacao(double valor) {
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
