package exercicio02;

public class Lavadora {
	String esponja;
	int sabonete;
	boolean agua;
	
	void status() {
		System.out.println("Qualidade da esponja: " + this.esponja);
		System.out.println("Quantidade de sabonete: " + this.sabonete + " ml");
		System.out.println("Tem água? " + this.agua);
	}
}
