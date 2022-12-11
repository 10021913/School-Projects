class QUIZCLASSWORK {
	public static void main(String[] args) {
		int z = 0;
		for(int x = 0 ; x<10 ; x+=2){
			for (int y = x; y<10 ; y++){
				System.out.print(y);
			}

			System.out.print(":"+z+" \n");
			z = z+2;
		}
	}
}
