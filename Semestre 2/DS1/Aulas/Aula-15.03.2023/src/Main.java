public class Main {
    public static void main(String[] args) {


        Funcionario f1 = new Funcionario(1, "Lucas", 24, Genero.MASCULINO, "7436595598","15618549" , "00901", 5000, Setor.ENGENHARIA, new Endereco("4111", "Rua Osvaldo Silveira", "33", null, "Salvador", UnidadeFederativa.BAHIA));

        System.out.printf("%.2f\\n" + f1.toString());

    }


}