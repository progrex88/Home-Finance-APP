package pl.com.progrex88.homefinanceapp.model;

import lombok.Getter;
import lombok.Setter;

public class Person {

    @Getter
    @Setter
    private Long personId;
    private String firstName;
    private String lastName;

}
