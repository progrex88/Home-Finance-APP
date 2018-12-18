package pl.com.progrex88.homefinanceapp.services;

import pl.com.progrex88.homefinanceapp.model.Person;

import java.util.Set;

public interface PersonService {

    Person finndById (Long personId);

    Person save(Person person);

    Set<Person> findAll();
}
