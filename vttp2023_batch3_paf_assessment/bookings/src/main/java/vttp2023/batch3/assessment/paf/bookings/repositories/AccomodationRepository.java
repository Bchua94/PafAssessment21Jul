package vttp2023.batch3.assessment.paf.bookings.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import vttp2023.batch3.assessment.paf.bookings.models.AccOccupancy;

import java.util.Optional;


@Repository
public interface AccomodationRepository extends JpaRepository<AccOccupancy,String> {

    @Query(value = "select * from acc_occupancy where acc_occupancy.acc_id = ?",nativeQuery = true)
    Optional<AccOccupancy> findById(String id);
}