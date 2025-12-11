package anno.core.annotations;

import org.springframework.beans.factory.annotation.Value;

public class AdditionalServices {

    @Value("${additional.user}")
    private String user;

    @Value("${additional.pass}")
    private String pass;

    public  void  userAndPass(){
        System.out.println("User Name :" +user);
        System.out.println("Password Name :" +pass);
    }
}
