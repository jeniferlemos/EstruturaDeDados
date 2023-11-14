package Collections;

import java.util.Scanner;
import java.util.Stack;

public class ExercicioPilha {

	public static void main(String[] args) {
		Stack<String> PilhaLivros = new Stack<>();
		
		Scanner Leia= new Scanner(System.in);
		int Opcao;
		
		do {
			//Exibir o Menu
			System.out.println("\nMenu de Opções: ");
			System.out.println("Opção 1: Adicionar um novo livro na Pilha ");
			System.out.println("Opção 2: Exibir todos os livros da Pilha: ");
			System.out.println("Opção 3: Pegar um livro da Pilha.. ");
			System.out.println("Opção 0: Encerrar Programa");
			System.out.println("\nEscolha uma opção: ");
			Opcao= Leia.nextInt();
			
			switch(Opcao) {
				
			case 1:
					Leia.nextLine();
				System.out.println("Digite o nome do Livro que irá adicionar: ");
				String nomeLivro= Leia.nextLine();
				PilhaLivros.push(nomeLivro);
				System.out.println("Livro Adicionado...");
				break;
				
			case 2:
				System.out.println("\nLivros que estão na Pilha: ");
				for (String Livro: PilhaLivros) {
				System.out.println(Livro);
			}
			break;
			
			case 3:
				if(!PilhaLivros.isEmpty()) {
					String LivroRetirado= PilhaLivros.pop();
					System.out.println("Livro retirado com sucesso..."+LivroRetirado);
				}else {
					System.out.println("Não há mais Livros, a Pilha está Vazia!");
				}
				break;
			case 0:
				System.out.println("Programa Encerrado!");
				break;
				
				default:
					System.out.println("Opção Invalida, volte a tentar...");
				}
		}while (Opcao !=0);
	}

}
