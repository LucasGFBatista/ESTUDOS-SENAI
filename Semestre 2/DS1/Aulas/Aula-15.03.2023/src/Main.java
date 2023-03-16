public class Main {
    public static void main(String[] args) {


        Funcionario f1 = new Funcionario(1, "Lucas", 24, Genero.MASCULINO, "7436595598","15618549" , "00901", 5000, new Endereco("4111", "Rua Osvaldo Silveira", "33", null, "Salvador", UnidadeFederativa.BAHIA));

        System.out.println(f1.toString());

    }


}