package anno.DI.annotations.primary;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class TestPrimaryClass1 implements  Testprimary{
    @Override
    public String primaryTest() {

        return "I am Primary Class 1";
    }
}
