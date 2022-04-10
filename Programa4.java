import java.util.Scanner;

public class Programa4 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("DIGITE SEU NOME: ");
		
		String nome = ler.nextLine();
		
		for (int i = 0; i < nome.length(); i++) {
			
			for(int j = 0; j <= i; j++ ) {
				
				System.out.print(nome.charAt(j));
				
			}
			
			System.out.println();
			
		}
		
	}

}