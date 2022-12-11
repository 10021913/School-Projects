class spinners {

	// Spinners
	public spinners()
	{
		System.out.println("Welcom to Spinners!");
		int sl = spin(2);
		System.out.println("The First spin is " + sl);
		if(isEven(sl))
		{
			int s2 = spin();
			int s3 = spin();
			int s4 = spin(4);
		}


	}

	// Spin Maker
	public int spin()
	{
		return (int)(Math.random()*5) + 1;
	}

	// Otha Spin Maker
	public int spin(int n)
	{
			return (int)(Math.random()*n) + 1;
	}

	// Product Maker
	public int prod(int a,int b)
	{
		return a*b;
	}

	// Even Or Odd Evaluature
	public boolean isEven(int a)
	{
		return a % 2 == 0;
	}

	// Lowest Number Finder
	public int lowest(int a, int b)
	{
		if (a < b)
			return a;
		else
			return b;
	}

	// Anotha Lowest Number Finder
	public int lowest(int a, int b, int c )
	{
		return lowest(a,lowest(b,c));
	}

	public boolean isGreater(int a,int b)
	{
		return false;

	}



	// Main Code Execution
	public static void main(String[] args) {
		spinners app = new spinners();
	}
}
