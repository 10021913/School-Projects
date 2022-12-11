


import java.util.Scanner;
class Hangman {
  public static void main(String[] args) {

    // Setup
    int count = 1;
    String word_form_of_array = "";
    int another_number = 0;
    char[] keeping_track_of_guess = new char[70];
    int number;
    int another_int = 0;
    int stage = 0;
    Scanner reader = new Scanner(System.in);
    String[] Ascii = {"\n+---+\n  |   |\n  O   |\n /|\\  |\n / \\  |\n      |\n=========\n","\n  +---+\n  |   |\n  O   |\n /|\\  |\n /    |\n      |\n=========\n","\n  +---+\n  |   |\n  O   |\n /|\\  |\n      |\n      |\n=========\n","\n  +---+\n  |   |\n  O   |\n /|   |\n      |\n      |\n=========\n","\n  +---+\n  |   |\n  O   |\n  |   |\n      |\n      |\n=========\n","\n  +---+\n  |   |\n  O   |\n      |\n      |\n      |\n=========\n","\n  +---+\n  |   |\n      |\n      |\n      |\n      |\n=========\n"};
    String[] word_bank = {"ant","baboon","badger","bat","bear","beaver","camel","cat","clam","cobra","cougar","coyote","crow","deer","dog","donkey","duck","eagle","ferret","fox","frog","goat","goose","hawk","lion","lizard","llama","mole","monkey","moose","mouse","mule","new","otter","owl","panda","parrot","pigeon","python","rabbit","ram","rat","raven","rhino","salmon","seal","shark","sheep","skunk","sloth","snake","spider","stork","swan","tiger","toad","trout","turkey","turtle","weasel","whale","wolf","wombat","zebra"};
    String chosen_word = word_bank[((int)(Math.random() * (word_bank.length  - 1)))];
    chosen_word = "hello";
    char[] chosen_array = new char[chosen_word.length()];
    char[] chosen_array_parallel = new char[chosen_word.length()];
    for (int k = 0;k<chosen_word.length();k++){
      chosen_array[k] = chosen_word.charAt(k);
      chosen_array_parallel[k] = '-';
    }
    System.out.println("HANGMAN\n");

    // Main code
    for(int loop = 0;loop<word_bank.length;loop++){
      System.out.print(String.format("\033[%dA",11));
      System.out.print("\033[2K");


      for(int n = 0;n<6;n++)
      System.out.print(keeping_track_of_guess[n] + ", ");
      System.out.println("\n")

      System.out.println(Ascii[stage]);
      for (int k = 0;k<chosen_word.length();k++)
        System.out.print(chosen_array_parallel[k]);
      System.out.print("\nLives: " + (8-stage-2));
      System.out.print("Your Guesses: \n\n\n");
      System.out.println("\n")
      System.out.println("\nEnter Your Guess: ");
      char Guess = reader.next().charAt(0);
      keeping_track_of_guess[another_number] = Guess;
      another_number++;
      Guess = Character.toLowerCase(Guess);




      int index = chosen_word.indexOf(Guess);
      if((index > -1)&&(stage<6)){
           chosen_array_parallel[index] = Guess;

      }

      if(index != -1){
        loop--;
        stage--;
      }

      while(index >= 0) {
         index = chosen_word.indexOf(Guess, index+1);
         number = index;
         if((number > -1)&&(stage<6)){
              chosen_array_parallel[number] = Guess;

         }
      }


      word_form_of_array = "";
      for(int q = 0;q<chosen_array_parallel.length;q++)
      word_form_of_array = word_form_of_array + chosen_array_parallel[q];
      stage++;
      if(word_form_of_array.equals(chosen_word)){
        System.out.println("YOU WON");
        System.out.println("\n\nYY   YY  OOOOO  UU   UU      WW      WW  OOOOO  NN   NN\nYY   YY OO   OO UU   UU      WW      WW OO   OO NNN  NN\n YYYYY  OO   OO UU   UU      WW   W  WW OO   OO NN N NN\n  YYY   OO   OO UU   UU       WW WWW WW OO   OO NN  NNN\n  YYY    OOOO0   UUUUU         WW   WW   OOOO0  NN   NN ");
        System.out.println("The Word was: " + chosen_word);
        System.exit(0);

    }
      if(stage >= 6){
        System.out.println("GAME OVER YOU RAN OUT OF LIVES\nThe Word was: " + chosen_word);
        System.exit(0);
      }







}
}

  }



// word lists
// easy_words = {"cat","dog","pet","vet","bat","rat","fat","bed","boy","bye","hat"}
// medium_words = {"girl","apply","above","block","crazy","dozen","equal","fight","glove","happy","image"}
// hard_wrods = {"amazing","blanket","complex","display","exactly","factory","grocery"."horizon","improve","justify","kitchen"}
