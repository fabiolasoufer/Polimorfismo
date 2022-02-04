package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class EstoqueLoja {
	
	public static void main(String args[]) {
		
		ArrayList<String> estoque = new ArrayList<>();
				
		estoque.add("Blusa Rosa");
		estoque.add("Blusa Azul");
		estoque.add("Camisa Preta");
		estoque.add("Calça Preta");
		estoque.add("Calça Bege");
		
		System.out.println(estoque);
		
		Collections.sort(estoque);
		System.out.println(estoque);
		
		estoque.remove(2);
		estoque.remove(3);
		System.out.println(estoque);
				
			
		
		
	}

}
