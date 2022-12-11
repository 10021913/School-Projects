public class ThreeDArray
{
	public ThreeDArray()
	{
		int arr[][][] = new int[646][646][646];
		int l = 0;
		for(int i = 0; i < arr.length;i++)
		{
			System.out.println("Layer " + (i+1));
			for(int j = 0; j < arr[i].length;j++)
			{

				for(int k = 0; k < arr[i][j].length;k++)
				{
					arr[i][j][k] = l;
					l++;
					System.out.print(arr[i][j][k] + " \t");
				}
				System.out.println(" ");
			}
			System.out.println("");
		}
	}

	public static void main(String args[])
	{
		ThreeDArray app = new ThreeDArray();
	}

}