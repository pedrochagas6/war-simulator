package execucao;

import java.io.FileNotFoundException;

import classes.Jogador;
import classes.MapaMundi;
import classes.Menu;

public class Teste {
	public static void main(String[] args) {
		Menu demonstracao = new Menu();
		
		demonstracao.menuPrincipal();
		demonstracao.escolhaJogadores();
		
		//Criacao doa jogadores da partida
		Jogador jogador1 = new Jogador(demonstracao.corEscolhidaJogador, false);
		Jogador jogadorMaquina = new Jogador(demonstracao.corEscolhidaMaquina, true);
		
		//Construcao do mapa Mundi e verificacao
		MapaMundi mapa = new MapaMundi();
		try {
			mapa.construir();
		} catch(FileNotFoundException e) {
			System.out.println("Arquivo nao encontrado");
		}
		
		//destribuicao inicial dos territorios aleatoriamente
		mapa.distribuirTerritoriosEntreOsJogadores(jogador1, jogadorMaquina);
		
		//Distribuicao dos exercitos terrestres
		mapa.distribuirExercitosTerrestres(jogador1);
		mapa.distribuirExercitosTerrestres(jogadorMaquina);
		
		//Distribuicao dos exercitos Aereos
		mapa.distribuirExercitosAereos(jogador1);
		mapa.distribuirExercitosAereos(jogadorMaquina);
		
		
	}
}
