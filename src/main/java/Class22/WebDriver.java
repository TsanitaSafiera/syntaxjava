package Class22;

public abstract class WebDriver {
    abstract void openBrowser();
    abstract void loadURL(String url);
    abstract void performTesting();
    abstract void closeBrowser();
}
class ChromeDriver extends WebDriver{
    @Override
    void openBrowser(){
        System.out.println("Opening Google Chrome");
    }
    @Override
    void loadURL(String url){
        System.out.println("Loading website on Google Chrome "+ url);

    }
    void performTesting(){
        System.out.println("Testing a webpage on Google Chrome");

    }
    void closeBrowser(){
        System.out.println("Closing the browser");

    }
}




