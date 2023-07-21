package vttp2023.batch3.assessment.paf.bookings.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ResultDTO {

    String _id;

    String description;

    String street;

    String suburb;

    String country;

    String image;

    Double price;

    List<String> amenities;

    public static ResultDTO fromRootDto(Root root){
        ResultDTO resultDTO= new ResultDTO();
        resultDTO.setPrice(root.getPrice());
        resultDTO.setImage(root.getImages().getPicture_url());
        resultDTO.set_id(root.get_id());
        resultDTO.setStreet(root.getAddress().getStreet());
        resultDTO.setAmenities(root.getAmenities());
        resultDTO.setDescription(root.getDescription());
        resultDTO.setCountry(root.getAddress().getCountry());
        resultDTO.setSuburb(root.getAddress().getSuburb());
        return resultDTO;
    }
}
