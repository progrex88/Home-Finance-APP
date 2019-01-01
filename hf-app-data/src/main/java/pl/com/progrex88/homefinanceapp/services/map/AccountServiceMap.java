package pl.com.progrex88.homefinanceapp.services.map;

import org.springframework.stereotype.Service;
import pl.com.progrex88.homefinanceapp.model.Account;
import pl.com.progrex88.homefinanceapp.model.ENUMS.AccountStatus;
import pl.com.progrex88.homefinanceapp.model.ENUMS.DataAccessType;
import pl.com.progrex88.homefinanceapp.model.User;
import pl.com.progrex88.homefinanceapp.services.AccountService;

import java.util.Set;

@Service
public class AccountServiceMap extends AbstractMapService<Account, Long> implements AccountService {

    @Override
    public Set<Account> findAll() {
        return super.findAll();
    }

    @Override
    public Account findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Account save(Account object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Account object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Account findByUser(User user) {
        return null;
    }

    @Override
    public Account findByAccountStatus(AccountStatus accountStatus) {
        return null;
    }

    @Override
    public Account findByDataAccessType(DataAccessType dataAccessType) {
        return null;
    }
}
