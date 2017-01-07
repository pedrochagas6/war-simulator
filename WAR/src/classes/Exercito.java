package classes;

import java.util.Random;

public abstract class Exercito {
	public int combater() {
		Random sorteio = new Random();
		int resultado;
		do
			resultado = sorteio.nextInt(6);
		while(resultado == 0);
		return  resultado;
	}
}
