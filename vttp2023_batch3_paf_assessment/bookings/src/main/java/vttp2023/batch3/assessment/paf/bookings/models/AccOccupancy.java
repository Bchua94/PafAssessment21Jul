package vttp2023.batch3.assessment.paf.bookings.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "acc_occupancy")
@Getter
@Setter
public class AccOccupancy {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="acc_id")
    private String  acc_id;

    @Column(name = "vacancy")
    private Integer vacancy;
}
