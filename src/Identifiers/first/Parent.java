package Identifiers.first;

public class Parent {
    //Pola
    public String first = "public";
    String second = "domyślny - default";
    protected String third = "protected";
    private String four = "private";
    //Metody
    public void firstIdentification(){
        System.out.println("Method public");
    }
    void secondIdentification(){
        System.out.println("Method default");
    }
    protected void thirdIdentification(){
        System.out.println("Method third");
    }
    private void fourIdentification(){
        System.out.println("Method four");
    }
    public void testIdentification(){
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(four);
        firstIdentification();
        secondIdentification();
        thirdIdentification();
        fourIdentification();
    }


}
