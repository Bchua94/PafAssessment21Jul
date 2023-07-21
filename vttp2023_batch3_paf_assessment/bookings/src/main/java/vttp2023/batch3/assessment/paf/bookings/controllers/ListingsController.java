package vttp2023.batch3.assessment.paf.bookings.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vttp2023.batch3.assessment.paf.bookings.models.BookingDTO;
import vttp2023.batch3.assessment.paf.bookings.models.CountryList;
import vttp2023.batch3.assessment.paf.bookings.services.ListingsService;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(produces = {APPLICATION_JSON_VALUE})
public class ListingsController {

    @Autowired
    ListingsService listingsService;


    @GetMapping("/search")
    public ResponseEntity<?> getSearchResults(@RequestParam("country") String country, @RequestParam("accomodates") Integer accomodates, @RequestParam("min") Double min,@RequestParam("max") Double max) throws Exception {
        try{
            return ResponseEntity.ok(listingsService.getSearchResults(country,accomodates,min,max));
        }
        catch(Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }



    @GetMapping("/listing/{id}")
    public ResponseEntity<?> getById(@PathVariable("id") String id) throws Exception {
        try{
            return ResponseEntity.ok(listingsService.findById(id));
        }
        catch(Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }


    @GetMapping("/countries")
    public ResponseEntity<?> getCountries() throws Exception {
        try{
            return ResponseEntity.ok(CountryList.fromRoot(listingsService.getCountries()));
        }
        catch(Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }



    @PostMapping("/booking/{id}")
    public ResponseEntity<?> bookAccomodation(@PathVariable("id") String id, @RequestBody BookingDTO bookingDTO) throws Exception {
        try{
            bookingDTO.setAccomodationId(id);
            return ResponseEntity.ok(listingsService.bookAccomodation(bookingDTO));
        }
        catch(Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }


}
