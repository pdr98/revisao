package src.main.java.br.com.pedro.trijava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LerListaNome {

	public static void main(String[] args) {
		
		ListarLerNomes();
		
	}
	public static void ListarLerNomes() {
		List<String> lista = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		String nomeDigitado = "";
		
		do{
			System.out.println("Qual o nome que quer adicionar na lista?");
			nomeDigitado = scan.next();
			lista.add(nomeDigitado);
		}while(!"parar".equals(nomeDigitado));
		
		lista.remove("parar");
		
		System.out.println(lista);
	}

}
