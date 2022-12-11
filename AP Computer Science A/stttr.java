public class stttr
{
	public static void main(String[] args)
	{

		System.out.println(countTheAs("bannana"));

	}
	public int countTheAs(String str)
	{
		int count = 0;
		for (int i = 0; i < str.length();i++)
		{
			if(str.charAt(i) == 'a')
				count ++;
			return count;
		}
	}
	public String






}