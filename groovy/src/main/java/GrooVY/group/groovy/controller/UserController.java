package GrooVY.group.groovy.controller;

import GrooVY.group.groovy.Entity.Person;
import GrooVY.group.groovy.module.findAccount;
import GrooVY.group.groovy.module.signModule;
import GrooVY.group.groovy.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
@AllArgsConstructor
@CrossOrigin
public class UserController {
    private UserService userService;
    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody Person p){
        userService.saveUser(p);
        return ResponseEntity.ok(p);
    }
    @PostMapping("findAcc")
    public ResponseEntity<?> findAcc(@RequestBody findAccount account) {
        String loginOfPerson=account.getLogin();
        String firstPasswordOfPerson=account.getFirstPasswd();
        if(userService.findByResetPassword(loginOfPerson,firstPasswordOfPerson)==null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Аккаунт не найден");
        }else{
            return ResponseEntity.ok(account);
        }
    }

    @PostMapping("resetPassword")
    public ResponseEntity<?> changePassword(@RequestBody signModule signModule) {
        String login=signModule.getLogin();
        String password=signModule.getPassword();
        userService.updatePassword(login,password);
        return ResponseEntity.ok(signModule);
    }

    @PostMapping("signUser")
    public ResponseEntity<?> signUser(@RequestBody signModule signModule) {
        String login=signModule.getLogin();
        String password=signModule.getPassword();
        if(userService.fingLoginAndPassword(login,password)==null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Аккаунт не найден");
        }else {
            return ResponseEntity.ok(signModule);
        }
    }
    @GetMapping("/getUsers")
    public List<Person> getUsers() {
        return userService.findAll();
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id") Long userId) {
        try {
            userService.deleteById(userId);
            return ResponseEntity.ok().body("Пользователь успешно удален");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Ошибка при удалении пользователя: " + e.getMessage());
        }
    }
}
