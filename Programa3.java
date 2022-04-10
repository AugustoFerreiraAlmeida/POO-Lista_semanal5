import java.util.Scanner;

public class Programa3 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("NÚMERO BINÁRIO: ");
		
		String binario = ler.nextLine();
		
		int decimal = Integer.parseInt(binario, 2);
		
		String hexadecimal = Integer.toHexString(decimal);
		
		System.out.println("Base Hexadecimal: "+ hexadecimal);
		
		System.out.println("Base Decimal: " + decimal);
		
	}

}
