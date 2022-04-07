import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		String testo;
		String input;
		do {
		System.out.println("Inserisci il testo da analizzare: ");
		 Conta(parola(testo = new Scanner(System.in).nextLine()));
		 System.out.println("Vuoi analizzare un altra parola? (SI) (NO)");
		 input = new Scanner(System.in).nextLine();
		 }
		while(input.equalsIgnoreCase("si"));
		System.out.println("Programma terminato");
		System.exit(0);
	}

	 

	public static void Conta(char[] array) {
		int conteggio = 0;
		int x = 0;
		 do{
			for (int i = 0; i < array.length; i++) {
				if (array[x] == array[i] ) {
					conteggio++;
					System.out.println("La lettera " + array[i] + " si ripete " + conteggio + " volte");
				}
			} x++; conteggio = 0;
		} 
		while (x <= array.length - 1); 
	}
	
	public static char[] parola(String testo) {
		char[] lettere = testo.toCharArray();
		return lettere;
	}
}
