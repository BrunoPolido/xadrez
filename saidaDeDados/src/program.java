import java.util.Locale;

public class program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		double renda = 2.450;
		String nome = "Maria";
		int idade = 31;
		
		System.out.printf("%.2f %n",renda);
		System.out.printf("%.4f %n", renda);
		System.out.printf("%s tem %d anos e a Renda dela e de R$%.3f reais" , nome, idade, renda);
	}
}
