import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MaiorNumeroIrmao {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um Número: ");

		
		try {
			
			int valor = Integer.parseInt(entrada.next());
			
			if (valor <= 100000000 && valor > 0) {
				String stringValor = String.valueOf(valor);
				List<Integer> array = new ArrayList<Integer>();
		 		
				for (int i = 0; i < stringValor.length(); i++) {
					array.add(Integer.valueOf(Character.toString(stringValor.charAt(i))));
				}
				
				Collections.sort(array);
				Collections.reverse(array);
				System.out.println(array.toString().replaceAll("\\D*", ""));
			} else {
				System.out.print("-1");
			}
			
		} catch (NumberFormatException e) {
			System.out.println("Não é um número inteiro.");
		}

		

		entrada.close();
	}

}
