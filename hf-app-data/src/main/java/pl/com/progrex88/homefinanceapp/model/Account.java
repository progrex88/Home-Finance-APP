package pl.com.progrex88.homefinanceapp.model;

import lombok.Getter;
import lombok.Setter;
import pl.com.progrex88.homefinanceapp.model.ENUMS.AccountStatus;
import pl.com.progrex88.homefinanceapp.model.ENUMS.DataAccessType;

public class Account extends Person {

    @Getter
    @Setter


    private User user;
    private AccountStatus accountStatus;
    private DataAccessType dataAccessType;




}
