public class Main {
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		aluno.setNome("Carlos");
		aluno.setNota1(7);
		aluno.setNota2(8);
		
		
		//double media = (aluno.getNota1() + aluno.getNota2()) / 2;
		
		
		
		System.out.println("Nome: " + aluno.getNome());
		System.out.println("Media: " + 
				aluno.CalcularMedia(aluno.getNota1(), aluno.getNota2()));
		
	}
}



