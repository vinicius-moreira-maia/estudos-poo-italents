import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Carro> carros = new ArrayList<>();
    private static List<Moto> motos = new ArrayList<>();
    private static List<Caminhao> caminhoes = new ArrayList<>(); // requisito 1
    private static List<Pessoa> clientes = new ArrayList<>();
    private static List<Venda> vendas = new ArrayList<>();

    public static void main(String[] args) {
        // Veiculo veiculo = new Veiculo("Chevrolet", "Onix", 2015, "Prata", 45000);
        // Carro carro = new Carro("Chevrolet", "Onix", 2015, "Prata", 45000,5,"Flex",200);
        // Moto moto = new Moto("Kawasaky","Ninja 900",2019,"Verde",55000,900,true,"Head");
        // Pessoa pessoa = new Pessoa("Leonardo", 52, "Rua 1 n123", "1138325599", "leo@email.com", 192, 98.4);
        // Venda venda = new Venda(carro, pessoa, 50000, LocalDateTime.now());

        Scanner scanner = new Scanner(System.in);
        int escolha = 0;
        do{
            try{
                System.out.println("### Menu Concessionaria ###");
                System.out.println("1 - Mostrar Veiculos");
                System.out.println("2 - Comprar Veiculo");
                System.out.println("3 - Vender Veiculo");
                System.out.println("4 - Cadastrar um cliente");
                System.out.println("5 - Gerar relatorio");
                System.out.println("6 - Mostrar Clientes"); // requisito 2
                System.out.println("0 - Sair");
                System.out.print("Escolha uma opção: ");
                escolha = scanner.nextInt();
                scanner.nextLine();
                System.out.println();

                switch (escolha) {
                    case 1:
                        mostrarVeiculos("", true);
                        break;
                    case 2:
                        comprarVeiculo(scanner);
                        break;
                    case 3:
                        venderVeiculo(scanner);
                        break;
                    case 4:
                        cadastrarCliente(scanner);
                        break;
                    case 5:
                        gerarRelatorio();
                        break;
                    case 6:
                        mostrarClientes(); // requisito 2
                        break;
                    case 0:
                        System.out.println("Fechando o programa...");
                        break;
                    default:
                        System.out.println("Opção invalida. Tente novamente.");
                }
            }catch (InputMismatchException e){
                System.out.println("Erro: Entrada invalida. Certifique-se de inserir os dados corretamente!");
                scanner.nextLine();
            }catch (Exception e){
                System.out.println("Erro desconhecido: "+e.getMessage());
            }
        } while (escolha != 0);

        scanner.close();
    }

    // requisito 3 (refatoração de mostrarVeiculos)
    private static void mostrarVeiculos(String tipoVeiculo, boolean ignorarTipo) {

        // Se ignorarTipo for verdadeiro, exibe todos os tipos de veículos
        if (ignorarTipo) {
            // Exibe os carros
            if (!carros.isEmpty()) {
                System.out.println("### Lista de Carros ###");
                int x = 1;
                for (Carro carro : carros) {
                    System.out.println(x + " - " + carro.getModelo() + " - " + carro.getAno());
                    x++;
                }
            } else {
                System.out.println("Nenhum carro foi encontrado!");
            }
            System.out.println("----------------------------------");
    
            // Exibe as motos
            if (!motos.isEmpty()) {
                System.out.println("### Lista de Motos ###");
                int x = 1;
                for (Moto moto : motos) {
                    System.out.println(x + " - " + moto.getModelo() + " - " + moto.getAno());
                    x++;
                }
            } else {
                System.out.println("Nenhuma moto foi encontrada!");
            }
            System.out.println("----------------------------------");
    
            // Exibe os caminhões
            if (!caminhoes.isEmpty()) {
                System.out.println("### Lista de Caminhões ###");
                int x = 1;
                for (Caminhao caminhao : caminhoes) {
                    System.out.println(x + " - " + caminhao.getModelo() + " - " + caminhao.getAno());
                    x++;
                }
            } else {
                System.out.println("Nenhum caminhão foi encontrado!");
            }
            
        } else {
            // Se ignorarTipo for falso, exibe apenas o tipo de veículo específico
            if (tipoVeiculo.equals("carro")) {
                // Exibe os carros
                if (!carros.isEmpty()) {
                    System.out.println("### Lista de Carros ###");
                    int x = 1;
                    for (Carro carro : carros) {
                        System.out.println(x + " - " + carro.getModelo() + " - " + carro.getAno());
                        x++;
                    }
                } else {
                    System.out.println("Nenhum carro foi encontrado!");
                }
                System.out.println("----------------------------------");
            }
    
            if (tipoVeiculo.equals("moto")) {
                // Exibe as motos
                if (!motos.isEmpty()) {
                    System.out.println("### Lista de Motos ###");
                    int x = 1;
                    for (Moto moto : motos) {
                        System.out.println(x + " - " + moto.getModelo() + " - " + moto.getAno());
                        x++;
                    }
                } else {
                    System.out.println("Nenhuma moto foi encontrada!");
                }
                System.out.println("----------------------------------");
            }
    
            if (tipoVeiculo.equals("caminhao")) {
                // Exibe os caminhões
                if (!caminhoes.isEmpty()) {
                    System.out.println("### Lista de Caminhões ###");
                    int x = 1;
                    for (Caminhao caminhao : caminhoes) {
                        System.out.println(x + " - " + caminhao.getModelo() + " - " + caminhao.getAno());
                        x++;
                    }
                } else {
                    System.out.println("Nenhum caminhão foi encontrado!");
                }
            }
        }
    }

    private static void comprarVeiculo(Scanner scanner) {
        try{
            System.out.println("### Compra de Veiculo ###");
            int escolha;

            System.out.println("Qual novo veiculo deseja cadastrar?");
            System.out.println("1 - Carro");
            System.out.println("2 - Moto");
            System.out.println("3 - Caminhão"); // requisito 1
            System.out.println("0 - Voltar ao menu");
            escolha = scanner.nextInt();
            scanner.nextLine();

            if (escolha > 3) { // requisito 1 (alterei de 2 para 3)
                throw new InputMismatchException();
            }
            while (escolha != 0) {
                System.out.print("Digite a marca do veículo: ");
                String marca = scanner.nextLine();

                System.out.print("Digite o modelo do veículo: ");
                String modelo = scanner.nextLine();

                System.out.print("Digite o ano do veículo: ");
                int ano = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Digite a cor do veículo: ");
                String cor = scanner.nextLine();

                System.out.print("Digite o preço do veículo: ");
                double preco = scanner.nextDouble();
            
                switch (escolha) {
                    case 1:
                        System.out.print("Digite o numero de portas veículo: ");
                        int nPortar = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Digite o tipo de combustivel: ");
                        String tipoCombustivel = scanner.nextLine();

                        System.out.print("Digite a capacidade do porta malas do veículo: ");
                        int capacidadePortaMalas = scanner.nextInt();
                        scanner.nextLine();

                        Carro carro = new Carro(marca, modelo, ano, cor, preco, nPortar, tipoCombustivel, capacidadePortaMalas);
                        carros.add(carro);
                        System.out.println("Carro modelo: "+modelo+", cadastrado com sucesso!");
                        escolha = 0;
                        break;

                    // requisito 1
                    case 3:
                        System.out.print("Digite o tipo do combustível do veiculo: ");
                        String combustivel = scanner.nextLine();

                        scanner.nextLine();
                        
                        System.out.print("É uma carreta? S - sim, N - não ");
                        String opcaoCarreta = scanner.nextLine();
                        boolean isCarreta;

                        if(opcaoCarreta == "S" || opcaoCarreta == "s"){
                            isCarreta = true;
                        }else{
                            isCarreta = false;
                        }

                        Caminhao caminhao = new Caminhao(marca, modelo, ano, cor, preco, isCarreta, combustivel);
                        caminhoes.add(caminhao);
                        System.out.println("Caminhão cadastrado com sucesso!");
                        escolha = 0;
                        break;

                    case 2:
                        System.out.print("Digite as cilindradas do veiculo: ");
                        int cilindradas = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("O veiculo possui partida eletrica? S - sim, N - não ");
                        String partida = scanner.nextLine();
                        boolean partidaEletrica;
                        if(partida == "S" || partida == "s"){
                            partidaEletrica = true;
                        }else{
                            partidaEletrica = false;
                        }

                        System.out.print("Digite a categoria do veiculo: ");
                        String categoria = scanner.nextLine();

                        Moto moto = new Moto(marca, modelo, ano, cor, preco, cilindradas, partidaEletrica, categoria);
                        motos.add(moto);
                        System.out.println("moto modelo: "+modelo+", cadastrada com sucesso!");
                        escolha = 0;
                        break;
                    default:
                        System.out.println("Opção invalida. Tente novamente.");
                        break;
                }
            }
            
        }catch (InputMismatchException e){
            System.out.println("Erro: Entrada invalida. Certifique-se de inserir os dados corretamente!");
        }catch (Exception e){
            System.out.println("Erro desconhecido: "+e.getMessage());
        }
    }

    private static void venderVeiculo(Scanner scanner) {
        try{
            if (clientes.isEmpty() || (carros.isEmpty() && motos.isEmpty() && caminhoes.isEmpty())) {
                if (clientes.isEmpty()) {
                    System.out.println("Não há clientes na base de dados!");
                }
                if (carros.isEmpty()) {
                    System.out.println("Não há carros disponiveis para vendas!");
                }
                if (motos.isEmpty()) {
                    System.out.println("Não há motos disponiveis para vendas!");
                }
                if (caminhoes.isEmpty()) {
                    System.out.println("Não há caminhões disponiveis para vendas!");
                }
            }else{
                mostrarClientes();
                Pessoa comprador = clientes.get(scanner.nextInt()-1);
                scanner.nextLine();

                System.out.print("Informe o valor da venda: R$");
                double valor = scanner.nextDouble();
                scanner.nextLine();

                int escolha;

                System.out.println("Qual novo veiculo deseja vender?");
                System.out.println("1 - Carro");
                System.out.println("2 - Moto");
                System.out.println("3 - Caminhão");
                escolha = scanner.nextInt();
                scanner.nextLine();

                switch (escolha) {
                    case 1:
                        mostrarVeiculos("carro", false);
                        Carro carroParaVenda = carros.get(scanner.nextInt() -1);
                        scanner.nextLine();

                        Venda novaVendaCarro = new Venda(carroParaVenda, comprador, valor, LocalDateTime.now());
                        vendas.add(novaVendaCarro);
                        carros.remove(carroParaVenda);
                        break;
                
                    case 2:
                        mostrarVeiculos("moto", false);
                        Moto motoParaVenda = motos.get(scanner.nextInt() -1);
                        scanner.nextLine();

                        Venda novaVendaMoto = new Venda(motoParaVenda, comprador, valor, LocalDateTime.now());
                        vendas.add(novaVendaMoto);
                        motos.remove(motoParaVenda);
                        break;
                    
                    case 3:
                        mostrarVeiculos("caminhao", false);
                        Caminhao caminhaoParaVenda = caminhoes.get(scanner.nextInt() -1);
                        scanner.nextLine();

                        Venda novaVendaCaminhao = new Venda(caminhaoParaVenda, comprador, valor, LocalDateTime.now());
                        vendas.add(novaVendaCaminhao);
                        caminhoes.remove(caminhaoParaVenda);
                        break;
                    
                }

                System.out.println("Venda executada com sucesso!");
            }
        }catch (InputMismatchException e){
            System.out.println("Erro: Entrada invalida. Certifique-se de inserir os dados corretamente!");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Erro: Indice invalido. Certifique-se de escolher uma opção correta!");
        }catch (Exception e){
            System.out.println("Erro desconhecido: "+e.getMessage());
        }
    }

    private static void mostrarClientes() {
        if (!clientes.isEmpty()) {
            System.out.println("### Lista de Clientes ###");
            int x = 1;
            for (Pessoa cliente : clientes) {
                System.out.println(x+" - "+cliente.getNome()+" - "+cliente.getTelefone());
                x++;
            }
        }else{
            System.out.println("Nenhuma cliente foi encontrado!");
        }
    }

    private static void cadastrarCliente(Scanner scanner) {
        try{
            System.out.println("### Cadastro de Cliente ###");

            System.out.println("Digite o nome do cliente: ");
            String nome = scanner.nextLine();

            System.out.println("Digite a idade do cliente: ");
            int idade = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Digite o endereço do cliente: ");
            String endereco = scanner.nextLine();

            System.out.println("Digite um telefone para contato do cliente: ");
            String telefone = scanner.nextLine();

            System.out.println("Digite o email do cliente: ");
            String email = scanner.nextLine();

            System.out.println("Digite a altura do cliente: ");
            double altura = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Digite o peso do cliente: ");
            double peso = scanner.nextDouble();
            scanner.nextLine();

            Pessoa novoCliente = new Pessoa(nome, idade, endereco, telefone, email, altura, peso);
            clientes.add(novoCliente);

            System.out.println("O cliente: "+nome+", foi cadastrado com sucesso!");

            recomendarVeiculo(novoCliente);
        }catch (InputMismatchException e){
            System.out.println("Erro: Entrada invalida. Certifique-se de inserir os dados corretamente!");
        }catch (Exception e){
            System.out.println("Erro desconhecido: "+e.getMessage());
        }
    }

    // requisito 4
    private static void recomendarVeiculo(Pessoa pessoa) {

        // pessoas altas e pesadas
        if (pessoa.getAltura() > 175 && pessoa.getPeso() > 80) {
            System.out.println("Segundo nossa análise, Caminhão é o veículo mais recomendado para ele!");
        }
        // pessoas de altura e peso médios
        else if ((pessoa.getAltura() >= 160 && pessoa.getAltura() <= 185) && 
                 (pessoa.getPeso() >= 60 && pessoa.getPeso() <= 90)) {
            System.out.println("Segundo nossa análise, Carro é o veículo mais recomendado para ele!");
        }
        // pessoas leves e baixas
        else if (pessoa.getAltura() < 160 && pessoa.getPeso() < 80) {
            System.out.println("Segundo nossa análise, Moto é o veículo mais recomendado para ele!");
        } 
        else {
            System.out.println("Recomendação de veículo não definida para essa pessoa.");
        }
    }

    private static void gerarRelatorio() {
        if (vendas.isEmpty()) {
            System.out.println("Não existem vendas cadastradas!");
        }else{
            System.out.println("### Relatorio de vendas ###");
            System.out.println();
            for (Venda venda : vendas) {
               System.out.println("Data: "+ venda.getDataVenda());
               System.out.println("Veiculo: "+venda.getVeiculo().getModelo()+" - "+venda.getVeiculo().getAno());
               System.out.println("Comprador: "+venda.getComprador().getNome()+" - "+venda.getComprador().getTelefone());
               System.out.println("Valor da venda: R$"+venda.getValor());

               // requisito 5 (apresentar lucro ou prejuízo)
               double precoVeiculo = venda.getVeiculo().getPreco();
               double precoVenda = venda.getValor();
               double diferenca = precoVenda - precoVeiculo;

               if (diferenca > 0) {
                System.out.println("Lucro: R$" + diferenca);
               } else if (diferenca < 0){
                System.out.println("Prejuízo: R$" + (diferenca * -1));
               }else{
                System.out.println("Veículo vendido pelo preço de fábrica.");
               }

               System.out.println("----------------------------------------------------------------"); 
               System.out.println();
            }
        }
    }
}
