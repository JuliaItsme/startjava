public class GuessNumber {
    public void guessingNumber(int number) {
        int numberComp = (0 + (int) (Math.random() * 100));

        if (number > numberComp) {
            System.out.println("Загаданное игроком число " + number + " больше, чем загаданное компьютером число " + numberComp);
        } else if (number < numberComp) {
            System.out.println("Загаданное игроком число " + number + " меньше, чем загаданное компьютером число " + numberComp);
        } else {
            System.out.println("Поздравляем! Вы победили!");
        }
    }
}
