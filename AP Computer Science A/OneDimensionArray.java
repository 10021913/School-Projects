class OneDimensionArray {
	public static void main(String[] args) {
		System.out.println("\nNormal Array");
		int z[] = new int[20];
		for(int l = 0; l < z.length; l++){
			z[l] =  (int)(Math.random() *50)+1;
			System.out.print(z[l] + " ");
		}
		System.out.println("");
		int temp;
		for(int l = 0; l < z.length/2; l++){
			temp = z[l];
			z[l] = z[19-l];
			z[19-l] = temp;

		}

		System.out.println("\nReverse Array: ");
		for(int l = 0; l < z.length; l++)
			System.out.print(z[l] + " ");


		System.out.println("");
		System.out.println("\nEven Indexed Positions With Number 5: ");
		for(int l = 0; l < z.length; l++){
			if (l%2 ==0){
				z[l] = 5;
			}
		}
		for(int l = 0; l < z.length; l++)
			System.out.print(z[l] + " ");

	}
}
