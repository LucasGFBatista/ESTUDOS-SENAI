public class Vendedor {

	private String nome;
	private double salario;
	private double TotalVendaMes;

	/* CONSTRUTOR */

	public Vendedor(String nome, double salario, double TotalVendaMes) {
		super();
		this.nome = nome;
		this.salario = salario;
		this.TotalVendaMes = TotalVendaMes;
	}

	/* METODO COMISSÃO */
	public double salarioComissionado(double salario, double TotalVendaMes) {
		return (TotalVendaMes * 0.15) + salario;
	}

	/* GETS AND SETS */
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getTotalVendaMes() {
		return TotalVendaMes;
	}

	public void setTotalVendaMes(double totalVendaMes) {
		TotalVendaMes = totalVendaMes;
	}

}