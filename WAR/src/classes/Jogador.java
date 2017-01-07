package classes;

import java.util.List;

public class Jogador {
	private String cor;
	private List<Exercito> exercitosDisponiveis;
	private List<Territorio> terretoriosPertencentes;
	
	public Jogador(String cor) {
		this.cor = cor;
	}
}
