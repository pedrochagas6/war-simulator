package classes;

import java.util.Scanner;

public class Menu {
	public String corEscolhidaJogador;
	public String corEscolhidaMaquina;
	public Scanner entrada = new Scanner(System.in);
	
	public void menuPrincipal() {
		int resposta;
		
		do {
			System.out.println("WAR\n");
			System.out.println("Iniciar Partida (Digite 1)");
			
			resposta = this.entrada.nextInt();
		} while(resposta != 1);
	}
	
	public void escolhaJogadores() {
		int escolha;
		
		do {
			System.out.println("Escolha uma cor:\n");
			
			System.out.println("1. Vermelho");
			System.out.println("2. Verde");
			System.out.println("3. Amarelo");
			System.out.println("\nFaça a sua escolha");
			
			escolha = this.entrada.nextInt();
		} while(escolha < 1 && escolha > 3);
		
		if(escolha == 1) {
			this.corEscolhidaJogador = "Vermelho";
			this.corEscolhidaMaquina = "Verde";
		}
		else if(escolha == 2) {
			this.corEscolhidaJogador = "Verde";
			this.corEscolhidaMaquina = "Amarelo";
		}
		else {
			this.corEscolhidaJogador = "Amarelo";
			this.corEscolhidaMaquina = "Vermelho";
		}
	}
}
