package Drivers;

public class ChromeDriver implements WebDriver{
    @Override
    public void get() {
        System.out.println("We open wit Chrome.");
    }

    @Override
    public void findElementBy() {
        System.out.println("We fund element wit Chrome .");
    }
}
