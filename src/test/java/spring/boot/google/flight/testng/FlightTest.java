package spring.boot.google.flight.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import spring.boot.google.flight.SpringBaseTestNGTest;
import spring.boot.google.flight.page.FlightPage;
import spring.boot.google.flight.spring.annotation.LazyAutowired;

public class FlightTest extends SpringBaseTestNGTest {

    @LazyAutowired
    private FlightPage flightPage;

    @LazyAutowired
    private FlightAppDetails appDetails;

    @Test
    public void flightTest(){
        this.flightPage.goTo(this.appDetails.getUrl());
        Assert.assertTrue(this.flightPage.isAt());

        Assert.assertEquals(this.flightPage.getLabels(), this.appDetails.getLabels());
    }


}
