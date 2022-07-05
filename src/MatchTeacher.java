public class MatchTeacher extends Person{
    public String school;



    public MatchTeacher(String name, int age) {
        super(name , age);
        System.out.println("Konstruktor w MathTeacher");
        System.out.println("My name is" + " "+ name);
        System.out.println("My age is"+ " "+ age);
        this.school = school;
    }

//Nadpisanie metody z klasy Person
    public void eat() {
        System.out.println("I like Sushi");
    }


    public void walk() {
        System.out.println("I like fast walking");
    }
}
