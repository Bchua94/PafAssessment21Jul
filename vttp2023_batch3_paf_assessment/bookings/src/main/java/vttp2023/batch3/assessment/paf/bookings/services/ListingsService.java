package vttp2023.batch3.assessment.paf.bookings.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vttp2023.batch3.assessment.paf.bookings.models.*;
import vttp2023.batch3.assessment.paf.bookings.repositories.AccomodationRepository;
import vttp2023.batch3.assessment.paf.bookings.repositories.ListingsRepository;
import vttp2023.batch3.assessment.paf.bookings.repositories.ReservationRepository;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class ListingsService {

    @Autowired
    ListingsRepository listingsRepository;

    @Autowired
    AccomodationRepository accomodationRepository;

    @Autowired
    ReservationRepository reservationRepository;


    private final Random random = new Random();
    private final Set<Integer> generatedNumbers = new HashSet<>();
    private static final int MIN_VALUE = 10000000;
    private static final int MAX_VALUE = 99999999;

    public int generateUniqueRandomNumber() {
        int randomNumber;
        do {
            randomNumber = generateRandomNumber();
        } while (!generatedNumbers.add(randomNumber));

        return randomNumber;
    }

    private int generateRandomNumber() {
        return MIN_VALUE + random.nextInt(MAX_VALUE - MIN_VALUE + 1);
    }


	public List<SearchResultDTO> getSearchResults(String country , Integer accomodates , Double min, Double max) {
        return listingsRepository.getListingsByPrice(country,accomodates,min,max).stream().map(s->SearchResultDTO.fromRootDto(s)).collect(Collectors.toList());
    }


    public ResultDTO findById(String id) {
        return ResultDTO.fromRootDto(listingsRepository.getById(id));
    }


    public Reservations bookAccomodation(BookingDTO bookingDTO) throws Exception {
        Optional<AccOccupancy> accOccupancy= accomodationRepository.findById(bookingDTO.getAccomodationId());

        if(!accOccupancy.isPresent()){
            throw new Exception("Accomodation not found");
        }

        if(accOccupancy.get().getVacancy() < bookingDTO.getDurationOfStay()) {
            throw new Exception("Accomodation not available for this duration");
        }

        accOccupancy.get().setVacancy(accOccupancy.get().getVacancy() - bookingDTO.getDurationOfStay());
        AccOccupancy accOccupancy1 = accomodationRepository.save(accOccupancy.get());

        Reservations reservations = new Reservations();
        reservations.setName(bookingDTO.getName());
        reservations.setEmail(bookingDTO.getEmail());
        reservations.setArrivalDate(bookingDTO.getArrivalDate());
        reservations.setDuration(bookingDTO.getDurationOfStay());
        reservations.setAccOccupancy(accOccupancy1);
        reservations.setResvId(Integer.toString(generateUniqueRandomNumber()));
        return reservationRepository.save(reservations);
    }

    public List<Root> getCountries(){
        return listingsRepository.findAll();
    }

}

