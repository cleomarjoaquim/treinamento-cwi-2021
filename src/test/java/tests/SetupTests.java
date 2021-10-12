package tests;

import org.junit.Test;
import utils.Browser;
import utils.Utils;
import static org.junit.Assert.assertTrue;

public class SetupTests extends BaseTests {
    @Test
    public void testOpeningBrowserAndLoadingPage(){
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl()));
        System.out.println("Conseguimos abrir a pagina na web");
    }


}
