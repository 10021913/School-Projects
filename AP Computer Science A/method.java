class method {
	public method(){
		int sum = 0;
		double average = 0;
		int[] array = new int[randomnumber(5,10)];


		for(int i = 0; i < array.length; i++){
			array[i] = randomnumber(10,20);
			sum += array[i];

		}


		System.out.println("Sum of Array: " + sum);
		System.out.println("Average of Numbers "+average(array));


	}

	public int randomnumber(int min, int max){
		return (int)(Math.random()*(max-min+1)+min);
	}
	public double average(int[] a){
		double sum = 0.0;
		int length = a.length();
		for(int i = 0; i < length;i++)
			sum += a[i];
		return sum/(double)length;
	}




	public static void main(String[] args) {
		method app = new method();


	}
}
