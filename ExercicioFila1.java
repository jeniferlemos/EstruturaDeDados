package Collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioFila1 {

	public static void main(String[] args) {
		Queue<String> FilaBanco = new LinkedList<>();
	Scanner Leia= new Scanner(System.in);
	int Opcao;
	
	do {
		//Exibir o Menu
		System.out.println("\nMenu de Opções: ");
		System.out.println("Opção 1: Novo Cliente entrar na Fila ");
		System.out.println("Opção 2: Exibir todos os Clientes na Fila: ");
		System.out.println("Opção 3: Atender um Cliente da Fila.. ");
		System.out.println("Opção 0: Encerrar Programa");
		System.out.println("\nEscolha uma opção: ");
		Opcao= Leia.nextInt();
		
		switch(Opcao) {
			
		case 1:
				Leia.nextLine();
			System.out.println("Digite o nome do Cliente que entrará na Fila: ");
			String nomeCliente= Leia.nextLine();
			FilaBanco.add(nomeCliente);
			System.out.println("Cliente entrou na fila...");
			break;
			
		case 2:
			System.out.println("\nClientes que estão na Fila: ");
			for (String Cliente: FilaBanco) {
			System.out.println(Cliente);
		}
		break;
		
		case 3:
			if(!FilaBanco.isEmpty()) {
				String ClienteAtendido= FilaBanco.poll();
				System.out.println("cliente Atendido..."+ClienteAtendido);
			}else {
				System.out.println("Não há mais clientes, a Fila está Vazia!");
			}
			break;
		case 0:
			System.out.println("Programa Encerrado!");
			break;
			
			default:
				System.out.println("Opção Invalida");
			}
	}while (Opcao !=0);
	
	}
	

	}


