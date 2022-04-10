import java.util.Scanner;

public class Programa5 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		String[] nomes = new String[10];

		System.out.println("Digite um nome: ");
		
		String nomeDeInicio = ler.nextLine();
		
		nomes[0] = nomeDeInicio;
		
		for(int i = 1; i < 10;) {
			
			boolean teste = true;
			
			System.out.println("Digite outro nome: ");
			
			String nome = ler.nextLine();
			
			for(int j = 0; j <= i; j++ ) {
			
				if (nome.equals(nomes[j])) {
				
					System.out.println("Esse nome já existe. ");
				
					j = i + 1;
					teste = false;
					
					
				}
				
			}
			
			if(teste == true){

				nomes[i] = nome;
					i++;
					
			}
			
		}	
		
		String nome1 = nomes[(int) (Math.random() * 10)];
		
		String nome2 = nomes[(int) (Math.random() * 10)];
		
		int ordem = nome1.compareTo(nome2);
		
		if(ordem == 1) {
			System.out.println(nome2);
			
			System.out.println(nome1);
			
			
		}
		
		else {
			
			System.out.println(nome1);
			
			System.out.println(nome2);
			
		}
		
	}

}
