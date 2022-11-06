package academy.kata.piakhota.springcrudboot.dao;

import academy.kata.piakhota.springcrudboot.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAll();
    void save(User user);
    User get(Long id);
    void delete(Long id);
}

