package pl.com.progrex88.homefinanceapp.services;

import pl.com.progrex88.homefinanceapp.model.Account;
import pl.com.progrex88.homefinanceapp.model.AccountStatus;
import pl.com.progrex88.homefinanceapp.model.DataAccessType;
import pl.com.progrex88.homefinanceapp.model.User;

import java.util.Set;

public interface AccountService {

    Account findById(Long accountID);

    Account findByUser(User user);

    Account findByAccountStatus(AccountStatus accountStatus);

    Account findByDataAccessType(DataAccessType dataAccessType);

    Account save(Account account);

    Set<Account> findAll();
}
