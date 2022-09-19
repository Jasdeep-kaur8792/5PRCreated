package ComputerSectionTest;

import baseTestNew.Baseclass;
import org.testng.annotations.Test;

import java.io.IOException;

public class ApparelTest extends Baseclass
{
    @Test

    public void VerifyAddWishListItem() throws InterruptedException, IOException
    {
        pageFactoryNew.getAddWishList().fromClickOnTopMenuApparel();
    }

}
