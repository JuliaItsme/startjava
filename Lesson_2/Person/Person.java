public class Person {
    String gender = "female";
    String name = "Julia";
    float height = 167.0f;
    float weight = 57.0f;
    int age = 36;

    void move() {
        System.out.println("Я иду");
    }

    void sit() {
        System.out.println("Я сижу");
    }

    void run() {
        System.out.println("Я бегу");
    }

    String talk() {
        System.out.println("Я говорю" + " ");
        return "Привет";
    }

    public boolean learnJava() {
        System.out.println("Я учу Java" + " ");
        return true;
    }
}
