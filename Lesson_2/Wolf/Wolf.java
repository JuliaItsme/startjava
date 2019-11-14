public class Wolf {
    String gender;
    String name;
    float weight;
    int age;
    String color;

    void move() {
        System.out.println("Волк идет");
    }

    void sit() {
        System.out.println("Волк сидит");
    }
    void run() {
        System.out.println("Волк бежит");
    }
    String howl() {
        System.out.print("Волк воет" + " ");
        return "У-у-у-у-у";
    }
    boolean hunt() {
        System.out.print("Волк охотится" + " ");
        return true;
    }
}
