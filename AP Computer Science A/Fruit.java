public class Fruit extends Food
{
	// Variables
	private boolean edibleSeeds;


	public Fruit(String n, int c, boolean e)
	{
		// Super Constructor
		super(n,c);
		edibleSeeds = e;
	}

	// Getter Method
	public boolean hasEdibleSeeds()
	{
		return edibleSeeds;
	}



}