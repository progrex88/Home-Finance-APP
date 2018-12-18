package pl.com.progrex88.homefinanceapp.services;

import pl.com.progrex88.homefinanceapp.model.User;

import java.util.Set;

public interface UserService {

    User findByUserName(String userName);

    User finndById (Long id);

    User save(User user);

    Set<User> findAll();
}
