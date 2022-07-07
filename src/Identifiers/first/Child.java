package Identifiers.first;

public class Child extends Parent{
    //Nie uzyskuje dostępu do pol/metod private z klasy Parent w tej samej paczce.
    public void testIdentification() {
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        firstIdentification();
        secondIdentification();
        thirdIdentification();
        System.out.println("Nie uzyskuje dostępu do pol/metod private z klasy Parent");

    }
}
