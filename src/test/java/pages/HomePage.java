package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.logs.Log;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }


    String baseURL = "https://useinsider.com/";
    private By dashboardText=By.xpath("//a[@href='https://useinsider.com/request-a-demo/' and contains(text(),'Get a Demo')]");
    private By dashboardPopupCancel=By.xpath("//a[@id='close-button-1454703513202']/div/div/div/div/h1");
    private By sideMenuCompany=By.xpath("//a[@id='navbarDropdownMenuLink' and contains(text(),'Company')]");
    private By sideMenuCareers = By.xpath("//*[text()='Careers']");
    private By btnFindJob=By.xpath("//a[@href='https://useinsider.com/open-positions/' and contains(text(),'Find your dream job')]");
    private By openPositionsText=By.xpath("//*[text()='All open positions']");
    private By filterLocation= By.id("#select2-filter-by-location-container");
    private By filterLocationCity = By.xpath("//[ul[@id='select2-filter-by-location-results']/li[2] -- istanbul']");
    private By filterDepartment= By.xpath("#select2-filter-by-department-container");
    private By filterDepartmentQA = By.xpath("//ul[@id='select2-filter-by-department-results -- id, quality assurance");
    private By QAJob = By.xpath("//[@id='jobs-list']/div[1]/div/a");
    private By notificationClose = By.xpath("//[@class='ins-close-button");


    //Go to Homepage
    public HomePage goToInsiderPage() {
        //Log.info("Opening Insider Website.");
        driver.get(baseURL);
        try {
            boolean isElementPresent = waitUntilVisibleByLocator(dashboardPopupCancel) != null;
            if (isElementPresent) {
                click(dashboardPopupCancel);
            }
        } catch (Exception e) {
            System.out.println("Timeout exceeded");

        }
        return this;
    }

    public HomePage clickCompany() {
        //Log.info("Side Menu see Company");
        click(sideMenuCompany);
        return this;
    }

    public HomePage clickCarers() {
        //Log.info("Open to Career Page");
        waitUntilVisibleByLocator(sideMenuCareers);
        click(sideMenuCareers);
        return this;
    }

    public HomePage clickFindJob() {
       // Log.info("Open to JobList");
        waitUntilVisibleByLocator(btnFindJob);
        click(btnFindJob);
        waitUntilVisibleByLocator(openPositionsText);
        return this;
    }

    public HomePage filterLocation() {
        //Log.info("Clik Filter Location");
        click(filterLocation);
        return this;
    }

    public HomePage filterDepartment() {
        //Log.info("Clik Depertment Location");
        click(filterDepartment);
        return this;
    }
/*
    public HomePage selectFromListWithLabel(By labelXpath,String data) {
        WebElement element = labelXpath.findElement(driver.findElement(By.xpath(".//div")));
        click(element);
        Actions actions = new Actions(driver);
        WebElement elements = driver.findElement(By.xpath("//div[text()='" + data + "']"));
        actions.moveToElement(elements).click().perform();
        return this;
    }

    public HomePage selectInvoiceProvince(String location) throws InterruptedException {
        selectFromListWithLabel(labelProvince,adress);
        Thread.sleep(2000);
        return this;
    }

    public HomePage searchJobs() {
        Log.info("Search Job");
        click(QAJob);
        return this;
    }
*/

}