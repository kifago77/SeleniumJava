package Animal;

public class AnimalChecker {
    public static void main(String[] args) {
        //Wykorzystuje Polimorfizm do klasy Animal przypisuje obiekt dog
        Animal dog = new Dog();
        dog.seyHello("Pies Azor");
        dog.infoAnimals();
        System.out.println("My colors is:" + dog.colorAnimal);
        dog.sound();
        System.out.println();
        //Wykorzystuje obiekt cat
        Cat cat = new Cat();
        cat.seyHello("Kot Burek");
        cat.infoAnimals();
        System.out.println("My colors is:" + cat.colorAnimal);
        cat.sound();

    }
}
