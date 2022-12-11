import java.util.Scanner;
class battleship {
  public static void main(String[] args) {
    // Setup
    
    Scanner reader = new Scanner(System.in);
    String [][] board = new String[8][8];
    String [][] board_output = new String[8][8];
    int x = 0;
    Boolean repeat = true;
    int guess_x = 0;
    int guess_y = 0;

    // Setting up the board
    for(int i = 0; i<8; i++){
      for(int j = 0; j<8; j++){
        board[i][j] = " ~ ";
        board_output[i][j] = " ~ ";
      }
    }

    // adding the boat
    int boat_y = (int)(Math.random() * (7 - 0 + 1) + 0);
    int boat_x = (int)(Math.random() * (7 - 0 + 1) + 0);
    board[boat_y][boat_x] = " B ";



    // Main loop
    while(x == 0){
      // Printting board
      System.out.println("+-------------------------------+");
      for(int i = 0; i<8; i++){
        System.out.print("|");
        for(int j = 0; j<8; j++){
          System.out.print(board_output[i][j] + "|");
        }
        if(i<7)
          System.out.print("\n---------------------------------\n");
      }
      System.out.print("\n+-------------------------------+\n");


      // Guessing
      while(repeat == true){

        System.out.print("Enter x-coordinate: ");
        guess_y = reader.nextInt();
        System.out.print("Enter y-coordinate: ");
        guess_x = reader.nextInt();
        guess_x--;
        guess_y--;

        if((guess_y>7)||(guess_y<0)||(guess_x>7)||(guess_x<0)){
          System.out.println("Number Greater Than 8 or Less Than 0. Please Enter Within Given Range");


        }
        else{
          repeat = false;
        }
      }
      repeat = true;

      for (int clear = 0; clear<30; clear++) {
				System.out.print(String.format("\033[%dA", 1));
				System.out.print("\033[2K");
			}




      // Determining if it was a hit and weather you won
      if(board[guess_y][guess_x] == " X "){
        System.out.println("You Have Already Guessed That");
      }
      if(board[guess_y][guess_x] == " ~ "){
        System.out.println("Miss");
        board_output[guess_y][guess_x] = " X ";
      }

      if(board[guess_y][guess_x] == " B "){
        System.out.println("YOU WON");
        System.out.println("+-------------------------------+");
        for(int i = 0; i<8; i++){
          System.out.print("|");
          for(int j = 0; j<8; j++){
            System.out.print(board[i][j] + "|");
          }
          if(i<7)
            System.out.print("\n---------------------------------\n");
        }
        System.out.print("\n+-------------------------------+\n");
        System.exit(0);
      }
    }
  }
}
