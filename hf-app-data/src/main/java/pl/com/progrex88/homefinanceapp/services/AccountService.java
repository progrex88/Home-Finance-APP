package pl.com.progrex88.homefinanceapp.services;

import pl.com.progrex88.homefinanceapp.model.Account;
import pl.com.progrex88.homefinanceapp.model.ENUMS.AccountStatus;
import pl.com.progrex88.homefinanceapp.model.ENUMS.DataAccessType;
import pl.com.progrex88.homefinanceapp.model.User;

public interface AccountService extends CrudService<Account, Long> {



    Account findByUser(User user);

    Account findByAccountStatus(AccountStatus accountStatus);

    Account findByDataAccessType(DataAccessType dataAccessType);


}
