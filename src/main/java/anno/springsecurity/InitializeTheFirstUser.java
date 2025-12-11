package anno.springsecurity;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class InitializeTheFirstUser {

    @Bean
    public CommandLineRunner commandLineRunner(UserDetailsRepo userDetailsRepo,
                                               PasswordEncoder passwordEncoder){
        return args -> {
     if (userDetailsRepo.findByUsername("Chetan1").isEmpty()){
         User user = new User();
         user.setUsername("Chetan1");
         user.setPassword(passwordEncoder.encode("Chetan1"));
         user.setRole("Admin");
         userDetailsRepo.save(user);
     }
        };
    }
}
