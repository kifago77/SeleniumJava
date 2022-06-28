package HomeWork;
//Wypisz liczby z zakresu 1-100
// podzielne przez3
//odwróc elementy tablicy 1,3,5,7 do7, 5,3,1

public class Loop {
    public static void main(String[] args) {
        int firstNumber = 100;

        for (int i = 1; i < firstNumber; i++){
            System.out.print(i);}
        System.out.println();

        for (int j = 0; j < firstNumber; j++){
            if (j%3 == 0){
                System.out.print(j);
            }
        }
        System.out.println();

        int[]number = new int[]{1, 3 , 5, 7};
        for (int k =0; k < number.length; k++){
            System.out.print(number[k]);
        }
        //Odwrócenie tablicy 7 ,5 3, 1
        for (int k =0; k<number.length/2;k++){
            int temp = number[k];
            number[k]= number[number.length -1 -k];
            number[number.length -1 -k] = temp;
        }
        System.out.println();
        for (int k =0; k< number.length; k++){
            System.out.print(number[k]);
        }


    }
}

