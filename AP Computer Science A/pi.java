class pi {
	// Recursion Place
	public pi(){
		int x = 0;
		System.out.println(4*(1-computePI(3.0,-1)));
		System.out.println(rand(100,1));

	}

	// Finding pi
	public double computePI(double n,int b){
		if (n>10000)
			return 0;
		b *= -1;
		// Recursion
		return ((1.0/(n*b)) + computePI(n+2,b));
	}


	// Filling an array 10-20 values that are 1-100
	public int rand(int a,int b){
		int[] array = new int[(int)((Math.random() * 11) + 10)];
		for (int i = 0; i < array.length; i++){
			array[i] = (int)((Math.random() * a) + b);
			System.out.println(array[i]);
		}
		return 0;
	}





	// Main Code
	public static void main(String[] args) {
		pi app = new pi();


	}
}
