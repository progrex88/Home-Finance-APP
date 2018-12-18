package pl.com.progrex88.homefinanceapp.services.map;

import pl.com.progrex88.homefinanceapp.model.Account;
import pl.com.progrex88.homefinanceapp.services.CrudService;

import java.util.Set;

public class AccountServiceMap extends AbstractMapService<Account, Long> implements CrudService<Account, Long> {

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
}
