package pl.com.progrex88.homefinanceapp.services.map;

import pl.com.progrex88.homefinanceapp.model.User;
import pl.com.progrex88.homefinanceapp.services.UserService;

import java.util.Set;

public class UserServiceMap extends AbstractMapService<User, Long> implements UserService {

    @Override
    public Set<User> findAll() {
        return super.findAll();
    }

    @Override
    public User findById(Long id) {
        return super.findById(id);
    }

    @Override
    public User save(User object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(User object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public User findByUserName(String userName) {
        return null;
    }
}
