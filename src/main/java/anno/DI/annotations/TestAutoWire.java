package anno.DI.annotations;

import org.springframework.stereotype.Service;

@Service
public class TestAutoWire {

   public String m2(){
     return "I am @Autowired ";
    }
}
