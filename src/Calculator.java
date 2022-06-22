import java.util.Scanner;

public class Calculator {
    //Napisz program który poprosi uzytkownika o 2 liczby, a następnie wykona obliczenie
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cześć. Jak masz na imię?");
        String name = scanner.nextLine();
        System.out.println("Cześć"+" " + name);
        System.out.println("Bardzo ładne imię !");
        System.out.println("Jestem kalkulatorem stworzonym przez Marcina!");
        System.out.println("Potrawię wykonać podstawowe obliczenia matematyczne!");
        System.out.println("Czy chcesz mnie wypróbować?" + " " + name);
        scanner.nextLine();
        System.out.println("Ok"+" "+  name);
        System.out.println("Podaj pierwszą liczbę");
        int firstNumber = scanner.nextInt();
        System.out.println("Podaj drugą liczbę");
        int secondNumber = scanner.nextInt();
        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        int division = firstNumber / secondNumber;
        int mod = firstNumber % secondNumber;
        System.out.println("Wynik dodawania to "+" "+ addition);
        System.out.println("Wynik odejmowania to"+" "+ subtraction);
        System.out.println("Wynik mnożenia to"+ " "+ multiplication);
        System.out.println("Wynik dzielenia to"+ " " + division);
        System.out.println("Wynik reszty z dzielenia to"+ " "+ mod);
        System.out.println("I co ? Dobry jestem"+ " "+ name);


    }
}
