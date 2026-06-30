package petshop;

import java.util.InputMismatchException;
import java.util.Optional;
import java.util.Scanner;

import petshop.controller.ProdutoController;
import petshop.model.Brinquedo;
import petshop.model.PetCare;
import petshop.model.Produto;
import petshop.model.Racao;


public class Menu {
	
	// Global
	public static Scanner leia = new Scanner(System.in);
	private static final ProdutoController produtoController = new ProdutoController();

	public static void main(String[] args) {
			
		int opcao;
		
		criarContasTeste();
		
		
		while (true) {
			
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("     PETVIDA - O MELHOR PETSHOP PARA O SEU AUMIGO    ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Cadastrar Produto                    ");
			System.out.println("            2 - Listar todos os Produtos             ");
			System.out.println("            3 - Buscar Produto por ID                ");
			System.out.println("            4 - Atualizar Dados do Produto           ");
			System.out.println("            5 - Deletar Produto                      ");
			System.out.println("            6 - Consulta por nome do Produto         ");
			System.out.println("            0 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");
	
			
			try {
				opcao = leia.nextInt();
				leia.nextLine();
			} catch(InputMismatchException e) {
				opcao = -1;
				System.out.println("Digite um número inteiro entre 0 e 8");
				leia.nextLine();
			}
			
	
			if (opcao == 0) {
				System.out.println( "\nPETVIDA - Cuidando de quem faz parte da sua família.");
				sobre();
				leia.close();
				System.exit(0);
			}
	
			switch (opcao) {
			case 1:
				System.out.println("Cadastrar Produto\n\n");
				
				cadastrarProduto();
	
				keyPress();
				break;
			case 2:
				System.out.println("Listar Todos os Produtos\n\n");
				
				listarProdutos();
				
				keyPress();
				break;
			case 3:
				System.out.println("Buscar Produto - por ID\n\n");
				
				procurarProdutoPorId();
				
				keyPress();
				break;
			case 4:
				System.out.println("Atualizar dados do Produto\n\n");
				
				atualizarProduto();
				
				keyPress();
				break;
			case 5:
				System.out.println("Deletar Produto\n\n");
				
				deletarProduto();
				
				keyPress();
				break;
			case 6:
				System.out.println("Consulta por nome do Produto\n\n");
				
				listarPorNome();
				
				keyPress();
				break;
			default:
				System.out.println("\nOpção Inválida!\n");
				keyPress();
				break;
			}
		}
	}
	
	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: João Pedro Duo ");
		System.out.println("LinkedIn - linkedin.com/in/joaopedroduo ");
		System.out.println("github.com/Joao-Pedro-Duo");
		System.out.println("*********************************************************");
	
	}
		
	public static void keyPress() {
		System.out.println("\n\nPressione Enter para continuar...");
			leia.nextLine();
	}
	
	public static void criarContasTeste() {
		produtoController.cadastrarProduto(
				new Brinquedo(produtoController.gerarId(), "Sapo de Pelúcia", 39.99f, 5, "KONG", 1, "poliéster",
						"Todos", "Todas", "Sim"));
		produtoController.cadastrarProduto(
				new PetCare(produtoController.gerarId(), "Shampoo Antipugas", 42.90f, 18, "Frontline", 3, "Shampoo",
						"Suave", 500, "Todas"));
		produtoController.cadastrarProduto(
				new Racao(produtoController.gerarId(), "Golden Special", 179.99f, 10, "PremieR Pet", 2,
						"Frango", 20, "Adulto", "Grande"));
	}
	
	public static void listarProdutos() {
		produtoController.listarTodosProdutos();
	}
	
	public static void cadastrarProduto() {

		System.out.println("Digite o Nome do produto: ");
		String nome = leia.nextLine();

		System.out.println("Digite o preço do produto: ");
		// leia.skip("\\R");
		float preco = leia.nextFloat();
		
		System.out.println("Digite a quantidade em estoque: ");
		// leia.skip("\\R");
		int estoque = leia.nextInt();
		
		System.out.println("Digite a Marca do produto: ");
		String marca = leia.nextLine();


		System.out.println("Digite o tipo da Produto (1 - Brin | 2 - Ração | 3 - PetCare ): ");
		int tipo = leia.nextInt();

		switch (tipo) {
		case 1 -> {
			System.out.println("Digite o material do produto: ");
			String material = leia.nextLine();
			//leia.nextLine();
			
			System.out.println("Digite para qual animal é o produto: ");
			String tipoAnimal = leia.nextLine();
			//leia.nextLine();
			
			System.out.println("Digite a Faixa Etária do animal: ");
			String faixaEtaria = leia.nextLine();
			//leia.nextLine();
			
			System.out.println("Digite se o brinquedo é interativo: ");
			String interativo = leia.nextLine();
			//leia.nextLine();

			produtoController
					.cadastrarProduto(new Brinquedo(produtoController.gerarId(), nome, preco, estoque, marca, tipo, material, tipoAnimal, faixaEtaria, interativo));
		}
		case 2 -> {
			System.out.println("Digite o sabor da ração: ");
			String sabor = leia.nextLine();
			//leia.nextLine();
			
			System.out.println("Digite o peso da ração: ");
			float peso = leia.nextFloat();
			//leia.nextLine();
			
			System.out.println("Digite a Faixa Etária do animal: ");
			String faixaEtaria = leia.nextLine();
			//leia.nextLine();
			
			System.out.println("Digite o porte do animal: ");
			String porte = leia.nextLine();
			//leia.nextLine();

			produtoController
					.cadastrarProduto(new Racao(produtoController.gerarId(), nome, preco, estoque, marca, tipo, sabor, peso, faixaEtaria, porte));
		}
		case 3 -> {
			System.out.println("Digite a categoria do produto: ");
			String categoria = leia.nextLine();
			//leia.nextLine();
			
			System.out.println("Digite a fragrância do produto: ");
			String fragrancia = leia.nextLine();
			//leia.nextLine();
			
			System.out.println("Digite o volume do produto (ml): ");
			int volume = leia.nextInt();
			leia.nextLine();
			
			System.out.println("Digite o tipo da pelagem do animal: ");
			String tipoPelagem = leia.nextLine();
			//leia.nextLine();

			produtoController
					.cadastrarProduto(new PetCare(produtoController.gerarId(), nome, preco, estoque, marca, tipo, categoria, fragrancia, volume, tipoPelagem));
		}
		default -> System.out.println("Tipo de conta inválida!");
		}
		}
		
		public static void procurarProdutoPorId() {

			System.out.println("Digite o id do produto: ");
			int id = leia.nextInt();
			leia.nextLine();

			produtoController.procurarPorId(id);

		}
		
		public static void deletarProduto() {

			System.out.println("Digite o id do produto: ");
			int id = leia.nextInt();
			leia.nextLine();

			Optional<Produto> produto = produtoController.buscarNaCollection(id);

			if (produto.isPresent()) {

				// Confirmação da exclusão

				System.out.printf("\nTem certeza que você deseja excluir o produto numero %d (S/N)?", id);
				String confirmacao = leia.nextLine();

				if (confirmacao.equalsIgnoreCase("S"))
					produtoController.deletarProduto(id);
				else
					System.out.println("\nOperação cancelada!");

			} else {
				System.out.printf("\nO Produto número %d não foi encontrado!", id);
			}

		}
		
		public static void atualizarProduto() {

			System.out.println("Digite o id do produto: ");
			int id = leia.nextInt();
			leia.nextLine();

			Optional<Produto> produto = produtoController.buscarNaCollection(id);

			if (produto.isPresent()) {

				// Obtém os dados atuais do produto
				String nome = produto.get().getNome();
				float preco = produto.get().getPreco();
				int estoque = produto.get().getEstoque();
				String marca = produto.get().getMarca();
				int tipo = produto.get().getTipo();

				// Atualiza o nome ou mantém o valor atual
				System.out.printf("Nome atual: %s"
						+ "%nDigite o novo nome do produto (Pressione ENTER para manter o valor atual)", nome);
				String entrada = leia.nextLine();

				nome = entrada.isEmpty() ? nome : entrada;
				
				// Atualiza o preço ou mantém o valor atual
				System.out.printf("Preço atual: %.2f"
						+ "%nDigite o novo preço (Pressione ENTER para manter o valor atual)", preco);
				entrada = leia.nextLine();

				preco = entrada.isEmpty() ? preco : Float.parseFloat(entrada.replace(",","."));
				
				// Atualiza o estoque ou mantém o valor atual
				System.out.printf("Estoque atual: %d"
						+ "%nDigite a quantidade do novo estoque (Pressione ENTER para manter o valor atual)", estoque);
				entrada = leia.nextLine();

				estoque = entrada.isEmpty() ? estoque : Integer.parseInt(entrada);
				
				// Atualiza a marca ou mantém o valor atual
				System.out.printf("Marca atual: %s"
						+ "%nDigite a nova marca do produto (Pressione ENTER para manter o valor atual)", nome);
				entrada = leia.nextLine();

				marca = entrada.isEmpty() ? marca : entrada;
				
				switch(tipo) {
					case 1 ->{
						Brinquedo produtoBrinquedo = (Brinquedo) produto.get();
						
						// Obtém os dados atuais do produto Brinquedo
						String material = produtoBrinquedo.getMaterial();
						
						String tipoAnimal = produtoBrinquedo.getTipoAnimal();
						
						String faixaEtaria = produtoBrinquedo.getFaixaEtaria();
						
						String interativo = produtoBrinquedo.getInterativo();
						
						
						// Atualiza o material ou mantém o valor atual
						System.out.printf("Material atual: %s"
								+ "%nDigite o novo material do produto (Pressione ENTER para manter o valor atual)", material);
						entrada = leia.nextLine();
		
						material = entrada.isEmpty() ? material : entrada;
						
						// Atualiza o tipoAnimal ou mantém o valor atual
						System.out.printf("Tipo para o animal atual: %s"
								+ "%nDigite o novo tipo para o animal (Pressione ENTER para manter o valor atual)", tipoAnimal);
						entrada = leia.nextLine();
		
						tipoAnimal = entrada.isEmpty() ? tipoAnimal : entrada;
						
						// Atualiza o faixaEtaria ou mantém o valor atual
						System.out.printf("Faixa Etária do animal atual: %s"
								+ "%nDigite a nova faixa etária do animal (Pressione ENTER para manter o valor atual)", faixaEtaria);
						entrada = leia.nextLine();
		
						faixaEtaria = entrada.isEmpty() ? faixaEtaria : entrada;
						
						// Atualiza o Interativo ou mantém o valor atual
						System.out.printf("Produto é interativo atual: %s"
								+ "%nDigite o novo produto interativo atual (Pressione ENTER para manter o valor atual)", interativo);
						entrada = leia.nextLine();
		
						interativo = entrada.isEmpty() ? interativo : entrada;
						
						produtoController.atualizarProduto(new Brinquedo(id, nome, preco, estoque, marca, tipo, material, tipoAnimal, faixaEtaria, interativo));
						
					}
					case 2 -> {
						Racao produtoRacao = (Racao) produto.get();
						
						// Obtém os dados atuais do produto Brinquedo
						String sabor = produtoRacao.getSabor();
						
						float peso = produtoRacao.getPeso();
						
						String faixaEtaria = produtoRacao.getFaixaEtaria();
						
						String porte = produtoRacao.getPorte();
						
						
						// Atualiza o sabor ou mantém o valor atual
						System.out.printf("Sabor da ração atual: %s"
								+ "%nDigite o novo sabor da ração (Pressione ENTER para manter o valor atual)", sabor);
						entrada = leia.nextLine();
		
						sabor = entrada.isEmpty() ? sabor : entrada;
						
						// Atualiza o peso ou mantém o valor atual
						System.out.printf("Peso da ração atual: %.1f"
								+ "%nDigite o novo peso da ração (Pressione ENTER para manter o valor atual)", peso);
						entrada = leia.nextLine();
		
						peso = entrada.isEmpty() ? peso : Float.parseFloat(entrada.replace(",","."));
						
						// Atualiza o faixaEtaria ou mantém o valor atual
						System.out.printf("Faixa Etária do animal atual: %s"
								+ "%nDigite a nova faixa etária do animal (Pressione ENTER para manter o valor atual)", faixaEtaria);
						entrada = leia.nextLine();
		
						faixaEtaria = entrada.isEmpty() ? faixaEtaria : entrada;
						
						// Atualiza o porte ou mantém o valor atual
						System.out.printf("Porte do animal para ração adequada: %s"
								+ "%nDigite o novo porte do animal para ração adequada (Pressione ENTER para manter o valor atual)", porte);
						entrada = leia.nextLine();
		
						porte = entrada.isEmpty() ? porte : entrada;
						
						produtoController.atualizarProduto(new Racao(id, nome, preco, estoque, marca, tipo, sabor, peso, faixaEtaria, porte));
					}
					case 3 -> {
						PetCare produtoPetCare = (PetCare) produto.get();
						
						// Obtém os dados atuais do produto Brinquedo
						String categoria = produtoPetCare.getCategoria();
						
						String fragrancia = produtoPetCare.getFragrancia();
						
						int volume = produtoPetCare.getVolume();
						
						String tipoPelagem = produtoPetCare.getTipoPelagem();
						
						
						// Atualiza o categoria ou mantém o valor atual
						System.out.printf("Categoria do produto atual: %s"
								+ "%nDigite a nova categoria do produto (Pressione ENTER para manter o valor atual)", categoria);
						entrada = leia.nextLine();
		
						categoria = entrada.isEmpty() ? categoria : entrada;
						
						// Atualiza a fragrancia ou mantém o valor atual
						System.out.printf("Fragrância atual: %s"
								+ "%nDigite a nova fragrância (Pressione ENTER para manter o valor atual)", fragrancia);
						entrada = leia.nextLine();
		
						fragrancia = entrada.isEmpty() ? fragrancia : entrada;
						
						// Atualiza o volume ou mantém o valor atual
						System.out.printf("Volume (ml) do produto atual: %d"
								+ "%nDigite o novo volume (ml) do produto (Pressione ENTER para manter o valor atual)", volume);
						entrada = leia.nextLine();
		
						volume = entrada.isEmpty() ? volume : Integer.parseInt(entrada);
						
						// Atualiza o tipoPelagem ou mantém o valor atual
						System.out.printf("Tipo pelagem do animal para o produto adequado: %s"
								+ "%nDigite o novo tipo pelagem do animal para o produto adequado (Pressione ENTER para manter o valor atual)", tipoPelagem);
						entrada = leia.nextLine();
		
						tipoPelagem = entrada.isEmpty() ? tipoPelagem : entrada;
						
						produtoController.atualizarProduto(new PetCare(id, nome, preco, estoque, marca, tipo, categoria, fragrancia, volume, tipoPelagem));
					}
					default -> System.out.println("Tipo da conta é inválido!");
				}

			} else {
				System.out.printf("\nO produto número %d não foi encontrado!", id);
			}

		}
		
		public static void listarPorNome(){
			
			System.out.println("Digite o nome do produto: ");
			String nome = leia.nextLine();
			
			produtoController.listarPorNomeDoProduto(nome);
			
		}	
	
}
	
	
