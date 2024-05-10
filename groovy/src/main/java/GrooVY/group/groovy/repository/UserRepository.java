package GrooVY.group.groovy.repository;

import GrooVY.group.groovy.Entity.Person;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Person,Long>{
    @Query("select p from Person p where p.login=?1 and p.firstPasswd=?2")
    public Person findLoginAndFirstPassword(String login, String firstPassword);

    @Query("select p from Person p where p.login=?1 and p.password=?2")
    Person fingLoginAndPassword(String login,String password);
    @Modifying
    @Transactional
    @Query("update Person p set p.password=?2 where p.login=?1")
    void updatePassword(String login,String password);
}
