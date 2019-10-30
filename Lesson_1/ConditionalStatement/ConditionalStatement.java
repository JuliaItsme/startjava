public class ConditionalStatement {
  public static void main (String [] args) {

    int yourAge = 36;
    if (yourAge > 20) {
      System.out.println ("Вы взрослый.");
    }
    
    String youAreGender = "female";
    String youAreMale = "male";
    if (youAreGender.equals(youAreMale)) {
      System.out.println ("Вы мужского пола.");
    }


    String youAreFemale = "female";
    if (youAreGender.equals(youAreFemale)) {
         System.out.println ("Вы не мужского пола.");
      }
    
    int yourHeight = 167;
    if (yourHeight < 180) {
      System.out.println ("Вы маленького роста.");
    }
    else {
      System.out.println ("Вы высокого роста.");
    }
    
      char firstLetterOfYourName = 'J';
      char firstLetterOne = 'M';
      char firstLetterTwo = 'I';
      if (firstLetterOfYourName == firstLetterOne) {
        System.out.println ("Ваше имя начинается с буквы 'M'.");
      }
      else if (firstLetterOfYourName == firstLetterTwo) {
        System.out.println ("Ваше имя начинается с буквы 'I'.");
      }
      else {
        System.out.println ("Ваше имя начинается с другой буквы.");
      }

  }
}
