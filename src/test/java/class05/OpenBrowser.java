package class05;
/*
     HomeWork #4 :
     1. Create methods
     2. close browser
     3. select from dropdown
 */
import utils.CommonMethods;

import java.io.IOException;

public class OpenBrowser extends CommonMethods {
    public static void main(String[] args) throws IOException, InterruptedException {

        openBrowserAndLaunchApplication();
        Thread.sleep(1000);

        closeBrowser();
    }
}
