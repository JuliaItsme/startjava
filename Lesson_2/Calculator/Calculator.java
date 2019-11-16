public class Calculator {

    private int firstNumber;
    private int secondNumber;

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void addition(int firstNumber, int secondNumber) {
        System.out.println("Сумма чисел " + (firstNumber + secondNumber));
    }

    public void subtraction(int firstNumber, int secondNumber) {
        System.out.println("Разность чисел " + (firstNumber - secondNumber));
    }

    public void multiplication(int firstNumber, int secondNumber) {
        System.out.println("Произведение чисел " + (firstNumber * secondNumber));
    }

    public void division(int firstNumber, int secondNumber) {
        System.out.println("Частное чисел" + (firstNumber / secondNumber));
    }

    public void remainder(int firstNumber, int secondNumber) {
        if (firstNumber % secondNumber == 0) {
            System.out.println("Деление без остатка");
        } else {
            System.out.println("Остаток от деления " + (firstNumber % secondNumber));
        }
    }

    public void degree(int firstNumber, int secondNumber) {
        int result = 1;
            for (int i = 1; i <= secondNumber; i++) {
                result *= firstNumber;
            }
            System.out.println("Степень числа " + result);
    }
}
