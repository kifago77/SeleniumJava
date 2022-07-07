package Drivers;

public class WebDriverTest {
    public static void main(String[] args) {
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get();
        chromeDriver.findElementBy();
        System.out.println();
        FirefoxDriver firefoxDriver = new FirefoxDriver();
        firefoxDriver.get();
        firefoxDriver.findElementBy();
        System.out.println("Przykład poliformizmu");
        //Przykład poliformizmu
        WebDriver driver = getDriver( "firefox");
        WebDriver driver1 = findElementByDriver("firefox");
        driver.get();
        driver1.findElementBy();
    }
    private static WebDriver getDriver(String name) {
        if(name.equals("firefox")){
            return new FirefoxDriver();
        } else if (name.equals("chrome")){
            return new ChromeDriver();
        }
        return null;

    }

    private static WebDriver findElementByDriver(String name){
        if (name.equals("firefox")){
            return new FirefoxDriver();
        }else if (name.equals("chrome")){
            return new ChromeDriver();
        }
        return null;
    }

}
