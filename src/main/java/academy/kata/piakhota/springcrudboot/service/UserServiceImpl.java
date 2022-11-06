package academy.kata.piakhota.springcrudboot.service;

import academy.kata.piakhota.springcrudboot.dao.UserDao;
import academy.kata.piakhota.springcrudboot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    @Transactional(readOnly = true)
    public List<User> getAll() {
        return userDao.getAll();
    }

    @Override
    @Transactional
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    @Transactional(readOnly = true)
    public User get(Long id) {
        return userDao.get(id);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        userDao.delete(id);
    }

}
