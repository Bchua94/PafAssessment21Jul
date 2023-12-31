package vttp2023.batch3.assessment.paf.bookings.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
public class Review {
    @JsonProperty("_id")
    public String get_id() {
        return this._id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    String _id;

    @JsonProperty("date")
    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    Date date;

    @JsonProperty("listing_id")
    public String getListing_id() {
        return this.listing_id;
    }

    public void setListing_id(String listing_id) {
        this.listing_id = listing_id;
    }

    String listing_id;

    @JsonProperty("reviewer_id")
    public String getReviewer_id() {
        return this.reviewer_id;
    }

    public void setReviewer_id(String reviewer_id) {
        this.reviewer_id = reviewer_id;
    }

    String reviewer_id;

    @JsonProperty("reviewer_name")
    public String getReviewer_name() {
        return this.reviewer_name;
    }

    public void setReviewer_name(String reviewer_name) {
        this.reviewer_name = reviewer_name;
    }

    String reviewer_name;

    @JsonProperty("comments")
    public String getComments() {
        return this.comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    String comments;
}
