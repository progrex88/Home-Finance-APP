package pl.com.progrex88.homefinanceapp.model;

import lombok.Getter;
import lombok.Setter;

public class User extends Person {

    @Getter
    @Setter
    private String username;
    private String password;
    protected Long userID; //integer





}
