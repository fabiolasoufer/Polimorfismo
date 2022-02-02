package Heranca ;

public class Cachorro extends Animal {
	
		private String veloz;
		
		@Override
		public void emitirSom() {
			System.out.println("AAAAAAAUUUUU AAAAAAUUUUUU");
		}

		public String getVeloz() {
			return veloz;
		}

		public void setVeloz(String veloz) {
			this.veloz = veloz;
		}
		
		

		



}
