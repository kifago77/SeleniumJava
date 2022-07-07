package Identifiers.second;

import Identifiers.first.Parent;

public class Child extends Parent {
    //Nie uzyskuje dostępu do pol/metod domySlnych default z klasy Parent z innej paczki.
    public void testIdentification() {
        System.out.println(first);

        System.out.println(third);
        firstIdentification();
        thirdIdentification();
    }
}
