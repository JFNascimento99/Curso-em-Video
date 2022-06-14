package exercicio02;

public class Louça {
	String tipo;
	boolean sujo;
	
	void status() {
		System.out.println("Tipo: " + this.tipo);
		System.out.println("Está sujo? " + this.sujo);
	}
	
	void sujar() {
		this.sujo = true;
	}
}
