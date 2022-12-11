class ArrayFillerPrograms {
	public static void main(String[] args) {
		// Part A
		int count = 0;
		int othercount = 0;
		System.out.println("Part A");
		int x[][] = new int[2][2];
		for(int i = 0 ;i < x.length;i++){
			for(int j = 0; j < x.length; j++){
				x[i][j] = (int)(Math.random() *2)+1;
				System.out.println(x[i][j]);
				}
			if(x[i][j] == 1)
					count++;
				if(x[i][j] == 2)
					othercount++;
				if ((othercount > 2)||(count > 2)){
					i = 0;
					j = 0;
					count = 0;
					othercount = 0;
			}
		}
		for (int c = 0; c < x.length; c++){
			for (int k = 0; k< x.length; k++){
				System.out.print(x[c][k] + " ");
			}
		}
		// Part B
		System.out.println("\n\n\nPart B");
		int y[][] = new int[4][4];
		for(int i = 0 ;i < y.length;i++){
			for(int j = 0; j < y.length; j++){
				if (i%2==0)
					y[i][j] = 1;
				if (i%2==1)
					y[i][j] = 2;

				System.out.print(y[i][j] + " ");
			}

			System.out.println("");
		}

	}
}
