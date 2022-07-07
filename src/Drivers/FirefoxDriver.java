package Drivers;

public class FirefoxDriver implements WebDriver {
    @Override
    public void get() {
        System.out.println("We open with Firefox.");
    }

    @Override
    public void findElementBy() {
        System.out.println("We fund element with Firefox.");

    }
}
