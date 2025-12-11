package anno.core.annotations;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class TestValueAnno {

    @Value("${application.id}")
    private  String appid;
}
