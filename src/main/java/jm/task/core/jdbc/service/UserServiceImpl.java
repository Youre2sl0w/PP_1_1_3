package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    UserDaoJDBCImpl userDaoJDBC;

    public UserServiceImpl() {
        userDaoJDBC = new UserDaoJDBCImpl();
    }

    public void createUsersTableQuery() {
        userDaoJDBC.createUsersTableQuery();
        System.out.println("Таблица успешно создана!");
    }

    public void dropUsersTable() {
        userDaoJDBC.dropUsersTable();
        System.out.println("Таблица была удалена");
    }

    public void saveUser(String name, String lastName, byte age) {
        userDaoJDBC.saveUser(name, lastName, age);
        System.out.println("Пользователь " + name + " был добавлен в базу данных");
    }

    public void removeUserById(long id) {
        userDaoJDBC.removeUserById(id);
        System.out.println("Пользователь с id - " + id + " был удалён из таблицы");
    }

    public List<User> getAllUsers() {
        List<User> users =  userDaoJDBC.getAllUsers();
        for (User user : users) {
            System.out.println(user);
        }
        return users;
    }

    public void cleanUsersTable() {
        userDaoJDBC.cleanUsersTable();
        System.out.println("Таблица была очищена!");
    }
}
