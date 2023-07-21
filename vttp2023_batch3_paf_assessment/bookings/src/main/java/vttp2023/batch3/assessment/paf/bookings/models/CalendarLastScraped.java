package vttp2023.batch3.assessment.paf.bookings.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
public class CalendarLastScraped {
    @JsonProperty("$date")
    public Object get$date() {
        return this.$date;
    }

    public void set$date(Object $date) {
        this.$date = $date;
    }

    Object $date;
}
