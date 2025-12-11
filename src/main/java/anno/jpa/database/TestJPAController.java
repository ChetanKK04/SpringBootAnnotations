package anno.jpa.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestJPAController {

    @Autowired
    private  TestJpaServices testJpaServices;

    @PostMapping("jpa")
    public ResponseEntity<JpaUser> cerateJpaUser(@RequestBody  JpaUser jpaUser){
     JpaUser usersave =  testJpaServices.adduser(jpaUser);
        return new ResponseEntity<JpaUser>(usersave, HttpStatus.CREATED);
    }

    @PostMapping("/jpa/auto")
    public ResponseEntity<JpaUserStrategyIDAuto> cerateJpaUserStrategyIDAuto(
            @RequestBody  JpaUserStrategyIDAuto jpaUserStrategyIDAuto){
        JpaUserStrategyIDAuto usersave =  testJpaServices.addJpaUserStrategyIDAuto(jpaUserStrategyIDAuto);
        return new ResponseEntity<JpaUserStrategyIDAuto>(usersave, HttpStatus.CREATED);
    }
}
