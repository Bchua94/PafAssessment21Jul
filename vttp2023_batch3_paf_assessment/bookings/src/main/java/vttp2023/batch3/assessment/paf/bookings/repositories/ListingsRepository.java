package vttp2023.batch3.assessment.paf.bookings.repositories;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import vttp2023.batch3.assessment.paf.bookings.models.Root;

import java.util.List;

@Repository
public interface ListingsRepository extends MongoRepository<Root, Integer> {

    @Query(value = "{'address.country': ?0, accommodates: ?1, price: {$gte: ?2},price: {$lt: ?3}}" ,sort= "{price:-1}")
    List<Root> getListingsByPrice(String country, Integer accomodates, Double min,Double max);


    @Query(value = "{_id: ?0}")
    Root getById(String id);





}
