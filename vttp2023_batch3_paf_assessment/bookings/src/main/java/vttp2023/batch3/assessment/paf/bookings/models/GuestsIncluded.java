package vttp2023.batch3.assessment.paf.bookings.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class GuestsIncluded {
    @JsonProperty("$numberDecimal")
    public String get$numberDecimal() {
        return this.$numberDecimal;
    }

    public void set$numberDecimal(String $numberDecimal) {
        this.$numberDecimal = $numberDecimal;
    }

    String $numberDecimal;
}
