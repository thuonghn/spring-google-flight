package spring.boot.google.flight.cucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.Assert;
import spring.boot.google.flight.testng.FlightAppDetails;
import spring.boot.google.flight.page.FlightPage;
import spring.boot.google.flight.spring.annotation.LazyAutowired;

@SpringBootTest
public class FlightStep {

    @LazyAutowired
    private FlightPage flightPage;

    @LazyAutowired
    private FlightAppDetails appDetails;

    @Value("${application.url}")
    private String url;

    @Given("I access Flight page")
    public void accessFlightPage() {
        this.flightPage.goTo(this.appDetails.getUrl());
        Assert.assertTrue(this.flightPage.isAt());
    }

    @Then("I should see sections on left")
    public void validateLeftSections() {
        Assert.assertEquals(this.flightPage.getLabels(), this.appDetails.getLabels());
    }

    @Given("I check which environment")
    public void selectEnvironment() {
        System.out.println("URL in properties: " + this.url);
    }

}
