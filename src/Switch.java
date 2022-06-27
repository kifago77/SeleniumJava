public class Switch {
    public static void main(String[] args) {
        String danie = "Pizza";
        switch (danie){
            case "Pizza":
            System.out.println("Pizza kosztuje 30 zł! ");
            break;
            case "Losoś":
                System.out.println("Losoś kosztuje 45zł!");
                break;
            default:
                System.out.println("Nie mamy takiego dania");
        }

    }
}
