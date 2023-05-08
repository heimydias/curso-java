package entities;

public class CurrencyConverter {

	public static double dollarPagar(double dollar, double comprados) {
		return dollar * comprados + (dollar * comprados * 0.06);
	}
	
}
