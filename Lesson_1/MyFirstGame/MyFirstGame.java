public class MyFirstGame {
    public static void main(String[] args) {
        System.out.println("Компьютер загадал число. Попробуйте его угадать!");
        int compNumber = 75;
        int youNumber = 95;
        if (youNumber > compNumber) {
            for (int i = youNumber; i <= 100 ; i--) {
                if (i > compNumber) {
                    System.out.println("Загаданное число меньше");
                } else {
                    System.out.println("Поздравляем! Вы победили!");
                    break;
                }
            }
        } else if (youNumber < compNumber) {
            for (int i = youNumber; i <= 100; i++) {
                if (i < compNumber) {
                    System.out.println("Загаданное число больше");
                } else {
                    System.out.println("Поздравляем! Вы победили!");
                    break;
                }
            }
        } else {
            System.out.println("Поздравляем! Вы победили!");
        }
    }
}