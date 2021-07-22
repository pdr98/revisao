package src.main.java.br.com.pedro.trijava;


public class Revisao {

	public static void main(String[] args_) {
		String[] args = {"multiplicar", "4", "2"};
		
		calculadoraArgs(args);
	
	}

	public static void calculadoraArgs(String args[]) {
		int soma = 0;
		int dividir = 0;
		int multiplicar = 0;
		
		
		if(args.length <= 3) {
		
			if(args[0].equals("dividir")) {
			dividir = (Integer.valueOf(args[1]) / Integer.valueOf(args[2])); 
			System.out.println("O valor da divisão é: " + dividir);
		
		
			}else if (args[0].equals("somar")) {
			soma = (Integer.valueOf(args[1]) + Integer.valueOf(args[2]));
			System.out.println("O valor da soma é: " + soma);
	
		
			}else if (args[0].equals("multiplicar")) {
			multiplicar = (Integer.valueOf(args[1]) * Integer.valueOf(args[2]));
			System.out.println("O valor da multiplicação é: " + multiplicar);
			}
		
		}else {
			System.out.println("O args tem mais de 3 argumentos!");
		}
		
		}
		
	}
	
	
		
	


