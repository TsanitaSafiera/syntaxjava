package Class23;

public interface WebDriver {
    // Create a WebDriver Interface that will have the following unimplemented
    // behaviour: openBrowser(), closeBrowser(), maximizeWindow(), findElement().
    // Create 2 classes that implements WebDriver interface: ChromeDriver and
    // FirefoxDriver.

    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();

}
class ChromeDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Open the browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close the browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize the browser");
    }

    @Override
    public void findElement() {
        System.out.println("Find the element");
    }
}
class FirefoxDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Open the browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close the browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize the browser");
    }

    @Override
    public void findElement() {
        System.out.println("Find the element");
    }
}
class WebDriverTester{
    public static void main(String[] args) {
        WebDriver[] webDriver= {new ChromeDriver(), new FirefoxDriver()};
        for (WebDriver w:webDriver){
            w.closeBrowser();
            w.findElement();
            w.maximizeWindow();
            w.openBrowser();
        }
    }
}
