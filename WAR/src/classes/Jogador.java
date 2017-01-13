package classes;

public class Jogador {
	private String cor;
	private int exercitosTerrestresDisponiveis;
	private int exercitosAereosDisponiveis;
	private int terretoriosPertencentes;
	private boolean maquina;
	
	public Jogador(String cor, boolean ehMaquina) {
		this.cor = cor;
		this.maquina = ehMaquina;
		this.terretoriosPertencentes = 0;
	}
	
	public int getExercitosTerrestresDisponiveis() {
		return exercitosTerrestresDisponiveis;
	}

	public void setExercitosTerrestresDisponiveis() {
		this.exercitosTerrestresDisponiveis = this.terretoriosPertencentes / 2;
	}
	
	public int getExercitosAereosDisponiveis() {
		return exercitosAereosDisponiveis;
	}

	public void setExercitosAereosDisponiveis() {
		this.exercitosAereosDisponiveis = this.terretoriosPertencentes / 3;
	}

	public int getTerretoriosPertencentes() {
		return terretoriosPertencentes;
	}

	public void setTerretoriosPertencentes(int terretoriosPertencentes) {
		this.terretoriosPertencentes = terretoriosPertencentes;
	}

	public String getCor() {
		return cor;
	}

	public boolean isMaquina() {
		return maquina;
	}
	
	public void decrementarExercitosTerrestres() {
		this.exercitosTerrestresDisponiveis--;
	}
	
	public void decrementarExercitosAereos() {
		this.exercitosAereosDisponiveis--;
	}
	
	public void acrescentaTerritorio() {
		this.terretoriosPertencentes++;
	}
}
