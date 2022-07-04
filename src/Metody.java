public class Metody {
    //Metoda void
    public void policzWynik(){
        int result = 0;
        for(int i = 13; i < 15; i++){
            result = result + i;
            System.out.println("Metoda void" +  result);
        }
    }
    //Metoda zwracająca wartość np.int.
    public int pobierzWynik(){
        int result = 0;
        for (int i =0; i < 100; i++){
            result = result + i;
        }
        System.out.println("Metoda zwracająca int" + result);
        return result;
    }
    //Metoda z parametrem
    public int metodaParametr(int number , int number1){
        int result = number + number1;
            System.out.println(result);
        return result;
    }
    }

