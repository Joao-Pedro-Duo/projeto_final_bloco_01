package petshop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
	
	// Global
	public static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
			
		int opcao;
		
		
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
	
				keyPress();
				break;
			case 2:
				System.out.println("Listar Todos os Produtos\n\n");
				
				keyPress();
				break;
			case 3:
				System.out.println("Buscar Produto - por ID\n\n");
				
				keyPress();
				break;
			case 4:
				System.out.println("Atualizar dados do Produto\n\n");
				
				keyPress();
				break;
			case 5:
				System.out.println("Deletar Produto\n\n");
				
				keyPress();
				break;
			case 6:
				System.out.println("Consulta por nome do Produto\n\n");
				
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
	
}
	
	
