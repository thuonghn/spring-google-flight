package spring.boot.google.flight.spring.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import spring.boot.google.flight.spring.annotation.TakeScreenshot;
import spring.boot.google.flight.spring.service.ScreenshotService;

import java.io.IOException;

@Aspect
@Component
public class ScreenshotAspect {

    @Autowired
    private ScreenshotService screenshotService;

    // Any methods with takeScreenShot annotation done, will trigger
    @After("@annotation(takeScreenshot)")
    public void after(TakeScreenshot takeScreenshot) throws IOException {
        this.screenshotService.takeScreenShot();
    }

}
