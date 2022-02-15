import java.io.IOException;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
    public class ReadContent {
        public static void main(String args[]) throws IOException {
            String page = "https://www.getpitstop.com/car-service/bengaluru/hyundai/sonata-transform/petrol/services/complete-car-service";
            //Connecting to the web page
            Connection conn = Jsoup.connect(page);
            //executing the get request
            Document doc = conn.get();
            //Retrieving the contents (body) of the web page
            String result = doc.body().text();
            System.out.println(result);
        }

}
