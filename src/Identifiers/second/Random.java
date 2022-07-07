package Identifiers.second;

import Identifiers.first.Parent;

public class Random {
    public void testIdentification(){
        //Uzyskuje dostęp tylko do pola/metody public.
        Parent parent = new Parent();
        System.out.println(parent.first);
        parent.firstIdentification();



    }


}
