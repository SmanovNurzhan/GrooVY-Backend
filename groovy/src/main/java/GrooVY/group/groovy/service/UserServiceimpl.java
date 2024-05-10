package GrooVY.group.groovy.service;

import GrooVY.group.groovy.Entity.Person;
import GrooVY.group.groovy.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceimpl implements UserService{
    private final UserRepository userRepository;
    @Override
    public Person saveUser(Person p) {
        return userRepository.save(p);
    }

    @Override
    public Person findByResetPassword(String login, String firstPassword) {
        return userRepository.findLoginAndFirstPassword(login,firstPassword);
    }

    @Override
    public void updatePassword(String login, String password) {
        userRepository.updatePassword(login,password);
    }

    @Override
    public Person fingLoginAndPassword(String login, String password) {
        return userRepository.fingLoginAndPassword(login,password);
    }

    @Override
    public List<Person> findAll() {
        return userRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
}
