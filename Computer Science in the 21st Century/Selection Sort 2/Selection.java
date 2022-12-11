import java.util.Scanner;
class Selection {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int num[] = {7, -2123, 8, 4, -9, 9, 15, 10};
    char charecter[] = {'z', 'e', 'f', 'v', 'q', 'r', 'm', 'y'};
    int temp;
    char temp1;


    // getting Ascending Order Int Array


    for (int i = 0; i < num.length; i++){
      for (int j = i + 1; j < num.length; j++){
          if (num[i] > num[j]){
            temp = num[i];
              num[i] = num[j];
              num[j] = temp;
        }}}

    for (int i = 0; i < charecter.length; i++){
      for (int j = i + 1; j < charecter.length; j++){
          if (charecter[i] > charecter[j]){
            temp1 = charecter[i];
              charecter[i] = charecter[j];
              charecter[j] = temp1;
        }}}
    System.out.print("int or char: ");
    String Option = reader.nextLine();

    System.out.print("ascending or descending: ");
    String Order = reader.nextLine();


    if(Option.equals("int")){
        if(Order.equals("ascending")){
          for (int i = 0; i < charecter.length; i++)
              System.out.print(num[i] + " ");

        }
        if(Order.equals("descending")){
          for(int i=0; i<num.length/2; i++){
             temp = num[i];
              num[i] = num[num.length -i -1];
               num[num.length -i -1] = temp;
             }
             for (int i = 0; i < charecter.length; i++)
                 System.out.print(num[i] + " ");

        }
    }
    if(Option.equals("char")){
      if(Order.equals("ascending")){
        for (int i = 0; i < charecter.length; i++)
            System.out.print(charecter[i] + " ");

      }
      if(Order.equals("descending")){
        for(int i=0; i<charecter.length/2; i++){
           temp1 = charecter[i];
            charecter[i] = charecter[charecter.length -i -1];
             charecter[charecter.length -i -1] = temp1;
           }
           for (int i = 0; i < charecter.length; i++)
               System.out.print(charecter[i] + " ");

      }
    }


    }
  }
