class WhatsMyGrade {
  public static void main(String[] args) {
    // generation
    int Test_1 = ((int)( Math.random() * (100 - 30 + 1) + 30));
    int Test_2 = ((int)( Math.random() * (95 - 45 + 1) + 45));
    int Test_3 = ((int)( Math.random() * (80 - 58 + 1) + 58));
    int Test_4 = ((int)( Math.random() * (100 - 55 + 1) + 55));
    int final_grade = ((int)( Math.random() * (100 - 40 + 1) + 40));

    // calculations
    double Avarage = (Test_1 + Test_2 + Test_3 + Test_4)/4.0;
    double final_grade1 = (Avarage * 0.8) + (final_grade*0.2);

    // letter grade && (final_grade1 >= 65)
    if(final_grade1 <= 65) {
      String letter = "F";

    }
    if((final_grade1 <= 73) && (final_grade1 > 65)){
      String letter = "C-";

    }
    if((final_grade1 <= 80) && (final_grade1 > 73)){
      String letter = "C";

    }

    if((final_grade1 <= 84) && (final_grade1 > 80)){
      String letter = "B-";

    }
    if((final_grade1 <=  90) && (final_grade1 > 84)){
      String letter = "B";
    }
    if((final_grade1 <= 95) && (final_grade1 > 90)){
    String letter = "A-";

    }
    if((final_grade1 <= 100 ) && (final_grade1 > 95)){
      String letter = "A";

    }













    // output
    System.out.println("Test 1: " + Test_1);
    System.out.println("Test 2: " + Test_2);
    System.out.println("Test 3: " + Test_3);
    System.out.println("Test 4: " + Test_4);
    System.out.println("Avarage: " + Avarage);
    System.out.println("final: " + final_grade);
    System.out.println("\nFinal Avarge: " + final_grade1);
    System.out.println("Grade: " + letter);



  }
}
