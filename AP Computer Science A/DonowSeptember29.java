class DonowSeptember29 {
	public static void main(String[] args) {
		// VARS
		int[][] b = new int [3][4];
		int a[] = new int[10];
		double sum = 0;
		double average = 0;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		// RANDOM NUMBER GENRATION
		System.out.println("Random Number Generation: ");
		for (int i = 0; i < a.length;i++){
			a[i] = (int)(Math.random()*21)+5;
			System.out.print(a[i] + " ");
		}
		System.out.println();

		// SUM
		for (int i = 0; i < a.length;i++)
			sum = sum + a[i];
		System.out.println("\nSum: " + sum);

		// Average
		average = sum/((double)a.length);
		System.out.println("\nAverage: " + average);



		// 2D array
		System.out.println("\n\n\n2D ARRAY");
		for (int i = 0; i < b.length;i++){
			for (int j = 0; j < b.length;j++){
				b[i][j] = (int)(Math.random()*64)+7;
				System.out.print(b[i][j]+ "\t ");

				// Fininding A Min
				if(b[i][j] < min)
					min = b[i][j];

			}
			System.out.println("");

		}
		System.out.println("\nMin: " + min);
	}
}
