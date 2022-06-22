public class Increment {
    public static void main(String[] args) {
        int a = 2;
        System.out.println(a++);
        //Zwiększa wartość a o jeden.
        int b = a ++;
        System.out.println(b);
        int c = ++ a;
        System.out.println(c);
    }
}
