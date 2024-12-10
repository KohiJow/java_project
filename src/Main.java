import java.util.Locale; //Importa a biblioteca de localidade
 
public class Main {
 
	public static void main(String[] args) {
		//Variaveis
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		//print das variaveis
		System.out.printf("%s Tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		// %d imprime numeros inteiros
		// %f imprime ponto flutuante ou float do python
		// %s imprime textos
		// %n quebra a linha
		
		Locale.setDefault(Locale.US); //Chama a localidade
	}
 
}