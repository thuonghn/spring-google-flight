package spring.boot.google.flight.spring.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import spring.boot.google.flight.spring.annotation.Window;
import spring.boot.google.flight.spring.service.WindowSwitchService;

@Aspect
@Component
public class WindowAspect {

    @Autowired
    private WindowSwitchService switchService;

    // If any methods in the class with annotation Window called, below method will trigger
    @Before("@target(window) && within(spring.boot.google.flight..*)")
    public void before(Window window){
        this.switchService.switchByTitle(window.value());
    }

    // After the method done, switch parent window
    @After("@target(window) && within(spring.boot.google.flight..*)")
    public void after(Window window){
        this.switchService.switchByIndex(0);
    }

}
