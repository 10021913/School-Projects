class DiceProgram {
	public static void main(String[] args) {
		int Dice1 =(int)(Math.random()*6)+1;
		int Dice2 =(int)(Math.random()*6)+1;


		System.out.println("Dice 1: " + Dice1);
		System.out.println("Dice 2: " + Dice2);


		System.out.println("\nSum: " + (Dice1 + Dice2));
		System.out.println("Product: " + (Dice1 * Dice2));
		System.out.println("Difference: " + (Dice1 - Dice2)+"\n");
	}

}
