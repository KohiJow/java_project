import java.util.Locale;
 //commit
public class EX01 {
 
	public static void main(String[] args) {
		String product1 = "Computer";
		String product2 = "Office Desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products:");
		System.out.printf("%s which price is %.1f %n%s which price is %.2f %n%nRecord: %d years old, code %d and gender %s %n",product1, price1, product2, price2, age, code, gender);
		System.out.printf("Measue with decimal places: %f %nRouded (three decimal places): %.3f %nUS decimal point: %.3f", measure, measure, measure);
		
		
		Locale.setDefault(Locale.US);
	}
 
}