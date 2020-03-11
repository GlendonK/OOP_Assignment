import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class Page {

    public Page(){

    }

    public String getNextUrl(String url) throws IOException {
        Document doc = Jsoup.connect(url).get();
        Element link = doc.select("a.pagination__link.is-next").first();
        return link.toString();

    }
}
// get the next page url from the next button. then pass it to the Crawl.getWords(Page.getNextUrl)