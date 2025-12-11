package anno.core.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources(@PropertySource("classpath:additional.properties"))
public class PropertySourcesAnno {

    @Bean
    AdditionalServices additionalServices(){

     return    new AdditionalServices();
    }

}
