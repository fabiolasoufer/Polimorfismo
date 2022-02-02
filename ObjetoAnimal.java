package Heranca;

public class ObjetoAnimal {

	public static void main(String[] args) {
		
		Cachorro dog = new Cachorro();
		Cavalo horse = new Cavalo();
		Preguica sloth = new Preguica();
				
		dog.setNome("Chester");
		dog.setIdade(5);
		dog.setVeloz("Correr.");
				
		horse.setNome("Estrela");
		horse.setIdade(19);
		horse.setVeloz("Correr.");
				
		sloth.setNome("Mimo");
		sloth.setIdade(2);
		sloth.setEscala("Subir em àrvores.");
		
		System.out.println("O nome do cachorro é: "+dog.getNome()+". Tem "+dog.getIdade()+" anos. E gosta de "+dog.getVeloz());
		System.out.print("O som que emite é: "); dog.emitirSom();
		System.out.println("");
		System.out.println("O nome do cavalo é: "+horse.getNome()+". Tem "+horse.getIdade()+" anos. E gosta de "+horse.getVeloz());
		System.out.print("O som que emite é: "); horse.emitirSom();
		System.out.println("");
		System.out.println("O nome da preguiça é: "+sloth.getNome()+". Tem "+sloth.getIdade()+" anos. E gosta de "+sloth.getEscala());
		System.out.print("O som que emite é: "); sloth.emitirSom();
		
	}

}
