public class Tablica {
    public static void main(String[] args) {
        String[] miesiac = new String[4];
        miesiac[0] = "styczen";
        miesiac[1] = "luty";
        miesiac[2] = "marzec";
        miesiac[3]= "kwiecien";

        System.out.println(miesiac[3]);
        System.out.println();
 //Sposób drugi.
        String[] miesiace = new String[]{"styczen", "luty", "marzec", "kwiecien" };
        System.out.println(miesiace[2]);

        for (int i = 0; i < miesiac.length; i++ ){
        System.out.println(miesiac[i]);
    }
}
}
