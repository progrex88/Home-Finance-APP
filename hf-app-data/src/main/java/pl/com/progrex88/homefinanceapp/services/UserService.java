package pl.com.progrex88.homefinanceapp.services;

import pl.com.progrex88.homefinanceapp.model.User;

public interface UserService extends CrudService<User, Long>{

    User findByUserName(String userName);


}
