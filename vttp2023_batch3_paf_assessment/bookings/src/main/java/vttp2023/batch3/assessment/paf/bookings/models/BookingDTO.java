package vttp2023.batch3.assessment.paf.bookings.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class BookingDTO {

    String accomodationId;
    String name;
    String email;
    Date arrivalDate;
    Integer durationOfStay;
}
