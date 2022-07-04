import java.util.Scanner;
public class StudentChecker {
    public static void main(String[] args) {
        String uczelnia = Student.nazwaUczelni;

        Student maciej = new Student();
        maciej.name = "Maciej";
        maciej.lastName = "Kowalczyk";
        maciej.noIndex =  1234;


        System.out.println();
        Student filip = new Student();
        filip.name = "Filip";
        filip.lastName = "Filipowicz";
        filip.noIndex = 32032;
        System.out.println();
        Student mikolaj = new Student();
        mikolaj.name= "Mikołaj";
        mikolaj.lastName= "Kwiatkowski";
        mikolaj.noIndex= 3456;
        //Wywołanie tablicy i przypisanie metod do i
        Student[]studentTab = new Student[3];
        studentTab[0] = maciej;
        studentTab[1] = filip;
        studentTab[2] = mikolaj;
        for (int i = 0; i < studentTab.length; i++){
            studentTab[i].introduceYourself();
            studentTab[i].noIndex();
            studentTab[i].accept();
            studentTab[i].mojaUczelnia();
        }












    }
}
