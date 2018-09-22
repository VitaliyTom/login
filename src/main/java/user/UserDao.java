package user;

import user.entity.User;

public interface UserDao {
    void create(User user);
    void update(User user);
    void delete(User user);
    User read(long id);
    User getUserByLogin(String login);
}
