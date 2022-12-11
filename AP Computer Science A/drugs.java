public class drugs extends Food
{
	private boolean recreational;

	// Custom Constructor Method
	public drugs(String n,int c,boolean e)
	{
		super(n,c);
		recreational = e;
	}


	// Getter Method
	public boolean isRecreational()
	{
		return recreational;
	}

}