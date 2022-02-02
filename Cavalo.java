package Heranca;

public class Cavalo extends Animal {
	
	private String veloz;
	
	@Override
	public void emitirSom() {
		System.out.println("Hiin in in");
	}

	public String getVeloz() {
		return veloz;
	}

	public void setVeloz(String veloz) {
		this.veloz = veloz;
	}
	
	
	
}
