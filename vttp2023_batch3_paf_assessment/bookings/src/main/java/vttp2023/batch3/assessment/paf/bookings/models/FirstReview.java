package vttp2023.batch3.assessment.paf.bookings.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
public class FirstReview {
    @JsonProperty("$date")
    public Date get$date() {
        return this.$date;
    }

    public void set$date(Date $date) {
        this.$date = $date;
    }

    Date $date;
}
