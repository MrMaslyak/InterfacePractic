abstract class Pet  implements Animal, Weight,Information  {
    private String name;
    private int age;
    private String breed;
    private final int weight;

    public Pet(String name, int age, String breed,int weight ) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        if (weight < 0) {
            throw new IllegalArgumentException("Weight cannot be negative");
        }
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.weight = weight;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Breed: " + breed);
        System.out.println("Weight: " + weight + " kg");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    @Override
    public abstract void soundAnimal();

    @Override
    public abstract void foodAnimal();

}
