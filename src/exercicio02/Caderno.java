package exercicio02;

public class Caderno {
	boolean riscado = false;
	boolean aberto = false;
	int folhas;
	String modelo;
	
	void status() {
		System.out.println("Temos um " + this.modelo);
		System.out.println("Com "+ this.folhas + " folhas");
		System.out.println("Ele está aberto? " + this.aberto);
		System.out.println("Ele está riscado? " + this.riscado);
	}
	
	void riscar() {
		if (this.aberto != false) {
			if(this.folhas > 0) {
				this.riscado = true;
			} else {
				System.out.println("Não posso riscar sem folhas");
			}
		} else {
			System.out.println("Não posso riscar se tiver fechado");
		}
	}
	
	void abrir() {
		this.aberto = true; 
	}
	
	void fechar() {
		this.aberto = false;
	}
}
