package pl.com.progrex88.homefinanceapp.model;

import lombok.Getter;
import lombok.Setter;

public class User extends Person {

    @Getter
    @Setter
    private String userName;
    private String password;
    protected Long userId; //integer





}
