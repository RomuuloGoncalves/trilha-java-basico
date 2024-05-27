import java.util.Locale;
import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.useLocale(Locale.US).nextInt();

		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.useLocale(Locale.US).nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException error) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
			System.out.println(error);
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção

		if(parametroUm > parametroDois){
			throw new ParametrosInvalidosException("Parâmetro inválido: o primeiro parâmetro é maior que o segundo.");
		}
		
		int contagem = parametroDois - parametroUm;
		for(int contador = 0; contador < contagem; contador++){
			System.out.println(contador);
		}
	}
}

class ParametrosInvalidosException extends Exception {
	public ParametrosInvalidosException(String message) {
		super(message);
	}
}