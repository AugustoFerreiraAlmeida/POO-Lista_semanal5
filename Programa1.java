import java.util.Scanner;

public class Programa1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("DIGITE UMA SEQUÊNCIA DE NÚMEROS SEPARADOS POR VÍRGULA: ");
		
		String numeros = ler.nextLine();
		
		String[] numero = numeros.split(",");
		
		int[] numbers = new int[numero.length];
		
		for(int i = 0; i < numero.length; i++ ){
			
			numbers[i] = Integer.parseInt(numero[i]);

		}
		
		int maior = numbers[0];
		
		int menor = numbers[0];
		
		for(int numerosPassados: numbers){
			
			maior = Math.max(maior, numerosPassados);
			
			menor = Math.min(menor, numerosPassados);
			
		}
	
		System.out.println("O maior número lido foi: "+ maior);
		
		System.out.println("O menor número lido foi: "+ menor);
	
	}
}
		