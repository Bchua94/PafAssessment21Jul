package vttp2023.batch3.assessment.paf.bookings.models;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class CountryList {
    List<String> countries;


    public static CountryList fromRoot(List<Root> roots){
        CountryList countryList= new CountryList();
        List<String> ss= new ArrayList<>();
        for(int i=0;i<roots.size();i++) {
            if(!ss.contains(roots.get(i).getAddress().getCountry()))
            ss.add(roots.get(i).getAddress().getCountry());
        }
        countryList.setCountries(ss);
        return countryList;
    }
}
