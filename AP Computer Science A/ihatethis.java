class ihatethis {
	public static void main(String[] args) {
		int[][] array = new int[1000000][10000000];
		int number = 0;
		double sum = 0;
		System.out.println("Array: ");
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array[i].length; j++){
				number = number + 5;
				array[i][j] = number;
				System.out.print(array[i][j] + " ");
				sum = sum +array[i][j];
			}
			System.out.println("");
		}
		double Average = sum/8.0;
		System.out.println("\nAverage: " + Average);
	}
}
