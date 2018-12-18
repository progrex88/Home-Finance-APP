package pl.com.progrex88.homefinanceapp.model;

import lombok.Getter;
import lombok.Setter;

public class Account {

    @Getter
    @Setter

    private Long accountID;
    private User user;
    private AccountStatus accountStatus;
    private DataAccessType dataAccessType;




}
