public class JaegerTest {
	public static void main(String[] args) {
		Jaeger jaegerOne = new Jaeger();
		Jaeger jaegerTwo = new Jaeger();

		jaegerOne.setName("Gipsy Danger");
		jaegerOne.setMark(3);
		jaegerOne.setOrigin("USA");
		jaegerOne.setHeight(79.2f);
		jaegerOne.setWeight(1980f);
		jaegerOne.setKaijuKilled(9);
		System.out.println(jaegerOne.getName() + " убил " + jaegerOne.getKaijuKilled() + " Кайдзю");
		System.out.println("Его рост " + jaegerOne.getHeight() + " см, вес " + jaegerOne.getWeight() + " тонн");
		System.out.println(jaegerOne.getMark() + " поколения, произведен в " + jaegerOne.getOrigin());

		jaegerOne.drift();

		jaegerTwo.setName("Striker Eureka");
		jaegerTwo.setMark(5);
		jaegerTwo.setOrigin("Australia");
		jaegerTwo.setHeight(76.2f);
		jaegerTwo.setWeight(1850f);
		jaegerTwo.setKaijuKilled(11);
		System.out.println(jaegerTwo.getName() + " убил " + jaegerTwo.getKaijuKilled() + " Кайдзю");
		System.out.println("Его рост " + jaegerTwo.getHeight() + " см, вес " + jaegerTwo.getWeight() + " тонн");
		System.out.println(jaegerTwo.getMark() + " поколения, произведен в " + jaegerTwo.getOrigin());

		jaegerTwo.drift();
		jaegerOne.attackReflection();

		jaegerTwo.setName("Cherno Alpha");
		jaegerTwo.setMark(1);
		jaegerTwo.setOrigin("Russia");
		jaegerTwo.setHeight(85.3f);
		jaegerTwo.setWeight(2412f)
		jaegerTwo.setKaijuKilled(6);
		System.out.println(jaegerTwo.getName() + " убил " + jaegerTwo.getKaijuKilled() + " Кайдзю");

		jaegerTwo.drift();
		jaegerTwo.patrol();
	}
}