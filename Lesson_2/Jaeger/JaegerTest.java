public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger = new Jaeger("Gipsy Danger", 3, "USA", 79.2f, 1980, 9);
        jaeger.drift();
        jaeger.attackReflection();

        System.out.println();
	
        jaeger = new Jaeger("Striker Eureka", 5, "Australia", 76.2f, 1850, 11);
        jaeger.drift();
        jaeger.patrol();

        System.out.println();

        jaeger = new Jaeger("Cherno Alpha", 1, "Russia", 85.34f, 2412, 6);
        jaeger.drift();
        jaeger.patrol();
        jaeger.attackReflection();
    }
}