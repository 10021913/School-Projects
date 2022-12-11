import java.util.Scanner;

public class Wordle
{
        public Wordle()
        {
			String wordle = "TEASE";
			int guessct = 0;
			boolean won = false;
			while(!won)
			{
					won = makeGuess(wordle);
					guessct++;
			}

			System.out.println(guessct +  " Guesses used");
        }
        public boolean makeGuess(String wordle)
        {
			Scanner reader = new Scanner(System.in);
			System.out.print("\nEnter Guess: ");
			String guess = reader.nextLine();

			if(guess.length() != 5)
			{
					System.out.println("WordIndexOutOfBoundsException");
					return false;
			}
			if(guess.equals(wordle))
			{
					System.out.println("THE WORD WAS: " + wordle);
					return true;
			}
			else
			{
					checkguess(guess, wordle);
					return false;
			}
        }
        public void checkguess(String guess, String word)
        {
			System.out.println();
			boolean drugs;
			for(int i = 0; i < 5; i++)
			{
				if(guess.charAt(i) == word.charAt(i))
				{
						System.out.print(word.charAt(i) + " ");
				}
				else
				{
					drugs = false;
					for(int j = 0; j < 5; j++)
					{
						if(guess.charAt(i) == word.charAt(j))
						{
								if(guess.charAt(0) == guess.charAt(2)){
									System.out.print("_ ");
								}
								else{
									System.out.print(Character.toLowerCase(word.charAt(j))+ " ");
								}
								drugs = true;
						}
					}
					if(drugs == false)
					{
							System.out.print("_ ");
					}
				}
			}
        }
        public static void main(String[] args)
        {
                Wordle app = new Wordle();
        }
}