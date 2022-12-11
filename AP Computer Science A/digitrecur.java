class digitrecur {

	//RECURSION PLACE
	public digitrecur(){
		System.out.println("Number of Digits(Regular):\t " + numDigits(2147483647));
		System.out.println("Number of Digits(Recursion):\t " + numDigitsRecursion(2147483647));
		System.out.println("Sum of Digits(Recursion):\t " + sumDigits(111111));

	}


	// non recurring loop, very bad, for number of digits
	public int numDigits(int n){
		int count = 0;
		while(n > 0){
			n /= 10;
			count ++;
		}
		return count;
	}


	// Recursion Loop for number of digits
	public int numDigitsRecursion(int n){
		if (n == 0)
			return 0;
		return 1 + 	numDigitsRecursion(n / 10);
	}

	// sum of digits
	public int sumDigits(int n){
		if(n == 0)
			return 0;
		return n % 10 + sumDigits(n / 10);
	}



	// Main Code
	public static void main(String[] args) {
		digitrecur app = new digitrecur();


	}
}
