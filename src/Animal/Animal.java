package Animal;

public abstract class Animal {
    //Pole final
    public final static int legs = 4;
    public final static String type = "Jestem ssakiem";
    public String colorAnimal;


    public Animal(){
        this.colorAnimal = colorAnimal;
    }
    //Metoda abstrakcyjna
    public abstract void infoAnimals();
    //Metoda void
    public void seyHello(String name){
        System.out.println(name +" "+ "Hello im Animal");
    }

    public void sound() {

    }

}
