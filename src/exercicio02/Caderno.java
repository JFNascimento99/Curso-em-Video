package exercicio02;

public class Caderno {
	boolean riscado;
	boolean aberto;
	int folhas;
	String modelo;
	
	
	void status() {
		System.out.println("Temos um " + this.modelo);
		System.out.println("Com "+ this.folhas + " folhas");
		System.out.println("Ele está aberto? " + this.aberto);
		System.out.println("Ele está riscado? " + this.riscado);
	}
}
