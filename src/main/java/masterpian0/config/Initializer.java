package masterpian0.config;

import org.springframework.stereotype.Component;
import masterpian0.model.User;
import masterpian0.service.UserService;

import javax.annotation.PostConstruct;

@Component
public class Initializer {
    private final UserService userService;

    public Initializer(UserService userService) {
        this.userService = userService;
    }

    @PostConstruct
    private void init() {
        User user = new User("Ivan", "Ivanov", 18, "Moscow", "ivanov@mail.ru");
        userService.addUser(user);

        User user1 = new User("Petr", "Petrov", 45, "Saint-Petersburg", "petrov@gmail.com");
        userService.addUser(user1);

        User user2 = new User("Kate", "Sidorova", 28, "Kaluga", "sidorova@yandex.ru");
        userService.addUser(user2);

        User user3 = new User("Oleg", "Stepanov", 25, "Nizhniy Novgorod", "stepanov@yahoo.com");
        userService.addUser(user3);

        User user4 = new User("Anya", "Vasilyeva", 31, "Sochi", "vasilyeva@icloud.com");
        userService.addUser(user4);
    }
}


