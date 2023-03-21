public class Main {
    public static void main(String[] args) {


    	Medico m1 = new Medico(1, "Hugo", 25, Genero.MASCULINO, "124564", "542", "442", "45", 5000, Setor.SAUDE, new Endereco("45", "Rua", "45", "55", "Salvador", UnidadeFederativa.BAHIA));

    	
    	System.out.println(m1.toString());
    	
    	
    }


}
