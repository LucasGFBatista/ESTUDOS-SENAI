package Atividade01;

import java.time.LocalDate;

public class Main {
public static void main(String[] args) {
	
	// MOTOBOY 
	Motoboy motoboy = new Motoboy("Rogerinho do Ingá", "05055889589", Genero.MASCULINO, 1500, LocalDate.of(2021, 05, 02), "MKN-8515");
	
	// GERENTE
	Gerente gerente = new Gerente("Cecilia Lopes", "85869852045", Genero.FEMININO, 2800, LocalDate.of(2015, 05, 03), Bonificacao.GERENTE);
	
	// DIRETOR
	Diretor diretor = new Diretor("Ana Larissa", "84625536587", Genero.FEMININO, 7000, LocalDate.of(2004, 3, 6), Bonificacao.DIRETOR, 0.1);
	
	
	
	
	System.out.println(motoboy.toString());
	System.out.println(gerente.toString());
	System.out.println(diretor.toString());
	
}
}
