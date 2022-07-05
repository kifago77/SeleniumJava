public class Footballer extends Person{

    public String footballClub;

    public Footballer(String name, int age){
        super(name, age);
        System.out.println("Jestem w kostruktorze Footballer");
        System.out.println("My name is"+ " "+ name);
        System.out.println("My age is"+ " "+ age);
        this.footballClub = footballClub;


    }
    public void eat() {
        System.out.println("I like healthy food");
    }

    public void walk() {
        System.out.println("I like fast running");
    }
}
