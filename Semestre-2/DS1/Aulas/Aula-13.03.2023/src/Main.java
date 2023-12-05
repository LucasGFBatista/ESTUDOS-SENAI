import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);


        String opcao;


        /*      VARIAVEIS DE ENTRADA PESSOA    */
        int id, idade;
        String nome;
        String genderStr;
        Genero genero;

        /*      PESSOA FISICA       */
        String cpf, rg;

        /*      PESSOA JURIDICA     */
        String cnpj, inscricaoEstadual;


        /*      VARIAVEIS DE ENTRADA ENDEREÇO      */
        String cep, logradouro, numeroEndereco;
        String complemento, cidade, uf;
        
        //Estado estado;

        System.out.println("\nPessoa Fisica (PF) \nPessoa Juridica (PJ) + \nDigite o tip de casdastro: ");
        opcao = leitor.nextLine();

        if (opcao.equalsIgnoreCase("pf")) {
            System.out.print("Insira abaixo informações do cliente: \n ID: ");
            id = leitor.nextInt();

            System.out.print("Insira nome: ");
            nome = leitor.nextLine();

            System.out.println("Insira CPF: ");
            cpf = leitor.nextLine();

            System.out.println("Insira RG: ");
            rg = leitor.nextLine();


            System.out.print("Insira idade: ");
            idade = leitor.nextInt();

            System.out.print("Digite o gênero do funcionario (M/F): ");
            genderStr = leitor.next();

            genero = genderStr.equals("M") ? Genero.MASCULINO : Genero.FEMININO;

            System.out.println("\nENDEREÇO");
            
            System.out.print("\n\nInsira CEP: ");
            cep = leitor.nextLine();

            System.out.print("Insira logradouro: ");
            logradouro = leitor.nextLine();

            System.out.print("Insira numero (se houver): ");
            numeroEndereco = leitor.nextLine();

            System.out.print("Insira cidade: ");
            cidade = leitor.nextLine();

            System.out.print("Insira UF: ");
            uf = leitor.nextLine();


            PessoaFisica pessoaFisica = new PessoaFisica();
            pessoaFisica.setId(id);
            pessoaFisica.setNome(nome);
            pessoaFisica.setCpf(cpf);
            pessoaFisica.setRg(rg);
            pessoaFisica.setGenero(genero);

            Endereco endereco = new Endereco();
            endereco.setCep(cep);
            endereco.setLogradouro(logradouro);
            endereco.setComplemento(complemento);
            endereco.setNumero(numeroEndereco);
            endereco.setCidade(cidade);
            endereco.setEstado(uf);

            pessoaFisica.setEndereco(endereco);


        } else if (opcao.equalsIgnoreCase("pj")) {

            System.out.print("Insira abaixo informações do cliente: \n ID: ");
            id = leitor.nextInt();

            System.out.print("Insira nome: ");
            nome = leitor.nextLine();

            System.out.println("Insira CNPJ: ");
            cnpj = leitor.nextLine();

            System.out.println("Insira Inscriçção Estadual: ");
            inscricaoEstadual = leitor.nextLine();


            System.out.print("Insira idade: ");
            idade = leitor.nextInt();

            System.out.print("Digite o gênero do funcionario (M/F): ");
            genderStr = leitor.next();

            genero = genderStr.equals("M") ? Genero.MASCULINO : Genero.FEMININO;

            System.out.println("\nENDEREÇO");
            System.out.print("\n\nInsira CEP: ");
            cep = leitor.nextLine();

            System.out.print("Insira logradouro: ");
            logradouro = leitor.nextLine();

            System.out.print("Insira numero (se houver): ");
            numeroEndereco = leitor.nextLine();

            System.out.print("Insira cidade: ");
            cidade = leitor.nextLine();

            System.out.print("Insira UF: ");
            uf = leitor.nextLine();


            PessoaJuridica pessoaJuridica = new PessoaJuridica();
            pessoaJuridica.setId(id);
            pessoaJuridica.setNome(nome);
            pessoaJuridica.setCnpj(cnpj);
            pessoaJuridica.setInscricaoEstadual(inscricaoEstadual);
            pessoaJuridica.setGenero(genero);

            Endereco endereco = new Endereco();
            endereco.setCep(cep);
            endereco.setLogradouro(logradouro);
            endereco.setComplemento(complemento);
            endereco.setNumero(numeroEndereco);
            endereco.setCidade(cidade);
            endereco.setEstado(uf);

            pessoaJuridica.setEndereco(endereco);


        } else {
            System.out.println("Opção inexistente!");
        }


    }
}