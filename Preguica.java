package Heranca;

public class Preguica extends Animal {
	
	private String escala;
	
	@Override
	public void emitirSom() {
		System.out.println("Fiuuu Fiuuu");
	}

	public String getEscala() {
		return escala;
	}

	public void setEscala(String escala) {
		this.escala = escala;
	}
	
	

}
