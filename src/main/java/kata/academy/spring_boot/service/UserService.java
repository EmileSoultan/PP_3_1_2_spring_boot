package kata.academy.spring_boot.service;

import kata.academy.spring_boot.models.User;

import java.util.List;

public interface UserService {
    List<User> showAllUsers();
    User showUserById(long id);
    void save(User user);
    void update(long id, User user);
    void delete(long id);
}
