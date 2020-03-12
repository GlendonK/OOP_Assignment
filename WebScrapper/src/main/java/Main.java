import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.*;
import com.gargoylesoftware.htmlunit.javascript.host.Event;
import com.gargoylesoftware.htmlunit.javascript.host.html.HTMLInputElement;
import org.junit.Assert;
import org.w3c.dom.html.HTMLButtonElement;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        CarousellSocks carousell = new CarousellSocks();
        carousell.crawl();

        /*WebClient webClient = new WebClient(BrowserVersion.CHROME);
        webClient.getOptions().setThrowExceptionOnScriptError(false);
        webClient.getOptions().setCssEnabled(false);
        webClient.getOptions().setJavaScriptEnabled(false);
        HtmlPage page = webClient.getPage("https://sg.carousell.com/search/socks?");
        //HtmlPage page = webClient.getPage("https://www.google.com.sg/");
        List<HtmlElement> mainContainer= (List<HtmlElement>) page.getByXPath("//div[@class='TpQXuJG_eo']");
        //HtmlForm form = (HtmlForm) page.getByXPath("//*[@id=\"root\"]/div/div[3]/div/div[2]/main/div/button");
        final HtmlButton button = (HtmlButton) page.getFirstByXPath("//*[@id=\"root\"]/div/div[3]/div/div[2]/main/div/button");
        //HtmlButton button = (HtmlButton) page.getFirstByXPath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[2]");
        button.click();
        String tittle = page.getTitleText();
        System.out.println(page.asXml());
        int i=1;
        for(HtmlElement ele : mainContainer){
            try{
                HtmlElement words = (HtmlElement) ele.getByXPath("//*[@id=\"root\"]/div/div[3]/div/div[2]/main/div/div/div["+i+"]/div[1]/a[2]/p[1]").get(0);
                System.out.println(words.asText());
                i++;
            }
            catch (Exception e){
                i++;
            }

        }*/

    }
}


