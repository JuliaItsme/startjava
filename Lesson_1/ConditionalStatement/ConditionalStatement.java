public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 36;
        if (age > 20) {
            System.out.println("Вы взрослый.");
        }
        
        boolean isMan = true;
        if (isMan) {
            System.out.println("Вы мужского пола.");
        }
        if (!isMan) {
            System.out.println("Вы не мужского пола.");
        }

        int height = 167;
        if (height < 180) {
            System.out.println("Вы маленького роста.");
        } else {
            System.out.println("Вы высокого роста.");
        }

        char firstLetterM = 'J';
        if (firstLetterM == 'M' ) {
            System.out.println("Ваше имя начинается с буквы 'M'.");
        } else if (firstLetterM == 'I') {
            System.out.println("Ваше имя начинается с буквы 'I'.");
        } else {
            System.out.println("Ваше имя начинается с другой буквы.");
        }
    }
}
