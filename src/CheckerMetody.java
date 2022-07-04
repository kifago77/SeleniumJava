public class CheckerMetody {
    public static void main(String[] args) {
        Metody metody  = new Metody();
        metody.policzWynik();
        metody.pobierzWynik();
        int result = metody.pobierzWynik() / 2;
        System.out.println(result);
        metody.metodaParametr(45, 765);
    }
}
