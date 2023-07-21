package vttp2023.batch3.assessment.paf.bookings.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SearchResultDTO {

    String address;

    String image;

    Double price;

    String id;

    public static SearchResultDTO fromRootDto(Root root){
        SearchResultDTO searchResultDTO= new SearchResultDTO();
        searchResultDTO.setPrice(root.getPrice());
        searchResultDTO.setImage(root.getImages().getPicture_url());
        searchResultDTO.setAddress(root.getAddress().getStreet());
        searchResultDTO.setId(root.get_id());
        return searchResultDTO;
    }


}
