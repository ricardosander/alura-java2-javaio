import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class TestaIO {

	public static void main(String[] args) {

		try {
			
			OutputStream os = new FileOutputStream("saida.txt");
			OutputStreamWriter osw = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(osw);

			Scanner scanner = new Scanner(System.in);
			System.out.println("Olá. Bem vindo ao escritor de arquivos.");

			String texto = "";
			loop: while (!texto.equals("sair")) {

				System.out.println("Digite o texto para escrever. Digite \"sair\" para termonar.");
				texto = scanner.nextLine();
				if (texto.equals("sair")) {
					break loop;
				}
				bw.write(texto);
				bw.newLine();
			}
			scanner.close();
			bw.close();
			System.out.println("Sim da escrita.");
		} catch (IOException e) {

			System.out.println("Houve um erro: " + e.getMessage());
			System.exit(0);
		}
	}
}
