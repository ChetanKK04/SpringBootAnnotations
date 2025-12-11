package anno.sterotype.annotations;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControllerAnno {

    public void testControllerAnno(){

        System.out.println("I am a @RestController anno");
    }

}
