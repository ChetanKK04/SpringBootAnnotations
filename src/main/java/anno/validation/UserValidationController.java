package anno.validation;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserValidationController {

    @PostMapping("/create")
    public ResponseEntity<String> createUser(@Valid @RequestBody  User user) {


        //  userService.saveUser(user);
        return ResponseEntity.ok("User created successfully");
    }
}