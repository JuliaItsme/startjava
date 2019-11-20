public class Jaeger {
	private String name;
    private int mark;
    private String origin;
	private float height;
	private float weight;
    private int kaijuKilled;

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getMark() {
        return mark;
    }
    public void setMark(int mark){
        this.mark = mark;
    }

    public String getOrigin() {
        return origin;
    }
    public void setOrigin(String origin){
        this.origin = origin;
    }

    public float getHeight() {
        return height;
    }
    public void setHeight(float height){
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }
    public void setWeight(float weight){
        this.weight = weight;
    }

    public int getKaijuKilled() {
        return kaijuKilled;
    }
    public void setKaijuKilled(int kaijuKilled){
        this.kaijuKilled = kaijuKilled;
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
