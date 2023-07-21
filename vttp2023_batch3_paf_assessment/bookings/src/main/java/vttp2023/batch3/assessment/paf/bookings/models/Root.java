package vttp2023.batch3.assessment.paf.bookings.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "listings")
public class Root {
    @JsonProperty("_id")
    public String get_id() {
        return this._id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    String _id;

    @JsonProperty("listing_url")
    public String getListing_url() {
        return this.listing_url;
    }

    public void setListing_url(String listing_url) {
        this.listing_url = listing_url;
    }

    String listing_url;

    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

    @JsonProperty("summary")
    public String getSummary() {
        return this.summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    String summary;

    @JsonProperty("space")
    public String getSpace() {
        return this.space;
    }

    public void setSpace(String space) {
        this.space = space;
    }

    String space;

    @JsonProperty("description")
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    String description;

    @JsonProperty("neighborhood_overview")
    public String getNeighborhood_overview() {
        return this.neighborhood_overview;
    }

    public void setNeighborhood_overview(String neighborhood_overview) {
        this.neighborhood_overview = neighborhood_overview;
    }

    String neighborhood_overview;

    @JsonProperty("notes")
    public String getNotes() {
        return this.notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    String notes;

    @JsonProperty("transit")
    public String getTransit() {
        return this.transit;
    }

    public void setTransit(String transit) {
        this.transit = transit;
    }

    String transit;

    @JsonProperty("access")
    public String getAccess() {
        return this.access;
    }

    public void setAccess(String access) {
        this.access = access;
    }

    String access;

    @JsonProperty("interaction")
    public String getInteraction() {
        return this.interaction;
    }

    public void setInteraction(String interaction) {
        this.interaction = interaction;
    }

    String interaction;

    @JsonProperty("house_rules")
    public String getHouse_rules() {
        return this.house_rules;
    }

    public void setHouse_rules(String house_rules) {
        this.house_rules = house_rules;
    }

    String house_rules;

    @JsonProperty("property_type")
    public String getProperty_type() {
        return this.property_type;
    }

    public void setProperty_type(String property_type) {
        this.property_type = property_type;
    }

    String property_type;

    @JsonProperty("room_type")
    public String getRoom_type() {
        return this.room_type;
    }

    public void setRoom_type(String room_type) {
        this.room_type = room_type;
    }

    String room_type;

    @JsonProperty("bed_type")
    public String getBed_type() {
        return this.bed_type;
    }

    public void setBed_type(String bed_type) {
        this.bed_type = bed_type;
    }

    String bed_type;

    @JsonProperty("minimum_nights")
    public int getMinimum_nights() {
        return this.minimum_nights;
    }

    public void setMinimum_nights(int minimum_nights) {
        this.minimum_nights = minimum_nights;
    }

    int minimum_nights;

    @JsonProperty("maximum_nights")
    public int getMaximum_nights() {
        return this.maximum_nights;
    }

    public void setMaximum_nights(int maximum_nights) {
        this.maximum_nights = maximum_nights;
    }

    int maximum_nights;

    @JsonProperty("cancellation_policy")
    public String getCancellation_policy() {
        return this.cancellation_policy;
    }

    public void setCancellation_policy(String cancellation_policy) {
        this.cancellation_policy = cancellation_policy;
    }

    String cancellation_policy;
//
//    @JsonProperty("last_scraped")
//    public LastScraped getLast_scraped() {
//        return this.last_scraped;
//    }
//
//    public void setLast_scraped(LastScraped last_scraped) {
//        this.last_scraped = last_scraped;
//    }
//
//    LastScraped last_scraped;

//    @JsonProperty("calendar_last_scraped")
//    public CalendarLastScraped getCalendar_last_scraped() {
//        return this.calendar_last_scraped;
//    }
//
//    public void setCalendar_last_scraped(CalendarLastScraped calendar_last_scraped) {
//        this.calendar_last_scraped = calendar_last_scraped;
//    }
//
//    CalendarLastScraped calendar_last_scraped;

//    @JsonProperty("first_review")
//    public FirstReview getFirst_review() {
//        return this.first_review;
//    }
//
//    public void setFirst_review(FirstReview first_review) {
//        this.first_review = first_review;
//    }
//
//    FirstReview first_review;
//
//    @JsonProperty("last_review")
//    public LastReview getLast_review() {
//        return this.last_review;
//    }
//
//    public void setLast_review(LastReview last_review) {
//        this.last_review = last_review;
//    }
//
//    LastReview last_review;

    @JsonProperty("accommodates")
    public int getAccommodates() {
        return this.accommodates;
    }

    public void setAccommodates(int accommodates) {
        this.accommodates = accommodates;
    }

    int accommodates;

    @JsonProperty("bedrooms")
    public int getBedrooms() {
        return this.bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    int bedrooms;

    @JsonProperty("beds")
    public int getBeds() {
        return this.beds;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }

    int beds;

    @JsonProperty("number_of_reviews")
    public int getNumber_of_reviews() {
        return this.number_of_reviews;
    }

    public void setNumber_of_reviews(int number_of_reviews) {
        this.number_of_reviews = number_of_reviews;
    }

    int number_of_reviews;

//    @JsonProperty("bathrooms")
//    public Bathrooms getBathrooms() {
//        return this.bathrooms;
//    }
//
//    public void setBathrooms(Bathrooms bathrooms) {
//        this.bathrooms = bathrooms;
//    }
//
//    Bathrooms bathrooms;

    @JsonProperty("amenities")
    public ArrayList<String> getAmenities() {
        return this.amenities;
    }

    public void setAmenities(ArrayList<String> amenities) {
        this.amenities = amenities;
    }

    ArrayList<String> amenities;

    @JsonProperty("price")
    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    double price;

//    @JsonProperty("extra_people")
//    public ExtraPeople getExtra_people() {
//        return this.extra_people;
//    }
//
//    public void setExtra_people(ExtraPeople extra_people) {
//        this.extra_people = extra_people;
//    }
//
//    ExtraPeople extra_people;

//    @JsonProperty("guests_included")
//    public GuestsIncluded getGuests_included() {
//        return this.guests_included;
//    }
//
//    public void setGuests_included(GuestsIncluded guests_included) {
//        this.guests_included = guests_included;
//    }
//
//    GuestsIncluded guests_included;

    @JsonProperty("images")
    public Images getImages() {
        return this.images;
    }

    public void setImages(Images images) {
        this.images = images;
    }

    Images images;

    @JsonProperty("host")
    public Host getHost() {
        return this.host;
    }

    public void setHost(Host host) {
        this.host = host;
    }

    Host host;

    @JsonProperty("address")
    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    Address address;

    @JsonProperty("availability")
    public Availability getAvailability() {
        return this.availability;
    }

    public void setAvailability(Availability availability) {
        this.availability = availability;
    }

    Availability availability;

    @JsonProperty("review_scores")
    public ReviewScores getReview_scores() {
        return this.review_scores;
    }

    public void setReview_scores(ReviewScores review_scores) {
        this.review_scores = review_scores;
    }

    ReviewScores review_scores;

//    @JsonProperty("reviews")
//    public ArrayList<Review> getReviews() {
//        return this.reviews;
//    }
//
//    public void setReviews(ArrayList<Review> reviews) {
//        this.reviews = reviews;
//    }
//
//    ArrayList<Review> reviews;
}

