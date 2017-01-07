package src.classes;

public class Territorio {
	
	public enum Continente {
		AFRICA,
		AMERICA_DO_NORTE,
		AMERICA_DO_SUL,
		ASIA,
		EUROPA,
		OCEANIA;
	}
	
	private String nome = new String();
	private String cor = new String();
	private Continente continente;
	//private List<Terrestre> exercitosTerrestresEmOcupacao;
	//private List<Aereo> exercitosAereosEmOcupacao;
	
	
	public Territorio(Continente continente, String nome, String cor) {
		super();
		this.continente = continente;
		this.nome = nome;
		this.cor = cor;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
}
