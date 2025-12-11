package anno.DI.annotations.primary;

import org.springframework.stereotype.Component;

@Component
public class TestPrimaryComponate {

    private final Testprimary testprimary;


    public TestPrimaryComponate(Testprimary testprimary) {
        this.testprimary = testprimary;
    }

    public String checkwhichIsPrimaryClass(){

        return   testprimary.primaryTest();
    }
}
