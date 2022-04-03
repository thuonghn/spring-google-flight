package spring.boot.google.flight.testng;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import spring.boot.google.flight.spring.annotation.Page;

import java.util.List;

@Page
@PropertySource("language/${app.locale:en}.properties")
public class FlightAppDetails {

    @Value("${flight.app.url}")
    private String url;

    @Value("${flight.app.labels}")
    private List<String> labels;

    public String getUrl() {
        return url;
    }

    public List<String> getLabels() {
        return labels;
    }
}
