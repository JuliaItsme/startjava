public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();

        wolf.gender = "мужской";
        System.out.println("Пол = " + wolf.gender);
        wolf.name = "Волчок";
        System.out.println("Кличка = " + wolf.name);
        wolf.weight = 60.0f;
        System.out.println("Вес = " + wolf.weight);
        wolf.age = 1;
        System.out.println("Возраст = " + wolf.age);
        wolf.color = "Черный";
        System.out.println("Цвет = " + wolf.color);

        wolf.move();
        wolf.sit();
        wolf.run();
        System.out.println(wolf.howl());
        System.out.println(wolf.hunt());
    }
}
