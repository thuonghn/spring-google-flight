package spring.boot.google.flight;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.AfterTest;

@SpringBootTest
public class SpringBaseTestNGTest extends AbstractTestNGSpringContextTests {

    @Autowired
    protected WebDriver driver;

    @AfterTest
    public void close (){
        driver.close();
    }
}
