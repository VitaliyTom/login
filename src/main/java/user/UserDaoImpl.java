package user;


import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import user.entity.User;

@Component
@Transactional
public class UserDaoImpl implements UserDao{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void create(User user) {
       sessionFactory.getCurrentSession().save(user);
    }

    @Override
    public void update(User user) {
        sessionFactory.getCurrentSession().update(user);
    }

    @Override
    public void delete(User user) {
        sessionFactory.getCurrentSession().delete(user);
    }

    @Override
    public User read(long id) {
        return sessionFactory.getCurrentSession().get(User.class, id);
    }


    // Getting user by login
    @Override
    public User getUserByLogin(String login) {
        //указываем класс и его поля
        //то есть поиск по обьктам по полям
        String userHQL = " FROM User WHERE login = :key";
        Query query = sessionFactory.getCurrentSession().createQuery(userHQL);
        query.setParameter("key", login);

        return (User) query.uniqueResult();
    }
}
