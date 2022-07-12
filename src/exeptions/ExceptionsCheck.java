package exeptions;
//Pobierz wiek od użytkownika, jesli bedzie mniejszy niz 18 lat , wyrzuc wujątek
//InvalidAgeExceptions
//jesli ma 18 to mozemy wypisac, ze jest pelnoletni

import java.util.Scanner;

public class ExceptionsCheck {
    public static void main(String[] args) throws InvalidAgeExceptions {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wiek");
        int age = scanner.nextInt();
        if(age < 0){
            throw new InvalidAgeExceptions("Your age is not valid");
            }
        if (age >= 18){
            System.out.println(" Jestes pełnoletni!!!");
        }else {
            System.out.println("Nie jesteś pełnoletni!! ");

        }

    }
}
