public class Student {
    public String name;
    public String lastName;
    public String nick;
    public String email;
    public int noIndex;
    public static String nazwaUczelni= "Szkoła Głowna Handlowa";

public static void mojaUczelnia(){
    System.out.println("Szkoła Wyższa Handlowa");
}

    public void introduceYourself(){
        System.out.println("Name."+" " + name + " "+ "Last Name."+" " + lastName);
    }
    public void nick(){
        System.out.println("Nick pass!!!" + nick);
    }
    public void email(){
        System.out.println("Email pass!!!" + email);
    }
    public void noIndex(){
        System.out.println("No index pass!!!" + noIndex);
        return;
    }
    public void accept(){
        System.out.println("Student"+" " + name +" "+ "Został przyjęty!!!");
    }
}
