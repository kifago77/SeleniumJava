

public class AppChecker {
    public static void main(String[] args) {
        AndroidApp android = new AndroidApp("System Android", 2020);
        android.runAndroidApp();
        android.appInfo();
        System.out.println(android.name + " " + android.years);

        System.out.println();

        IphoneApp iphone = new IphoneApp("System Iphone", 2019);
        android.appInfo();
        iphone.runIphoneApp();


    }
}
