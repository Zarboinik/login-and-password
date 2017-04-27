package foo.bar.service;

import foo.bar.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
