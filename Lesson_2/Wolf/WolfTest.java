public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();

        wolf.setGender("мужской");
        System.out.println("Пол = " + wolf.getGender());

        wolf.setName("Волчок");
        System.out.println("Кличка = " + wolf.getName());

        wolf.setWeight(50.0f);
        System.out.println("Вес = " + wolf.getWeight());

        wolf.setAge(5);
        System.out.println("Возраст = " + wolf.getAge());
    
        
        wolf.setColor("черный");
        System.out.println("Цвет = " + wolf.getColor());

        wolf.move();
        wolf.sit();
        wolf.run();
        System.out.println(wolf.howl());
        System.out.println(wolf.hunt());
    }
}
