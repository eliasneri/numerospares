import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pares {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		List <String> lista = new ArrayList<>();
		int numero = 0;
		
		while (numero != -1) {
			System.out.println("Para Sair digite -1");
			System.out.print("Ou digite um número inteiro para verificação Par/Ímpar: ");
			numero = ler.nextInt();
			
			
			if (numero % 2 == 0) {
				System.out.println("Numero Par");
				lista.add(numero + " Par");
				System.out.println();
			} else {
				System.out.println("Numero Ímpar");
				lista.add(numero + " Ímpar");
				System.out.println();
			}
			
		}
		
		System.out.println("Encerrado!!! confira a litsa");
		System.out.println("Ítens na Lista: " + lista.size());
		lista.remove(lista.size()-1);
		
		for (String c: lista) {
			System.out.println(lista.indexOf(c)+ " - Número: " + c);
		}
			
		
			
			ler.close();

	}

}
