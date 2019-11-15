public class Wolf {
    private String gender;
    private String name;
    private float weight;
    private int age;
    private String color;

    public String getGender() {
    	return gender;
    }

    public void setGender(String gender) {
    	this.gender = gender;
    }

     public String getName() {
    	return name;
    }

    public void setName(String name) {
    	this.name = name;
    }

     public float getWeight() {
    	return weight;
    }

    public void setWeight(float weight) {
    	this.weight = weight;
    }

     public int getAge() {
    	return age;
    }

    public void setAge(int age) {
    	if (age > 8) {
    		System.out.println("Некорректный возраст");
    	} else {
    		this.age = age;
    	}
    }

     public String getColor() {
    	return color;
    }

    public void setColor(String color) {
    	this.color = color;
    }

    public void move() {
        System.out.println("Волк идет");
    }

    public void sit() {
        System.out.println("Волк сидит");
    }

    public void run() {
        System.out.println("Волк бежит");
    }

    public String howl() {
        System.out.print("Волк воет" + " ");
        return "У-у-у-у-у";
    }

    public boolean hunt() {
        System.out.print("Волк охотится" + " ");
        return true;
    }
}