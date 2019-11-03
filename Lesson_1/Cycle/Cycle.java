public class Cycle {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            System.out. print(i + " ");
        }
         System.out.println();

        int counter = 6;
        while (counter >= -6) {
            System.out.print(counter + " ");
            counter -= 2;
        }
         System.out.println();

        int sumOdd = 0;
        counter = 10;
        do {
            if (counter % 2 == 0) {
                counter++;
            }
            sumOdd += counter;
            System.out.print(sumOdd + " ");
            counter += 2;
        }
        while (counter < 20);
    }
}
