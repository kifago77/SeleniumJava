public class Auto {
    public String marka;
    public String model;
    public int rokProdukcji;
    public int przebieg;

    public  void hamuj(){
        System.out.println("Hamuj!!");
    }
    public void infoCar(){
        System.out.println("Marka pojazdu" + marka);
        System.out.println("Model pojazdu" + model);
        System.out.println("Rok producji pojazdu" + rokProdukcji);
        System.out.println("Przebieg pojazdu" + przebieg);
    }
}
