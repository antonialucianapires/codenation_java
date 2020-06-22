package desafio_fibonacci;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

	public static List<Integer> fibonacci() {
		List<Integer> sequencia = new ArrayList<Integer>();
		int numero1 = 0;
		int numero2 = 1;
		int index = 0;

		sequencia.add(numero1);
		sequencia.add(numero2);

		while (index < 350){
			sequencia.add(index = numero1 + numero2);
			numero1 = numero2;
			numero2 = index;
		}
		return sequencia;
	}

	public static Boolean isFibonacci(Integer numero) {
		return fibonacci().contains(numero);
	}
	
}