package Identifiers.first;

public class Random {
    public void testIdentification(){
        //Nie uzyskuje dostępu do pol/metod private z klasy Parent w tej samej paczce.
        Parent parent = new Parent();
        parent.firstIdentification();
        parent.secondIdentification();
        parent.thirdIdentification();
        System.out.println(parent.first);
        System.out.println(parent.second);
        System.out.println(parent.third);

    }
}
