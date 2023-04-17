package interfaces;

public class VideoGame {
	
	private Jogo jogo;

	public void ligar() {
		System.out.println("Ligando console...");

	}

	public void jogar(Jogo jogo) {
		this.jogo = jogo;
		jogo.jogar();
	}

	public void fechar(Jogo jogo) {
		this.jogo.fechar();
	}

}
