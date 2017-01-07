package execucao;

import classes.Jogador;
import classes.Menu;

public class Teste {
	public static void main(String[] args) {
		Menu demonstracao = new Menu();
		
		demonstracao.menuPrincipal();
		demonstracao.escolhaJogadores();
		
		Jogador jogador1 = new Jogador(demonstracao.corEscolhida);
		
		
		
		
	}
}
