// Also See Costume.java
import java.util.ArrayList;
public class ObjectNotesRunner {
	public ObjectNotesRunner(){
		ArrayList<Costume> costumes = new ArrayList<Costume>();// Initilaizing ArrayLisst


		Costume c1 = new Costume(false,"Pumpkin",29.99);// New Variable Type
		Costume DumbestThingIn15Years = new Costume(true,"Stupid",0.00); // New Variable Type


		System.out.println(c1); // Printing the variable
		System.out.println(DumbestThingIn15Years); // Printing the variable
		System.out.println("Price of Pumkin: " + c1.getPrice()); // Getting the price of the costume

		// Maupilating the Price
		c1.setPrice(101); // Applying the Coupon
		System.out.println(c1.getPrice());// Printing the Dicount Price


		System.out.println("\n\n\n");
		// Arraylist Part
		costumes.add(new Costume(false,"Vinay",10000000.0));// Making the vars
		costumes.add(new Costume(true,"Aryan",10000000.0));// Making the vars
		costumes.add(new Costume(false,"Sameer",10000000.0));// Making the vars
		costumes.add(new Costume(true,"Vignesh",10000000.0));// Making the vars
		costumes.add(new Costume(false,"Tarun",10000000.0));// Making the vars




		System.out.println(costumes);// Printing the Array with custom Variables


		//  Priting neatly
		System.out.println("\n\n\n");
		double total = 0;
		int masks = 0;

		for (Costume c: costumes){
			System.out.println(c.getName());// Priting Names
			total += c.getPrice(); // computing total
			if(c.getMask())
				masks++; // Counting the number of masks
		}
		System.out.println("\n\nTotal cost: $" + total);
		System.out.println(masks + " costumes have masks");




	}

	public static void main(String[] args) {
		ObjectNotesRunner app = new ObjectNotesRunner(); // app

	}
}
