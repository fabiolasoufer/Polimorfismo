package Heranca;

public class Animal {
	
	private String nome;
	private int idade;
	private boolean emitirSom;
	
	public void emitirSom() {
		System.out.println("Som gen�rico...");
	}
		
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public boolean isEmitirSom() {
		return emitirSom;
	}
	public void setEmitirSom(boolean emitirSom) {
		this.emitirSom = emitirSom;
	}
	
	

}
