import java.util.Scanner;

public class TestaIO {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Olá. Bem vindo ao leitor de arquivo. Lendo arquivo.txt...");

		System.out.println("Texto lido:");
		while (scanner.hasNextLine()) {
			System.out.println(scanner.nextLine());
		}
		System.out.println("Tchau tchau.");
		scanner.close();

	}
}
