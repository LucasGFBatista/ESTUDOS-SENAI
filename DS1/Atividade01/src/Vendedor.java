
public class Vendedor {
	
	private String nome;
	private double salario;
	private double TotalVendaMes;
	
	
	/*METODO COMISSÃO*/
	public double comissaoVendedor(double TotalVendaMes) {
		return TotalVendaMes * 0.15;
	}
	

	/*GETS AND SETS*/
	
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

	
	/*CONSTRUTOR*/
	
	public Vendedor(String nome, double salario, double totalVendaMes) {
		super();
		this.nome = nome;
		this.salario = salario;
		TotalVendaMes = totalVendaMes;
	}


	
	
	
}
