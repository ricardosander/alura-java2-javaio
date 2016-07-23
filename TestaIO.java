import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestaIO {

	public static void main(String[] args) {

		try {

			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("src/arquivo.txt")));
			System.out.println("Olá. Bem vindo ao leitor de arquivo. Lendo arquivo.txt...");
			try {

				StringBuilder textoBuilder = new StringBuilder();
				String texto;
				while ((texto = br.readLine()) != null) {
					textoBuilder.append(texto);
					textoBuilder.append("\n");
				}
				System.out.println("Texto lido:");
				System.out.println(textoBuilder.toString());
			} catch (IOException e) {
				System.out.println("Houve um erro ao realizar a leitura.\n" + e.getMessage());
			} finally {

				System.out.println("Tchau tchau.");
				try {
					br.close();
				} catch (IOException e) {
					System.out.println("Houve um erro ao fechar o leitor.\n" + e.getMessage());
				}
			}
		} catch (FileNotFoundException e1) {
			System.out.println("Arquivo não pode ser encontrado. Verifique.\n" + e1.getMessage());
		}
	}
}
