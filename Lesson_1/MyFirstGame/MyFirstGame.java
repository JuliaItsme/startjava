public class MyFirstGame {
    public static void main(String[] args) {
        System.out.println("Компьютер загадал число. Попробуйте его угадать!");
        int youNumber = 25;
        int number = 25;
        if ( youNumber > number) {
            System.out.println("Ваше число больше, чем загаданное");
        }
        else if (youNumber < number) {
            System.out.println("Ваше число меньше, чем загаданное");
        }
        else {
            System.out.println("Поздравляем! Вы угадали!");
        }
    }
}
