package swtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestLogin {

    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set path to the ChromeDriver executable (change this to the location of your chromedriver)
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dac.STUDENTSDC\\Downloads\\chromedriver-win64\\chromedriver.exe");

        // Initialize the WebDriver (ChromeDriver in this case)
        driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();
    }

    @Test
    public void testLogin() throws InterruptedException {
        // Step 1: Navigate to the login page
        driver.get("https://artoftesting.com/samplesiteforselenium");

        // Step 2: Enter Username (Assuming username field has an ID 'username')
        WebElement usernameField = driver.findElement(By.id("fname"));
        usernameField.sendKeys("sampleuser"); // Use the valid username

        // Step 3: Enter Password (Assuming password field has an ID 'password')
//        WebElement passwordField = driver.findElement(By.id("password"));
//        passwordField.sendKeys("samplepassword"); // Use the valid password

        // Step 4: Click on the Login button (Assuming login button has an ID 'loginButton')
        WebElement loginButton = driver.findElement(By.id("idOfButton"));
        loginButton.click();
        
        Thread.sleep(10000);

        // Step 5: Verify if login is successful by checking if a specific element is displayed
        // For example, we can check if the user's profile or a logout button is visible.
//        WebElement logoutButton = driver.findElement(By.id("logoutButton"));
//        Assert.assertTrue(logoutButton.isDisplayed(), "Login failed!");

        // Optionally, you can add more assertions based on the application's behavior
    }

    // Tear down the browser after tests
    @Test(dependsOnMethods = "testLogin")
    public void tearDown() {
        driver.quit();
    }
}
