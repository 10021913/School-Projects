class ArrayReview {
	public static void main(String[] args) {
		// Task 1
		System.out.println("Task 1\n");
		System.out.println("Random Numbers: ");
		int[] list = new int [40];
		for (int i = 0; i < list.length; i++){
			list[i] = (int)(Math.random()*100)+1;
			System.out.print(list[i] + "\t ");
			if ((i-1)%2==0)
				System.out.println("");
		}
			// Sum
		int sum = 0;
		for (int i = 0; i < list.length; i++){
			sum = sum + list[i];

		}
		System.out.println("\nSum: " + sum);

			// min and max
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < list.length; i++){
			if(list[i]<min)
				min = list[i];
			if(list[i]>max)
				max = list[i];

		}
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);

			// reverse array
			System.out.println("\nReverse Array: ");
		int[] reverse_list = new int[40];
		for (int i = 0; i < list.length; i++){

			reverse_list[i] = list[39-i];
			System.out.print(reverse_list[i] + "\t ");
			if ((i-1)%2==0)
				System.out.println("");
		}



		System.out.println("\n\n\nTask 2\n\n\n");
		// Task 2
		int miniumum = Integer.MAX_VALUE;
		int maxiumim = Integer.MIN_VALUE;
		System.out.println("\n\n2D Array: ");
		int[] colomnsum = new int[10];
		int[] rowsum = new int[10];
		int[][] square = new int[10][10];
		int[] rowmax = new int[10];
		int[] rowmin = new int[10];
		int[] colmax = new int[10];
		int[] colmin = new int[10];
		for (int i = 0; i < square.length; i++){
			rowmax[i] = Integer.MIN_VALUE;
			colmax[i] = Integer.MIN_VALUE;

			rowmin[i] = Integer.MAX_VALUE;
			colmin[i] = Integer.MAX_VALUE;
			}
		for (int i = 0; i < square.length; i++){
			for (int j = 0; j < square[3].length; j++){
				square[i][j] = (int)(Math.random()*41)+10;
				System.out.print(square[i][j] + " ");
				colomnsum[i] = colomnsum[i] + square[i][j];
				rowsum[j] = rowsum[i] + square[j][i];
				if(square[i][j]< miniumum)
					miniumum = square[i][j];
				if(square[i][j]> maxiumim)
					maxiumim = square[i][j];

				// col max
				if(square[i][j] > colmax[i])
					colmax[i] = square[i][j];
				// col min
				if(square[i][j] < colmin[i])
					colmin[i] = square[i][j];

				// row min
				if(square[j][i]< rowmin[j])
					rowmin[i] = square[i][j];
				// row max
				if(square[j][i]> rowmax[j])
					rowmax[i] = square[i][j];


			}
			System.out.println("");
		}
		System.out.println("\nColomn Sums: \n");
		for (int i = 0; i < square.length; i++)
			System.out.println("Colomn "+ (i+1) + ": " + colomnsum[i]);
		System.out.println("\n");
		for (int i = 0; i < square.length; i++)
			System.out.println("Row "+ (i+1) + ": " + rowsum[i]);
		System.out.println("\nMiniumum: " + miniumum);
		System.out.println("Maxiumum: " + maxiumim);

		System.out.println("");
		for(int i = 0; i < square.length; i++)
			System.out.println("Col "+ (i+1) + " max" + ": " + colmax[i]);

		System.out.println("");
		for(int i = 0; i < square.length; i++)
			System.out.println("Col "+ (i+1) + " min" + ": " + colmin[i]);


		System.out.println("");
		for(int i = 0; i < square.length; i++)
			System.out.println("Row "+ (i+1) + " max" + ": " + rowmax[i]);

		System.out.println("");
		for(int i = 0; i < square.length; i++)
			System.out.println("Row "+ (i+1) + " min" + ": " + rowmin[i]);



		System.out.println("\n\n\nTask 3\n\n\n");
		// Task 3
		int[][] array3 = new int[5][5];
		for(int i = 0; i < array3.length; i++){
			for(int j = 0; j < array3.length; j++){
				array3[i][j] = i + j;
				System.out.print(array3[i][j]+" ");
			}
			System.out.println("");
		}
		int temp = 0;
		for(int i = 0; i < array3.length; i++){
			for(int j = 0; j < array3.length; j++){
				temp = array3[(int)(Math.random()*5)+0][(int)(Math.random()*5)+0];
				array3[(int)(Math.random()*5)+0][(int)(Math.random()*5)+0] = temp;
			}
		}
		System.out.println("\nRandom Array: ");
		for(int i = 0; i < array3.length; i++){
			for(int j = 0; j < array3.length; j++)
				System.out.print(array3[i][j]+ " ");
			System.out.println("");
		}



		System.out.println("\n\n\nTask 4\n\n\n");
		// Task 4
		int[] array4 = new int[15];
		for(int i = 0; i <array4.length; i++){
			array4[i] = i+1;
			System.out.print(array4[i] + " ");
		}





























	}
}