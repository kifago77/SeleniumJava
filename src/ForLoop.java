public class ForLoop {
    public static void main(String[] args) {

        int number = 100;
        for (int i = 0; i < number; i = i + 2) {
            System.out.print(i);
        }
        System.out.println();

        for (int j = 0; j < number; j++) {
            if (j % 5 == 0) {
                System.out.print(j);
            }
        }
    }
}

