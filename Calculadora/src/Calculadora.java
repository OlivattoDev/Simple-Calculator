import java.util.Locale;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o primeiro número: ");
		double num1 = sc.nextDouble();
		System.out.print("Digite o segundo número: ");
		double num2 = sc.nextDouble();
		System.out.print("Digite a operação a ser realizada (+, -, *, /): ");
		char operator = sc.next().charAt(0);
		double result;
		
		switch(operator) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		default:
			System.out.println("Operação Inválida");
			return;
		}
		System.out.printf("\nResultado: " + num1 + " " + operator + " " + num2 + " = " + "%.2f", result);
		
		sc.close();
	}
}
