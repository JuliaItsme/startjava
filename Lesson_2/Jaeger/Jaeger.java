public class Jaeger {

    private String name;
    private int mark;
    private String origin;
    private float height;
    private float weight;
    private int kaijuKilled;

    public Jaeger(String name, int mark, String origin, float height, float weight, int kaijuKilled) {
        this.name = name;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.kaijuKilled = kaijuKilled;
        System.out.println(name + " убил " + kaijuKilled + " Кайдзю");
        System.out.println("Его рост " + height + " см, вес " + weight + " тонн");
        System.out.println(mark + " поколения, произведен в " + origin);
    }

    public void patrol() {
        System.out.println("Jaeger " + name + " патрулирует береговую зону");
    }

    public void attackReflection() {
        System.out.println("Jaeger " + name + " отправлен отражать аттаку Кайдзю");
    }

    public boolean drift() {
        System.out.println("Jaeger " + name + " вошел в Дрифт");
        return true;
    }
}