public class PersonChecker {
    public static void main(String[] args) {
        Footballer footballer = new Footballer("Marcin" , 19 );
        footballer.footballClub= "FC Barcelona";
        System.out.println(footballer.footballClub);
        footballer.eat();
        footballer.walk();



        MatchTeacher mathTeacher = new MatchTeacher("Tadeusz", 45);
        mathTeacher.school = "University of London";
        System.out.println(mathTeacher.school);
        mathTeacher.eat();
        mathTeacher.walk();




    }
}
