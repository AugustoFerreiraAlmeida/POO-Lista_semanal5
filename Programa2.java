import java.util.Scanner;

public class Programa2 {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		
		System.out.println("DIGITE UMA PALAVRA: ");
		
		String entrada = ler.nextLine();
		
		//TIRA OS ESPAÇOS EM BRANCO DA STRING; -->
		entrada = entrada.replaceAll("\\s+", "");
		
		//FAZ COM QUE TODOS OS CARACTERES FIQUEM EM CAIXA ALTA; -->
		entrada = entrada.toUpperCase();
				
		int contadorVogais = 0;
		
		int contadorConsoantes = 0;
		
		
		for(int i = 0; i < entrada.length(); i++) {
			
			if( entrada.charAt(i) == 'A') {
				contadorVogais += 1;
				
			}
			
			else if(entrada.charAt(i) == 'E') {
				 contadorVogais += 1;
				
			}
			
			else if(entrada.charAt(i) == 'I') {
				 contadorVogais += 1;
				
			}
			
			else if(entrada.charAt(i) == 'O') {
				 contadorVogais += 1;
				
			}
			
			else if(entrada.charAt(i) == 'U') {
				 contadorVogais += 1;
				
			}
			
			else {
				contadorConsoantes += 1;
			}
			
		}
		
		System.out.println("Vogais: "+ contadorVogais);
		
		System.out.println("Consoantes: "+ contadorConsoantes);
		
	}

}
