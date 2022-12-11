class prime {
	// Recursion Place
	public prime(){
		System.out.println(recur(2,1,1,1));

	}

	public int recur(int n,int a,int b,int c){
		if(n == 0)
			return c;
		int temp = c;

		 c = a + b + c;
		 a = b;
		 b = temp;

		n -= 1;
		return recur( n, a,b, c);
	}


	// Main Code
	public static void main(String[] args) {
		prime app = new prime();

	}
}
