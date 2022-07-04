public class CheckerAuto {
    public static void main(String[] args) {
        Auto bmw = new Auto("BMW", "850", 2020, 400);
        bmw.infoCar();
        bmw.hamuj();
        System.out.println();
        Auto mercedes = new Auto("Mercedes", "Klasa S", 2019, 100);
        mercedes.infoCar();
        mercedes.hamuj();
        System.out.println();
        Auto lexus = new Auto();
        lexus.marka = "Lexus";
        lexus.model = "Ls 460H";
        lexus.rokProdukcji= 2022;
        lexus.przebieg = 50;
        lexus.infoCar();


    }
}
