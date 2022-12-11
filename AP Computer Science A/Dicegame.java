class Dicegame {
	public static void main(String[] args) {
		double player2_points = 0;
		double player1_points = 0;
		double roundnumber = 0;
		while ((player1_points < 21)&&(player2_points < 21)){
			 ;

			System.out.println("\n\nRound " + roundnumber);

			// Setup
			int Dice1_Player1 =(int)(Math.random()*6)+1;
			int Dice2_Player1 =(int)(Math.random()*6)+1;


			int Dice1_Player2 =(int)(Math.random()*6)+1;
			int Dice2_Player2 =(int)(Math.random()*6)+1;


			int player1_sum = Dice1_Player1 + Dice2_Player1;
			int player2_sum = Dice1_Player2 + Dice2_Player2;

			// Awarding Points
				// Bullet 1
			if((Dice1_Player1 > Dice1_Player2)&&(Dice2_Player1>Dice2_Player2)){
				player1_points = player1_points + 3;
			}
			if((Dice1_Player1 < Dice1_Player2)&&(Dice2_Player1 < Dice2_Player2)){
						player2_points = player2_points + 3;
			}
				// Bullet 2
			if(Dice1_Player1 > player2_sum){
				player1_points = player1_points + 6;
			}

			if(Dice1_Player2 > player1_sum){
						player2_points = player2_points + 6;
			}
				// Bullet 3
			if((Dice2_Player1 > Dice1_Player2)&& (Dice2_Player1 > Dice2_Player2 )){
						player1_points = player1_points + 1;
			}
			if((Dice2_Player2 > Dice1_Player1)&& (Dice2_Player2 > Dice2_Player1 )){
						player2_points = player2_points + 1;
			}

			// Output
				//Dice Rolls
			//System.out.print("Player 1 Dice 1: " +Dice1_Player1 + " ");
			//System.out.print("Player 1 Dice 2: " +Dice2_Player1 + " \n");

			//System.out.print("Player 2 Dice 1: " +Dice1_Player2 + " ");
			//System.out.print("Player 2 Dice 2: " +Dice2_Player2 + " \n");


			System.out.print("Player 1 Points: " + player1_points + " ");
			System.out.print("Player 2 Points: " + player2_points + " \n");
		}
		if (player1_points> player2_points){

			System.out.println("PLAYER 1 WINS");
		}
		if (player1_points< player2_points){

					System.out.println("PLayer 2 Wins");
		}


	}
}
