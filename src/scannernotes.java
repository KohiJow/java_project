import java.util.Scanner;
public class scannernotes {
 
	public static void main(String[] args) {
		/* ------------------------Scannner------------------------
		 * Para fazer entrada de dados, nós vamos criar um objeto do tipo
		 * "Scanner" da seguinte forma:
		 *
		 * # Scanner sc = new Scanner(System.in);
		 * ##Import java.util.Scanner
		 * ###faca sc.close() quando nao precisar mais do objeto sc ele desaloca a funcao
		 */
		
		
		//Como ler uma palavra?
		
		/*
		Scanner sc = new Scanner(System.in);
		
		String x;
		x = sc.next();
		System.out.println("Voce digitou: " + x);
		
		sc.close();
		*/
		
		
		//Como ler um número inteiro?
		/*
		Scanner sc = new Scanner(System.in);
		
		int x;
		x = sc.nextInt();
		System.out.println("Voce digitou: " + x);
		
		sc.close();
 
		*/
		
		
		//Como ler um número double?
		/*
		Scanner sc = new Scanner(System.in);
		
		double x;
		x = sc.nextDouble();
		System.out.println("Voce digitou: " + x);
		
		sc.close();
		*/
		
		
		//Como pegar apenas a primeira letra?
		/*
		Scanner sc = new Scanner(System.in);
		
		char x;
		x = sc.next().charAt(0);
		System.out.println("Voce digitou: " + x);
		
		sc.close();
		*/
		
		Scanner sc = new Scanner(System.in);
		
		String x;
		int y;
		double z;
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		System.out.println("Dados digitados:");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		sc.close();
	}
 
}