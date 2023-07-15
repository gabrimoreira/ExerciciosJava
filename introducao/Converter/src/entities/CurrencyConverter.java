package entities;

public  class CurrencyConverter {
	public static final double TAX = 1.06;
	
	public static double totalAmount(double price, double amount) {
		return price * amount * TAX;
	} 
}
