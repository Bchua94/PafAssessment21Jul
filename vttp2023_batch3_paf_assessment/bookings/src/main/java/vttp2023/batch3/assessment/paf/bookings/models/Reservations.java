package vttp2023.batch3.assessment.paf.bookings.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.Date;

@Entity
@Table(name = "reservations")
@Getter
@Setter
public class Reservations {


    @Id
    @Column(name="resv_id")
    private String  resvId;

    @Column(name = "duration")
    private Integer duration;

    @Column(name = "email")
    private String email;

    @Column(name = "arrival_date")
    private Date arrivalDate;

    @Column(name = "name")
    private String name;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "acc_id")
    @OnDelete(action = OnDeleteAction.NO_ACTION)
    private AccOccupancy accOccupancy;
}
