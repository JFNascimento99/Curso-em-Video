package exercicio02;

public class Forma {
	String sabor;
	String cobertura;
	String formato;
	int tamanho;
	float preço;
	boolean noForno = false;
	boolean assado = false;
	
	void status() {
		System.out.println("Um bolo de " + this.sabor);
		System.out.println("Com corbetura de " + this.cobertura);
		System.out.println("No formato " + this.formato);
		System.out.println("Tem um raio de " + this.tamanho + " cm");
		System.out.println("Que custa " + this.preço + " reais");
		System.out.println("Já está assado? " + this.assado);
	}
	
	void assar() {
		if (this.noForno == false) {
			System.out.println("Não posso assar fora do forno");
		} else {
			this.noForno = true;
			System.out.println("Está assando");
		}
	}
	
	void colocar(){
		this.noForno = true;
	}
	
	void tirar() {
		this.noForno = false;
	}
}
