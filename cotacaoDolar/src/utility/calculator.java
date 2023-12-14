package utility;

public class calculator {

	public static final double IOF = 6.0 / 100.0;
	
	public static double dolarPrice;
	public static double dolarBuy;
	
	public static double real() {
		return dolarBuy * dolarPrice + dolarBuy * dolarPrice * IOF;
	}
	
	
}
