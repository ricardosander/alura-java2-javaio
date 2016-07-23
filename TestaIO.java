import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestaIO {

	public static void main(String[] args) {
		
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		System.out.println("Olá. Bem vindo ao leitor!!!");
		try {
			
			String texto;
			do {
				
				System.out.println("Digite algo para ser lido. Digite \"sair\" para sair.");
				texto = br.readLine();
				
				if (texto != null && !texto.equals("sair")) {
					System.out.println("Texto lido: " + texto);
				}
			} while (texto != null && !texto.equals("sair"));
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
	}
}
