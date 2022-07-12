package Animal;

public class Cat extends Animal{
    @Override
    public void infoAnimals() {

        System.out.println("Number of legs cat:" + legs);
        System.out.println("My type is:"+ type);
        colorAnimal = " Black" ;

    }

    @Override
    public void sound() {
        System.out.println("Miau Miau");
    }
}
