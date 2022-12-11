// Also See ObjectsNotesRunner.java
public class Costume {

	private boolean mask; // Private means that it can only be modified here
	private String name;
	private double price;

	// Constructur
	public Costume(boolean m, String n, double p){
		mask = m;
		name = n;
		price = p;



	}
	public String toString(){
		if (mask)
			return "Costume: '" + name + "'has a mask and costs $" + price;
		else
			return "Costume: '" + name + "' doesn't have a mask and costs $" + price;
	}

	// Mutators or setters change the value of the variable
	public void setPrice(int percentOff){
		price = price - price*(percentOff/100.0);
	}// Void methods are for printing and saving, all setter methods are void methods




	// return onle aspect of the varibale
	public double getPrice(){
		return price;
	}
	public String getName(){
		return name;
	}
	public boolean getMask(){
		return mask;
	}



}

