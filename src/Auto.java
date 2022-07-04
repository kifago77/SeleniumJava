public class Auto {
    public String marka;
    public String model;
    public int rokProdukcji;
    public int przebieg;


    public Auto(){

    }
    public Auto(String marka, String model, int rokProdukcji, int przebieg){
        this.marka = marka;
        this.model = model;
        this.rokProdukcji = rokProdukcji;
        this.przebieg = przebieg;

    }
    public  void hamuj(){
        System.out.println("Hamuj!!");
    }
    public void infoCar() {
        System.out.println("Marka Pojazdu !!" + marka);
        System.out.println("Model Pojazdu !!!" + model);
        System.out.println("Rok producji pojazdu !!!" + rokProdukcji);
        System.out.println("Przebieg pojazdu !!!" + przebieg);
    }
}
