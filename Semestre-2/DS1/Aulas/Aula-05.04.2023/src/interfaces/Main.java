package interfaces;

public class Main {
	public static void main(String[] args) {
		VideoGame console = new VideoGame();
		
		console.ligar();
		console.jogar(new Xadrez());
		System.out.println("\n");
		console.ligar();
		console.jogar(new PingPong());
		console.ligar();
		console.jogar(new Rpg());
		System.out.println("\n");
	}
}
