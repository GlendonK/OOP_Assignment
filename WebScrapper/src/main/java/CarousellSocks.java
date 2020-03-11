import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CarousellSocks extends Carousell {

    private String src = "Carousell";
    private String words;
    private String cost;

    public CarousellSocks() throws InterruptedException {
        super(); // invoke parent contructor
    }
    @Override
    public void crawl() throws Exception {
        CarousellDatabase adder = new CarousellDatabase(); // initialise database adder
        WebDriver driver = new ChromeDriver(); //initialise webdriver
        driver.get("https://sg.carousell.com/search/socks?"); // go to url
        Thread.sleep(500);

        for (int i = 0; i<2; i++) // loop crawl how man pages change i<x
        {
            driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div[2]/main/div/button")).click();
            Thread.sleep(500);
        }
        List<WebElement> all = driver.findElements(By.className("TpQXuJG_eo")); // get all the things inside this cointainer
        //WebElement name = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div[2]/main/div/div/div[1]/div[1]/a[2]/p[1]")); // get the sepcific class holding the text
        int i = 1;
        for(WebElement each : all){
            try{
                words = each.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div[2]/main/div/div/div["+i+"]/div[1]/a[2]/p[1]")).getText(); // get the name in the class. increment to the next container
                System.out.println(words);
                cost = each.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div[2]/main/div/div/div["+i+"]/div[1]/a[2]/p[2]")).getText();// get the price in the class. increment to the next container
                System.out.println(cost);
                adder.pushDatabase(words, cost, src);
                i++;
            }
            catch (Exception e)
            {
                i++;
            }
        }

        Thread.sleep(10000); // let user see the end before closing
        driver.quit(); // close browser
    }
}
