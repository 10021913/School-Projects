class Hailstone {
	// Recursion Place
	public Hailstone(){
		System.out.println(factorial(77031));


	}

	public int factorial (int n){
		System.out.println(n);
		if (n == 1){
			return 1;
		}

		if (n % 2 == 0)
			return factorial(n/2);
		if ((n % 2 == 1))
			return factorial((n*3)+1);

		return 1 ;
	}
	// Main Code
	public static void main(String[] args) {
		Hailstone app = new Hailstone();
	}
}
