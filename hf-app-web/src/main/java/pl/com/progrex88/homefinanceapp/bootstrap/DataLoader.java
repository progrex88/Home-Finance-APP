package pl.com.progrex88.homefinanceapp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pl.com.progrex88.homefinanceapp.model.User;
import pl.com.progrex88.homefinanceapp.services.UserService;
import pl.com.progrex88.homefinanceapp.services.map.UserServiceMap;

@Component
public class DataLoader implements CommandLineRunner {

    private final UserService userService;


    public DataLoader() {
        userService = new UserServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        User user1 = new User();

        user1.setId(1L);
        user1.setFirstName("john");
        user1.setLastName("pol");

        userService.save(user1);

        User user2 = new User();

        user2.setId(1L);
        user2.setFirstName("Rade");
        user2.setLastName("Alek");

        userService.save(user2);

        System.out.println("Users loaded..");



    }
}
