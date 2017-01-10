package classes;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class MapaMundi {
	Territorio[][] mapaMundi = new Territorio[5][8];
	
	public Territorio[][] getMapaMundi() {
		return mapaMundi;
	}

	@SuppressWarnings("resource")
	public void construir() throws FileNotFoundException {
		Scanner scanner = new Scanner(new FileReader("mapaMundi.txt")).useDelimiter("\\||\\n");
		for(int i=0; i<5; i++){
			for(int j=0; j<8; j++){
				if(scanner.hasNext()){
					String continente = scanner.next();
					String nome = scanner.next();
					Territorio aSerInserido = new Territorio(continente, nome, "Nenhuma");
					this.mapaMundi[i][j] = aSerInserido;
				}
			}
		}
	}
	
	public void mostrar() {
		
	}
}
