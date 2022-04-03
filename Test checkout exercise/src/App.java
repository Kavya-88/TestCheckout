import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class App {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://bstackdemo.com/");
        // driver.quit();  
        
        // Click code for Add to cart
        driver.findElement(By.xpath("/html/body/div/div/div/main/div[2]/div[2]/div[4]")).click();
        Thread.sleep(1000);

        // Click code for Checkout
        driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[3]/div[3]")).click();
        Thread.sleep(1000);

        //Get the Web Element corresponding to the field UserName (Textfield)
        WebElement user = driver.findElement(By.id("react-select-2-input"));

        //Get the Web Element corresponding to the field Password (Textfield)
        WebElement pass = driver.findElement(By.id("react-select-3-input"));
        
        //Enter UserName and Password
        user.sendKeys("image_not_loading_user");
        user.sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        pass.sendKeys("testingisfun99");
        pass.sendKeys(Keys.ENTER);
        Thread.sleep(1000);

        // login
        // driver.findElement(By.xpath("/html/body/div/div[2]/div/form/div[2]/button")).click();
        // Thread.sleep(1000);
        
        
        // Click code for username dropdown
        //driver.findElement(By.xpath("/html/body/div/div[2]/div/form/div[2]/div[1]/div/div[1]")).click();
        //driver.findElement(By.xpath("/html/body/div/div[2]/div/form/div[2]/div[1]/div/div[1]")).click();
        //driver.findElement(By.xpath("/html/body/div/div[2]/div/form/div[2]/div[1]/div")).click();
        //driver.findElement(By.xpath("/html/body/div/div[2]/div/form/div[2]/div[1]/div/div[1]/div[1]")).click();
        //Thread.sleep(1000);

       
        // code for select username
        //Select dropdownusername = new Select(driver.findElement(By.className("css-1uccc91-singleValue")));
        //Select dropdownusername = new Select(driver.findElement(By.xpath("/html/body/div/div[2]/div/form/div[2]/div[1]/div/div[1]/div[2]")));        
        
        //dropdownusername.selectByValue("2");
        //dropdownusername.selectByIndex(1);
        //dropdownusername.selectByValue("demouser");

        
        //driver.findElement(By.xpath("/html/body/div/div[2]/div/form/div[2]/div[1]")).sendKeys("demouser");
        //driver.findElement(By.className("css-1uccc91-singleValue")).sendKeys("demouser");
        //Thread.sleep(1000);

    }
}