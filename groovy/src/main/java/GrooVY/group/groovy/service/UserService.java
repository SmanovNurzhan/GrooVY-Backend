package GrooVY.group.groovy.service;

import GrooVY.group.groovy.Entity.Person;

import java.util.List;

public interface UserService {
    public Person saveUser(Person p);
    public Person findByResetPassword(String login, String firstPassword);
    void updatePassword(String login,String password);
    Person fingLoginAndPassword(String login,String password);
    List<Person> findAll();
    void deleteById(Long id);
}
