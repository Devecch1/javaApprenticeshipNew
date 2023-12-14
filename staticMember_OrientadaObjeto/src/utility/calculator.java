package utility;

public class calculator {

	public static final double PI = 3.14; // O FINAL É O O VALOR CONSTANTE, UMA VEZ ATRIBUIDO NAO MUDA // E O PI É A CONSTANTE
	
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
}
