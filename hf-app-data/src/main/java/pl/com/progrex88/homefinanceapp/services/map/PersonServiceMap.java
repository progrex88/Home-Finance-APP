package pl.com.progrex88.homefinanceapp.services.map;

import org.springframework.stereotype.Service;
import pl.com.progrex88.homefinanceapp.model.Person;
import pl.com.progrex88.homefinanceapp.services.PersonService;

import java.util.Set;

@Service
public class PersonServiceMap extends AbstractMapService<Person, Long> implements PersonService {

    @Override
    public Set<Person> findAll() {
        return super.findAll();
    }

    @Override
    public Person findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Person save(Person object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Person object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
