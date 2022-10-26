package tentativa;

import java.util.Scanner;

public class Calculadora {
	Scanner scan = new Scanner(System.in);
	
	public void init() {
		
		System.out.println("Informe o calculo desejado: ");
		
		String txt = scan.nextLine();
		String operacao[] = new String[3];
		
		operacao = txt.split(" ");
		float valor1 = Float.parseFloat(operacao[0]);
		float valor2 = Float.parseFloat(operacao[2]);
		
		switch(operacao[1]) {
		case "+":
			System.out.println("O resultado é "+ this.adicao(valor1, valor2));
			break;
		case "-":
			System.out.println("O resultado é "+ this.subtracao(valor1, valor2));
			break;
		case "*":
			System.out.println("O resultado é "+ this.multiplicacao(valor1, valor2));
			break;
		case "/":
			System.out.println("O resultado é "+ this.divisao(valor1, valor2));
			break;
		}
	}
	
	public float adicao(float v1, float v2) {
		return v1 + v2;
	}
	
	public float subtracao(float v1, float v2) {
		return v1 - v2;
	}
	
	public float multiplicacao(float v1, float v2) {
		return v1 * v2;
	}
	
	public float divisao(float v1, float v2) {
		return v1 / v2;
	}
	
}
