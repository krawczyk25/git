package pl.adrian.gitspring.model;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Optional;

@Data
@AllArgsConstructor
public class Address {

    private String city;
    private String street;


    Optional<String> getCity(){
        return Optional.ofNullable(city);
    }
    Optional<String> getStreeet(){
        return Optional.ofNullable(street);
    }


}
