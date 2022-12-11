class lanters{

	public lanters() // CONTRUCTOR
	{
		pattern();
		System.out.println("");

		pattern();
		line4();
		line3();
		pattern();
		System.out.println("");

		pattern();
		line4();
		line4();
		line1();
		line1();
	}
	public static void main(String[] args) {
		lanters app = new lanters();

	}
	public void line1()
	{
		System.out.println("    *****");
	}

	public void line2()
	{
		System.out.println("  *********");
	}
	public void line3()
	{
		System.out.println("*************");
	}
	public void line4()
	{
		System.out.println("* | | | | | *");
	}
	public void pattern()
	{
		line1();
		line2();
		line3();
	}
}
