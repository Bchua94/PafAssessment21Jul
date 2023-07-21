package vttp2023.batch3.assessment.paf.bookings.models;


import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Date;

@Document
public class LastScraped {
    @JsonProperty("$date")
    public LocalDateTime get$date() {
        return  this.$date;
    }

    public void set$date(LocalDateTime $date) {
        this.$date = $date;
    }

    LocalDateTime $date;
}
