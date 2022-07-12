package Animal;

public class Dog extends Animal{
    @Override
    public void infoAnimals() {
        System.out.println("Number of legs:" + legs);
        System.out.println("My type is:" + type);
        colorAnimal = "Brown";
    }

    @Override
    public void sound() {
        System.out.println("Hau Hau");
    }
}
