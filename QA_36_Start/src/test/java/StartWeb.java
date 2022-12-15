import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class StartWeb {
    WebDriver wb;

    @Test
    public void startTrella() {
        wb = new ChromeDriver();
        wb.navigate().to("https://trello.com/");
        wb.manage().window().maximize();
        wb.navigate().back();
        wb.navigate().forward();
        wb.navigate().refresh();
        wb.close();
        wb.quit();


    }
}
