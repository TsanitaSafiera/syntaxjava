package GroupProjectOOP;

public interface WebDriver {
    //  Provide Implementation for the diagram below. Then create a test class
    //in which you need to create Objects of ChromeDriver, FirefoxDrive and
    //SafariDriver classes and see which methods available to them.

    void open();
    void close();
    String getTittle();
}
interface TakesScreenShot {
    void getScreenShoot();
}
interface RemoteWebDriver extends WebDriver, TakesScreenShot{

    void navigate();

}
class ChromeDriver implements RemoteWebDriver{

    String tittle = "Chrome";
    @Override
    public void open() {
        System.out.println("Open ChromeDriver");

    }

    @Override
    public void close() {
        System.out.println("Close ChromeDriver");

    }

    @Override
    public String getTittle() {
        System.out.println("ChromeDriver Tittle");
        this.tittle=tittle;
        return tittle;
    }

    @Override
    public void getScreenShoot() {
        System.out.println("ChromeDriver Screen shoot");

    }

    @Override
    public void navigate() {
        System.out.println("Chrome Navigate");

    }
}
class FireFoxDriver implements RemoteWebDriver {

    String tittle="FireFox";
    @Override
    public void open() {
        System.out.println("Open FireFoxDriver");

    }

    @Override
    public void close() {
        System.out.println("Close FireFoxDriver");
    }

    @Override
    public String getTittle() {
        System.out.println("FireFoxDriver Tittle");
        this.tittle=tittle;
        return tittle;
    }

    @Override
    public void getScreenShoot() {
        System.out.println("FireFoxDriver Screen shoot");

    }

    @Override
    public void navigate() {
        System.out.println("Firefox Navigate");

    }
}
class SafariDriver implements RemoteWebDriver{

    String tittle="Safari";
    @Override
    public void open() {
        System.out.println("Open SafariDriver");

    }

    @Override
    public void close() {
        System.out.println("Close SafariDriver");
    }

    @Override
    public String getTittle() {
        System.out.println("SafariDriver Tittle");
        this.tittle=tittle;
        return tittle;

    }

    @Override
    public void getScreenShoot() {
        System.out.println("SafariDriver Screen shoot");

    }

    @Override
    public void navigate() {
        System.out.println("Safari Navigate");

    }
}

class WebDriverTester {
    public static void main(String[] args) {


        ChromeDriver chromeDriver = new ChromeDriver();
        FireFoxDriver fireFoxDriver = new FireFoxDriver();
        SafariDriver safariDriver = new SafariDriver();

        chromeDriver.open();
        chromeDriver.close();
        chromeDriver.getScreenShoot();
        chromeDriver.getTittle();
        chromeDriver.navigate();

        System.out.println("---------------------------");

        fireFoxDriver.open();
        fireFoxDriver.close();
        fireFoxDriver.getScreenShoot();
        fireFoxDriver.getTittle();
        fireFoxDriver.navigate();

        System.out.println("---------------------------");

        safariDriver.open();
        safariDriver.close();
        safariDriver.getScreenShoot();
        safariDriver.getTittle();
        safariDriver.navigate();
    }
}
