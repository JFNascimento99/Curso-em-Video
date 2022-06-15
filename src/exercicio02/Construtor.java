package exercicio02;

public class Construtor {

	public static void main(String[] args) {
		Caderno c1 = new Caderno();
		c1.modelo = "fichário";
		c1.folhas = 15;
		
		c1.abrir();
		c1.riscar();
		c1.status();
		
		Caderno c2 = new Caderno();
		c2.modelo = "caderno";
		c2.folhas = 0;
		
		c2.abrir();
		c2.status();
		c2.riscar();
	}
}
