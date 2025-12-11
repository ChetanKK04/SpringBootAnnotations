package anno.web.annotations;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/web/api")
public class WebRestController {

    @RequestMapping(value = "/all",method = {RequestMethod.GET})
   public String   getall(){
     return "RequestMapping class and method";
    }
}
