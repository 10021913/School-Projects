public class Food
{
	// Variables
	private String name;
	private int calories;


	// Custom Constructor
	public Food(String n, int c)
	{
		name = n;
		calories = c;
	}


	// Default constructor
	public Food()
	{
		this("Soy Paste", 100);
	}

	// Getter Meth
	public String getName()
	{
		return name;
	}
	public int getCalories()
	{
		return calories;
	}


	// To string
	public String toString()
	{
		return name + ", Calories: " + calories;
	}
}