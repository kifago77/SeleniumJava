import java.util.Scanner;

public class DataDawnload {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cześć , jak masz na imię?");
        String name = scanner.nextLine();
        System.out.println("Cześć"+ " "  + name + " ." + "Ile masz lat");
        int firstNumber = scanner.nextInt();
        System.out.println(firstNumber + " "+ "To bardzo ładny wiek!" );
        System.out.println("Czym się interesujesz"+" " + name);
        String text1 = scanner.nextLine();
        String text = scanner.nextLine();
        System.out.println("To bardzo ciekawe" + " "+  "A ja lubię zadania matematyczne");
        System.out.println("Chcesz mnie sprawdzić?");
        text = scanner.nextLine();
        System.out.println("Ok"+ " "+ "Podaj liczbę!");
        firstNumber = scanner.nextInt();
        System.out.println(firstNumber * firstNumber);

    }
}
