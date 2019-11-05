public class MyFirstGame {
    public static void main(String[] args) {
        System.out.println("Компьютер загадал число. Попробуйте его угадать!");
        int compNumber = 75;
        int youNumber = 75;

        if (youNumber > compNumber) {
            for (int i = youNumber; i <= 100; i--) {
                if (i > compNumber) {
                    System.out.println("Загаданное число меньше"); 
                }
            }
        } else if (youNumber < compNumber) {
            for (int i = youNumber; i <= 100; i++) {
                if (i < compNumber) {
                    System.out.println("Загаданное число больше"); 
                }
            }
        } 
        System.out.println("Поздравляем! Вы победили!");
    }
}