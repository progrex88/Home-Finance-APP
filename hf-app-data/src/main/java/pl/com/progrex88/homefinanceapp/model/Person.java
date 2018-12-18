package pl.com.progrex88.homefinanceapp.model;

import lombok.Getter;
import lombok.Setter;

public class Person extends BaseEntity {

    @Getter
    @Setter

    private String firstName;
    private String lastName;

}
