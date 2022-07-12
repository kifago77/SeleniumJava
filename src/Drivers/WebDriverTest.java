package Drivers;

public class WebDriverTest {
    public static void main(String[] args) throws NoValidBrowserName {
        //Przykład Interface
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get();
        chromeDriver.findElementBy();
        System.out.println();
        FirefoxDriver firefoxDriver = new FirefoxDriver();
        firefoxDriver.get();
        firefoxDriver.findElementBy();
        System.out.println("Przykład poliformizmu");
        //Przykład polimorfizmu
        WebDriver driver = getDriver( "firefox");
        WebDriver driver1 = findElementByDriver("firefox");
        driver.get();
        driver1.findElementBy();
    }
    private static WebDriver getDriver(String name) throws NoValidBrowserName {
        if(name.equals("firefox")){
            return new FirefoxDriver();
        } else if (name.equals("chrome")){
            return new ChromeDriver();
        }
        throw new NoValidBrowserName("No valid browser name!!!");

    }

    private static WebDriver findElementByDriver(String name) throws NoValidBrowserName {
        if (name.equals("firefox")){
            return new FirefoxDriver();
        }else if (name.equals("chrome")){
            return new ChromeDriver();
        }
        return null;
    }

}
