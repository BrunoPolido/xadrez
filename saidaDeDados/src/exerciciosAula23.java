import java.util.Locale;

public class exerciciosAula23 {
	public static void main(String[] args) {
		
		
		String product1 = "NotBook";
		String product2 = "Computador";
		
		int age = 30;
		int code = 50030;
		char gender = 'F';
		
		double price1 = 2.540;
		double price2 = 3.238;
		double measure = 53.20574;
		
		System.out.println("Produtos");
		
		System.out.printf("%s, tem o preco de $%.3f dolar%n", product1, price1);
		System.out.printf("%s, tem o preco de $%.3f dolar%n", product2, price2);
		System.out.printf("Record: %d anos old, code %d and gender: %c %n", age, code, gender);
		System.out.printf("Medidas todas as casas decimais: %.8f%n", measure);
		System.out.printf("Medidas com 3 casas decimal %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f", measure);
		
 		
		
		
		
		
	}
}
