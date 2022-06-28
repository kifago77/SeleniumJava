package HomeWork;

import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cześć! Jak masz na imię?");
        String name = scanner.nextLine();
        System.out.println(name);
        System.out.println("Ile masz lat?");
        System.out.println("Jeśli masz wiecej niż 18 lat! To możesz kupić piwo!");
        int age = scanner.nextInt();
        if (age >= 18){
            System.out.println("Możesz kupić piwo"+ " "+ "Dziękujemy za zakupy ! Zapraszamy ponownie !");
        }else if (age < 0){
            System.out.println("Wprowadź poprawną liczbę!");
        }
        else {
            System.out.println("Nie możesz kupić piwa!");
        }
}
}
