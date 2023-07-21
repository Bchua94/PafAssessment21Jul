package vttp2023.batch3.assessment.paf.bookings.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vttp2023.batch3.assessment.paf.bookings.models.Reservations;

@Repository
public interface ReservationRepository extends JpaRepository<Reservations,String> {
}
