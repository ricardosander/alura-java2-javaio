import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class TestaIO {

	public static void main(String[] args) {

		try {

			InputStream is = new FileInputStream("src/arquivo.txt");
			Scanner scanner = new Scanner(is);
			System.out.println("Olá. Bem vindo ao leitor de arquivo. Lendo arquivo.txt...");

			System.out.println("Texto lido:");
			while (scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
			System.out.println("Tchau tchau.");
			scanner.close();

		} catch (

		FileNotFoundException e1) {
			System.out.println("Arquivo não pode ser encontrado. Verifique.\n" + e1.getMessage());
		}
	}
}
