package anno.core.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfigrationsAnno {


    @Bean
    public TestConfigrationsBeanServices testConfigrationsServices(){

        return new TestConfigrationsBeanServices();
    }

}
