class DoNowSeptember27 {
	public static void main(String[] args) {



		// Part A
		int x[][] = new int[2][2];
		for(int i = 0 ;i < x.length;i++){
			for(int j = 0; j < x.length; j++){
				x[i][j] = i+1;
				System.out.println(x[i][j]);
			}
		}
		// Part B
		int y[][] = new int[4][4];
		for(int i = 0 ;i < y.length;i++){
			for(int j = 0; j < y.length; j++){
				y[i][j] = i+1;
				System.out.println(y[i][j]);
			}
		}

	}
}
