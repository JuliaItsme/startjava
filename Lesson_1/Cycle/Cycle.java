public class Cycle {
	public static void main(String[] args) {
		for (int numberOne= 0; numberOne <=20; numberOne ++) {
      		System.out. print(numberOne + " " + "\n");
		}
		int numberTwo = 6;
		while (numberTwo >= -6) {
			System.out.print(numberTwo + " " + "\n");
			numberTwo = numberTwo-2;
		}
		int numberThree = 10;
		int summa = 0;
		do {
			if (numberThree % 2 == 0)
				numberThree++;
			summa = summa + numberThree;
			System.out.println(summa + " ");
			numberThree = numberThree + 2;
		}
		while (numberThree < 20);
	}
}
