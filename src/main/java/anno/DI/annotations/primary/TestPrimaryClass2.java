package anno.DI.annotations.primary;

import org.springframework.stereotype.Service;

@Service
public class TestPrimaryClass2 implements  Testprimary{
    @Override
    public String primaryTest() {

        return "I am Primary Class 2";
    }
}
