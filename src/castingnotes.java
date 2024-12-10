public class castingnotes {
 
	public static void main(String[] args) {
	///Exemplo 1# De uma saída onde o programa imprime números inteíros
		/*
		int x, y;
		
		x = 5;
		
		y = 2 * x;
		
		System.out.println(x);
		System.out.println(y);
		*/
		
		//Exemplo 2# De uma saída onde o programa imprime número double
		/*
		int x;
		double y;
		x = 5;
		
		y = 2 * x;
		
		System.out.println(x);
		System.out.println(y);
		*/
		
		//Exemplo 3# Cálcull de área e Boa Prática
		/*
		B1 - Sempre indique o tipo do número, se a expressao for de ponto flutuante (nao inteira).
		Para double use: .0
		Para float use: f
		
		double b, B, h, area;
		
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		area = (b + B) / 2.0 * h;
		
		System.out.println(area);
		*/
		
		//Exemplo 4# Divisao arredonada? Por que?
		/* Quando vc tenta fazer uma divisao com numeros inteiros no java ele entende que o resultado tambem tem que ser
		  inteiro, por isso ele resulta 2.0
		
		
		int a, b;
		double resultado;
		
		a = 5;
		b = 2;
		
		resultado = a / b;
		
		System.out.println(resultado);
		
		*/
		
		//Exemplo 5# Convertendo Double pra int
		/*
		double a;
		int b;
		
		a = 5.0;
		b = (int) a;  para o computador entender que nao importam as casas após a virgula voce precisa especificar que é int com o parenteses.
		
		System.out.println(b);
		
		*/
	}
 
}