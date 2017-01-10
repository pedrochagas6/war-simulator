package classes;

public class Territorio {
	
	private String nome = new String();
	private String cor = new String();
	private String continente; //mudar para Continente
	//private List<Terrestre> exercitosTerrestresEmOcupacao;
	//private List<Aereo> exercitosAereosEmOcupacao;
	
	
	public Territorio(String continente, String nome, String cor) {
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
