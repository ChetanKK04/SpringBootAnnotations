package anno.springsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @GetMapping("/auth")
    public String authGet(){

        return "I am authGet";
    }
    @GetMapping("/get")
    public String get(){

        return "I am Get";
    }

    @PostMapping("/auth")
    public String authPost(){

        return "I am authPost";
    }

    @PostMapping("/authpost")
    public String Postauth(){

        return "I am Post auth";
    }
}
