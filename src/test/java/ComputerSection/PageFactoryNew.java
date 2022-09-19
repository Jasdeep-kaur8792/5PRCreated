package ComputerSection;

import org.openqa.selenium.WebDriver;

public class PageFactoryNew
{
    WebDriver driver;
    private AddItems addComputerItems;
    private Apparel addWishList;

    public PageFactoryNew(WebDriver driver)
    {
        this.driver = driver;

    }

    public AddItems getAddComputerItems()

    {
        if (addComputerItems == null) {
            addComputerItems = new AddItems(driver);
        }
        return addComputerItems;
    }
    public Apparel getAddWishList()

    {
        if (addWishList == null) {
            addWishList = new Apparel(driver);
        }
        return addWishList;
    }
}
