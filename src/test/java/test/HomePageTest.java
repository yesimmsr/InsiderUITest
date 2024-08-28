package test;


import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import java.lang.reflect.Method;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



@Epic("Smoke Tests")
@Feature("Dashboard Tests")
public class HomePageTest extends test.BaseTest {
    @Description("Test Description: Open useinsider main page")
    @Story("The page title should indicate that the user is on the UseInsider Home Page ")
    @Test
    public void openDashboard() {
        homePage
                .goToInsiderPage()
                .clickCompany()
                .clickCompany()
                .clickCarers()
                .clickFindJob();/*
                .filterLocation();*/
    }
}